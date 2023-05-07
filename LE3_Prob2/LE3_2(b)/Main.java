public class Main
{
	public static void main(String[] args) 
	{
		Testable t=new Test();
		t.display();
		Test t1=new AbsTest();
		t1.display();
		Testable t2=new AbsTest();
		t2.display();
	}
}
