package _06_dependencyInjection;

// depedency injection improves the dependency inversion principle further.
// It completely removes the dependency
interface Service{
    void write(String message);
}

class ServiceA implements Service{
    @Override
    public void write(String message){
        System.out.println("Hello World");
    }
}

// no dependency upon ServiceA
class Client{
    private Service myService;

    // injects via the constructor
    public Client(Service service){
        this.myService = service;
    }

    public void doSomething(){
        myService.write("The is a message");
    }

    // injects via set method
    public void setService(Service service){
        this.myService = service;
    }
}

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // injects via the constructor
        client.doSomething(); 

        client.setService(service);
    }
}
