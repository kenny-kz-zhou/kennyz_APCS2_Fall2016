/**
 * 
 */

/**
 * @author APCS2
 *	Name: Kenny Zhou
 *  Date: 10/20/16
 * 
 *
 */
public class Calculate {

	public static int square(int sqrNum){ // Squares given number
		return (sqrNum * sqrNum);
	}
	
	public static int cube(int cubeNum){ // Cubes given number
		return (cubeNum * cubeNum * cubeNum);
	}
	
	public static double average(double avg1, double avg2){ // Takes the average of 2 given doubles
		double add = avg1 + avg2;
		return (add / 2);
	}
	
	public static double average(double avg1, double avg2, double avg3){ // Overloads average and takes the average of 3 given doubles
		double add = avg1 + avg2 + avg3;
		return (add / 3);
	}
	
	public static double toDegrees(double radian){ // Takes a radian where pi == 3.14159 and changes it to a degree
		double conversion = 180/3.14159;
		return (radian * conversion);
	}

	public static double toRadians(double degree){ // Takes a degree and turns it into radians (in decimal form)
		double conversion = 3.14159/180;
		return (degree * conversion);
	}

	public static double discriminant(double a, double b, double c){ // Finds the discriminant of 3 doubles. a == squared x term, b == x term, c == constant
		double bVal = b * b;
		double scndPart = 4 * a * c;
		return (bVal - scndPart);
	}
	
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){ // Takes a whole number and a fraction to turn it into an improper fraction
		int imprprNumrtr = denominator * wholeNum + numerator;
		return (imprprNumrtr + "/" + denominator);
	}
	
	public static String toMixedNum(int imprprNum, int denominator){ // Takes an improper fraction and changes it into a mixed number
		int numerator = imprprNum % denominator;
		int wholeNum = imprprNum / denominator;
		if (numerator == 0){
			return(wholeNum + "");
		}else{
			return (wholeNum + "_" + numerator + "/" + denominator);
		}
	}
	
	public static String foil(int numA, int numB, int numC, int numD, String n){        //converts a binomial multiplication form to a quadratic equation
        int letterA = numA * numC;
        int letterB = numC * numB + numA * numD;
        int letterC = numB * numD;

        return(letterA + n + "^2 + " + letterB + n + " + " + letterC);
    }
	
	public static boolean isDivisibleBy(int num1, int num2){ // Checks if a number is evenly divisible by another number
		if (num2 == 0){
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		return(num1 % num2 == 0);
		}
	public static double absValue(double givenNum){ // Finds the absolute value of a number
		if (givenNum <= 0){
			return(givenNum * -1);
		}else{
			return(givenNum);
		}
	}
	
	public static int max(int num1, int num2){ // Finds the largest number out of 2 given numbers
		if(num1 >= num2){
			return (num1);
		}else{
			return (num2);
		}
	}
	public static double max (double num1, double num2, double num3){ // Finds the largest number out of 3 given numbers
		int maximum = Calculate.max((int) num1, (int)num2);
			if (maximum >= num3){
				return(maximum);
			}else{
				return(num3);
		}
	}
	public static int min(int num1, int num2){ // Finds the smallest number out of 2
		if(num1 >= num2){
			return num2;
		}else{
			return num1;
		}
	}
	public static double round2(double num1){ // Rounds a large decimal to 2 places
		if (num1 >= 0){
			num1 = num1 * 100;
			num1 += .5;
			num1 = (int)num1;
			return (num1/100);
		}else{
			num1 = num1 * 100;
			num1 -= .5;
			num1 = (int)num1;
			return (num1/100);		
		}
	}
	public static double exponent(double base, int power){ // Increases a number to its power
		if (power < 0){
			throw new IllegalArgumentException("Power must be positive");
		}
	  double answer = 1.0;		
	  if (power == 0){ // Anything to the zeroth power is 1
			return (1);
	  }
		for (int k = 1; k <= power; k++){
			answer *= base;
		}
		return(answer);
	}
	public static int factorial (int fact){ // Finds the factorial of a number
		 if (fact < 0){
	            throw new IllegalArgumentException("Number for factorial must be positive."); // Factorials must be positive
	        }
		int answer = 1;
		if (fact == 0){ // The factorial of 0 is always 1
			return(1);
		}
		for(int i = 1; i <= fact; i++){
			answer *= i;
		}
		return answer;
	}
	public static boolean isPrime(int number){ // Checks if a number is prime or not
		boolean check;
		for (int k = number - 1; k > 1; k--){
			check = Calculate.isDivisibleBy(number, k);
			if(check == true){
				return(false);
			}
		}
		return(true);		
	}
	public static int gcf(int a, int b){ // Finds the greatest common factor for 2 integers
        int gcf=1;
        for(int i=1;i<=a;i++){
            if(isDivisibleBy(a,i) && isDivisibleBy(b,i)){
                gcf=i;
            }
        }
        return(gcf);
    }
	public static double sqrt(double num1){ // Finds the square root of a number
		if (num1 < 0){
			throw new IllegalArgumentException("Number must be positive"); // Cannot find the Square Root of a number
		}
		for(double k = 0.01; k <= num1; k += 0.01){
			double multiply = k * k;
				if (Calculate.absValue(multiply - num1) <= .05){
					return Calculate.round2(k);
				} 
		}
		return num1;
	}
    public static String quadForm(int a, int b, int c){ // Takes 3 integers and plugs them into the quadratic formula
        double root1;
        double root2;
        int discrim = (int) Calculate.discriminant(a, b, c);
        if (discrim < 0){
            return ("no real roots");
        }
        if (discrim == 0){
            root1 = b * (-1) / (2 * a);
            root1 = Calculate.round2(root1);
            return ("The root is: " + root1);
        }
        if (discrim > 0){
            root1 = (b * (-1) + sqrt(discrim)) / (2 * a);
            root1 = Calculate.round2(root1);
            root2 = (b * (-1) - sqrt(discrim)) / (2 * a);
            root2 = Calculate.round2(root2);
            double min = Calculate.min((int) root1, (int) root2);
            double max = Calculate.max((int) root1, (int) root2);
            return ("The roots are: " + min + " and " + max);
        }
        return ("");
	}
}