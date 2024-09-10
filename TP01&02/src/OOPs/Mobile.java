package OOPs;

public class Mobile {

	String model;
	
	Mobile(String model){
		this.model=model;
	}
}

class Mobile1 extends Mobile
{
	String model;
	
	Mobile1(String model)
	{
		super(model);
	}
	
	public void print()
	{
		System.out.println(super.model);
		System.out.println(model);
	}
}