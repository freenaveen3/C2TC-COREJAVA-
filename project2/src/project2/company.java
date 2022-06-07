package project2;

public class company {
	String name;
	public static void main (String[]args) {
		Comany c = new company ();
		company c1 = c; c1.name = "c2tc";
		c = null; 
		Systm.out.printin(c.name);
	}
}
