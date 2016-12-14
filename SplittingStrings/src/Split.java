import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) {
		apple();
//		bread("applespineapplesbreadlettucetomatobaconmayohambreadcheese");
	}
	
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

	public static String apple(){
	String apples = "I reallyreally like apples";
	String[] newApples = apples.split("really");
	System.out.println(Arrays.toString(newApples));
	return(Arrays.toString(newApples));
	}
		
	
	public static void firstPart(String s){
		int bread1 = s.indexOf("bread") + 5;
		String bread2 = s.substring(bread1);
		String noBread = bread2.substring(bread2.indexOf(bread1) + 1, bread2.indexOf("bread"));
		String [] sandwich = noBread.split("bread");
		System.out.println(Arrays.toString(sandwich));
	}
	public static void secondPart(String foodIngredients){
		int numberBreads = 0;
		String howManyBread = foodIngredients;
		while(howManyBread.indexOf("bread") != -1){
			int indexOfBread = howManyBread.indexOf("bread");
			howManyBread = howManyBread.substring(indexOfBread+4);
			numberBreads++;
			}
//		if(numberBreads < 2){
//			System.out.println("Not a sandwich");
		if(numberBreads == 3){
			int bread1 = foodIngredients.indexOf("bread") + 6;
			String afterBread1 = foodIngredients.substring(bread1);
			String bread2 = afterBread1.substring(afterBread1.indexOf(bread1) + 1, afterBread1.indexOf("bread"));
			String [] firstHalf = bread2.split(" ");
			int bread = bread2.indexOf("bread") + 6;
			String afterBread2 = bread2.substring(bread);
			String bread3 = afterBread2.substring(afterBread2.indexOf(afterBread2) + 1, afterBread2.indexOf("bread"));
			String [] secondHalf = bread3.split(" ");
			System.out.println(Arrays.toString(firstHalf) + Arrays.toString(secondHalf));
	}else{
		int bread1 = foodIngredients.indexOf("bread") + 6;
		String afterBread1 = foodIngredients.substring(bread1);
		String inside = afterBread1.substring(afterBread1.indexOf(bread1)+1, afterBread1.indexOf("bread"));
		String [] sandwich = inside.split(" ");
		System.out.println(Arrays.toString(sandwich));
		}
	}
}


//	public static String bread(String string){
//																			//is it a sandwich?
//		if (string.indexOf("bread") == -1){									//check if there is 
//			throw new IllegalArgumentException ("Not a Sandwich");
//		}
//		if (string.substring(0,5) != "bread"){  							// checks if the string starts with "bread"
//		if (string.substring(string.length()-5, string.length()) == "bread"){
//        int firstBread = string.indexOf("bread");							//finds the first "bread"
//        String noPreBread = string.substring(firstBread); 					//substrings the given string to start with "bread"
//        int addBreadLength = firstBread + 5;								// add 5 to skip the first "bread" for a new substring
//        String skipFirstBread = noPreBread.substring(addBreadLength);		//substring without the first bread --> find second "bread"
//        int lastBread = skipFirstBread.indexOf("bread");					//finds the index of the second "bread"
//        string = string.substring(firstBread, lastBread + 4);				//substring of the 2 bread values --> trims off everything outside bread
//        String[] newString = string.split("bread");							//split the newString with bread to find ingredients inside
//        System.out.println(Arrays.toString(newString));
//        return (Arrays.toString(newString));
//		}
//    }