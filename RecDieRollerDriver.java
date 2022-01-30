/**
 * 
 * 
 * This class is the test class for the RecDieRoller class. This class finds the average amount of times the dice lands on two out of a thousand
 * @author Andrew Gordon
 *
 * CS215ON
 */
public class RecDieRollerDriver{
	static double NumberofTwos;
	static double avg;
	public static void main(String[] args) {
		RecDieRoller dieRoller=new RecDieRoller();
		NumberofTwos=dieRoller.roll();
		avg=NumberofTwos/1000;
		System.out.print("Average die rolls to get a two: "+avg);
	}

}
