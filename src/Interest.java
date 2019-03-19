/*
 * Program to calculate simple interest and compound interest
 * 
 * 
 */
public class Interest {
	/**
	 * Method to calculate simple Interest	
	 * @param principleAmount
	 * @param rateOfInterest
	 * @param time
	 * @return
	 */
	public double SimpleInterest(float principleAmount,float rateOfInterest,float time)
	{
		return (principleAmount*rateOfInterest*time)/100;
	}
	/**
	 * Method to calculate Compound Interest
	 * @param principleAmount
	 * @param rateOfInterest
	 * @param time
	 * @return
	 */
	public double CompoundInterest(float principleAmount,float rateOfInterest,float time)
	{
		return principleAmount*(Math.pow((1+rateOfInterest/100), time));
	}
}
