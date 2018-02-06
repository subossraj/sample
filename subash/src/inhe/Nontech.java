package inhe;

public class Nontech extends Empl
{
	
	static float sal;
	
	public void nontechsal()
	{
		Nontech t = new Nontech();
		sal = t.bsal + t.bsal*20/100;
		System.out.println(sal);
	}

}
