package inheritance;

public class Parent extends Object{
	
	int pid=100;
	
	public Parent() {
		super(); //Object();
		System.out.println("Parent() is called obj created");
	}
	
	public void methodOne() {
		System.out.println("methodOne() from Parent..");
	}

}