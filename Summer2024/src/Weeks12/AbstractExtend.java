package Weeks12;

public class AbstractExtend  extends AbstractTest{
	String add = "extended";

	public String toString() {
		return getString();
	}
	
	public void addString(String a) {
		System.out.println(a + add);
	}
}
