package Abstaction;

public class Threewhlr extends Vehicle1 {

	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>70)
		{
			System.err.println("Three wheeler speed should not exceed 70kmph");
			
		}else
		{
			Constants.maxSpeed=maxSpeed;
		}
		return Constants.maxSpeed;
	}
	//max speed should not exceed limit of 70kmph

}
