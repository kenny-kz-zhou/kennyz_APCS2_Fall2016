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
		int wholeNum = imprprNum / denominator;
		int numerator = denominator * wholeNum - imprprNum;
		return (wholeNum + denominator + "/" + numerator);	
	}
	public static String foil(int ax2, int bx, int c){
}