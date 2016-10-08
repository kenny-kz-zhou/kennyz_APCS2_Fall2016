/**
 * 
 */

/**
 * @author Kenny Zhou
@period 2
@date  9/29/16
 *
 */

import java.util.*;
public class CollabProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Prompts user and checks how many integers
		Scanner howMany = new Scanner(System.in);
		System.out.println("How many integers do you have?");
// Takes in first integer and prompts user.
		Scanner addNums = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int evenSum = 0;
		int evenMax = 0;
		int min = addNums.nextInt();
		int max = min;
		int inputNum = min;
// If the initial input digit is even, it adds it to the totals.
// Otherwise it ignores this
		if (inputNum % 2 == 0){
			evenSum += inputNum;
			inputNum = evenMax;
		}
// The loops prompts user for more integers until the initially stated number of integers is reached
		for (int i = 1; i <= howMany.nextInt(); i++){
			System.out.println("Enter an integer.");
			inputNum = addNums.nextInt();
// Tests to see which values should be saved for min and max
			if (inputNum < min){
				min = inputNum;
			}else{
				max = inputNum;
			}
// Tests to see if integer is even, then adds and updates values.
			if (inputNum % 2 == 0){
				evenSum += inputNum;
				evenMax = inputNum;
			}
			
		}
// Returns results
	System.out.println("The minimum is: " + min);
	System.out.println("The maximum is: " + max);
	System.out.println("The sum of all even numbers is: " + evenSum);
	howMany.close();
	addNums.close();
	}
}
