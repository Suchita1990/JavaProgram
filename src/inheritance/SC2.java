package inheritance;

class SC2 extends SC1
{
	public SC2()
	{ 
		//super();//it will call default constructor of super(parent) class
		System.out.println("In Constructor SC2");
	}
      public SC2(int i)
      {
    	  super(i); //for parent class parameterised constructor 
    	  System.out.println("In Costructor B Parametr costructor");
      }
}
