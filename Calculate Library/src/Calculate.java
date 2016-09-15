/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {

	public static int square(int sqrNum){
		return (sqrNum * sqrNum);
	}
	
	public static int cube(int cubeNum){
		return (cubeNum * cubeNum * cubeNum);
	}
	
	public static double avg(double avg1, double avg2){
		double add = avg1 + avg2;
		return (add / 2);
	}
	
	public static double avg(double avg1, double avg2, double avg3){
		double add = avg1 + avg2 + avg3;
		return (add / 3);
	}
	
	public static double toDegrees(double radian){
		double conversion = 180/3.14159;
		return (radian * conversion);
	}

	public static double toRadians(double degree){
		double conversion = 3.14159/180;
		return (degree * conversion);
	}

	public static double discriminant(double a, double b, double c){
		double bVal = b * b;
		double scndPart = 4 * a * c;
		return (bVal - scndPart);
	}
	
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		int imprprNumrtr = denominator * wholeNum + numerator;
		return (imprprNumrtr + "/" + denominator);
	}
	
	public static String toMixedNum(int imprprNum, int denominator){
		int numerator = imprprNum % denominator;
		int wholeNum = imprprNum / denominator;
		return (wholeNum + " " + numerator + "/" + denominator);
	}
	
	public static String foil(int A, int B, int C, int D, String n){
		int first = A * C;
		int second = A * D + B * B;
		int third = B * D;
		return (first + n + "^2" + second +  + third);
	}
	
	public static boolean isDivisibleBy(int num1, int num2){
		return(num1 % num2 == 0);
		}
	public static double absValue(double givenNum){
		if (givenNum <= 0){
			return(givenNum * -1);
		}else{
			return(givenNum);
		}
	}
	
	public static int max(int num1, int num2){
		if(num1 > num2){
			return (num1);
		}else{
			return (num2);
		}
	}
	public static double max (double num1, double num2, double num3){
		int maximum = Calculate.max((int) num1, (int)num2);
			if (maximum > num3){
				return(maximum);
			}else{
				return(num3);
		}
	}
	public static int min(int num1, int num2){
		if(num1 >= num2){
			return num2;
		}else{
			return num1;
		}
	}
	public static double round2(double num1){
		num1 = num1 * 100;
		num1 += .5;
		num1 = (int)num1;
		return (num1/100);
	}
	public static double exponent(int base, double power){
	  double answer = 1.0;		
	  if (power == 0){
			return (1);
	  }
		for (int k = 1; k <= power; k++){
			answer *= base;
		}
		return(answer);
	}
	public static int factorial (int fact){
		int answer = 1;
		if (fact == 0){
			return(1);
		}
		for(int i = 1; i <= fact; i++){
			answer *= i;
		}
		return answer;
	}
	public static boolean isPrime(int number){
		boolean check;
		for (int k = number - 1; k > 1; k--){
			check = Calculate.isDivisibleBy(number, k);
			if(check == true){
				return(false);
			}
		}
		return(true);		
	}
	public static int gcf(int num1, int num2){
		while(num2 != 0){
			int num3 = num1;
			num1 = num2;
			num2 = num2 % num3;
		}
		return (num1);
	}
	public static double sqrt(double num1){
//		double k = num1;
//		double squareRoot = num1 /2;
		for(double n = num1;;n -= 0.01){
					if(n*n == num1){
						return n;
		}
//			k = squareRoot;
//			squareRoot = (k + (n/k))/2;
//			return squareRoot;
//		}
		}
//		double squareRoot = num1 /2;
//		for(double n = squareRoot; n > 0; n -= 0.01){
//			squareRoot
//			
//		}
			
		}}
