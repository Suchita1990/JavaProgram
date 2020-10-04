package Abstaction;

public class Fourwhlr extends Vehicle1 {

	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>250)
	{
		System.err.println("Four wheeler speed should not exceed 250");
	}
	else 
	{
		Constants.maxSpeed=maxSpeed;
	}
		return maxSpeed;
}
	
	/*public int setThreewhlrSpeed()
	{
		return Constants.maxSpeed==220;
	}*/

}
