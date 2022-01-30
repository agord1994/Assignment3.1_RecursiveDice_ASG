/**
 * 
 * 
 * This class instantiates a RecDieRoller.This simulates rolling a 1000 dice and counting up the and counting up the times the face of the die is on 2
 * @author Andrew Gordon
 *
 * CS215ON
 */



import java.util.Random;

public class RecDieRoller {

	int faceValue;
	int count=0;
	double avg;
	int timesRolled=0;
	
	/** Method to roll the dice 1000 times and count up the times 2 is shown
	* @return count the number of times two is rolled out of a thousand trys
	* 
	*/
	public double roll() {
	Random r= new Random();
	faceValue=r.nextInt(6);
	faceValue++;
	timesRolled++;
	
	if(faceValue==2) {
		++count;
	}

	
	if( timesRolled<1000) {
		roll();	
		
		
	}
	return count;


	}//end roll


	
}//end class
