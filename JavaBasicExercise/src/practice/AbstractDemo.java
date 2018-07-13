package practice;

public class AbstractDemo {

	public static void main(String[] args) {
		TestAbstract2 abstract2 = new TestAbstract2("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		TestAbstract abstract1 = new TestAbstract2("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("Call mailCheck using TestAbstract2 reference --");
		abstract2.mailCheck();
	    System.out.println("\n Call mailCheck using TestAbstract reference--");
	    abstract1.mailCheck();
	    
	    System.out.println("\n Employee class compute pay--");
	    Employee e = new Student();
	    e.setName("Hello Kitty");
	    e.computePay();
	    
	    
	    int a[]={5,1,6,2,4,3};
	    int i;
	    int j;
	    for (i=1; i<6;i++) {
	    	
	    }
	}
}
