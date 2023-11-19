package inheritance;

public class Child extends Parent{

	int cid=99;
	
	public Child() {
		super(); //Parent();
		System.out.println("Child() is called obj created..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c = new Child();
		
		System.out.println(c.cid);
		
		System.out.println(c.pid);

		System.out.println(c);
		
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		super.methodOne();
	}

}