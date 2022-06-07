package project2;

public class company {
	String name;
	public static void main (String[]args) {
		company c = new company ();
		company c1 = c; c1.name = "c2tc";
		c = null; 
		System.out.println(c.name);
	}
}
