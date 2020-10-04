package Abstaction;

public class Twowheelr extends Vehicle1 {

	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>120)
		{
			System.err.println("Two wheeler speed not exceed 120kmp");
		}else{
			Constants.maxSpeed=maxSpeed;
		}
		return Constants.maxSpeed;
	}

	/*public void setTwowheelrSpeed()
	{
		
	}*/

}
