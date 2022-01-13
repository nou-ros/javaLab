package _05_dependencyInversion;

// details should be depend upon abstractions
// high-level classes and low-level classes should depend upon abstractions


interface DBConnectionInterface{
    public int connect();
}

// MySqlConnection is low level class 
class MySqlConnection implements DBConnectionInterface{
    public int connect(){
        return 1;
    }
}

// high level class
class PassWordReminder{
    private DBConnectionInterface dbConnection;
    public PassWordReminder(DBConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }

}

public class DependencyInversion {
    public static void main(String[] args) {
       // Dependency Inversion
    }
}
