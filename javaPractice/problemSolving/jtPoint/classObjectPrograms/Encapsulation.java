class Encapsulate{
	private String systemName;
	private int systemID;
	private int systemAge;
	
	public int getAge() { return systemAge; }
	
	public String getName() { return systemName; }
	
	public int getID() { return systemID; }
	
	public void setSystemAge(int newAge) { systemAge = newAge; }
	
	public void setSystemName(String systemName) { this.systemName = systemName; }
	
	public void setSystemID(int newID) { systemID = newID; }
}


public class Encapsulation{
	public static void main(String args[]){
		Encapsulate obj = new Encapsulate();
		obj.setSystemName("RedHat");
		obj.setSystemAge(28);
		obj.setSystemID(9);

		System.out.println(obj.getName());
		System.out.println(obj.getID());
		System.out.println(obj.getAge());
	}
}
