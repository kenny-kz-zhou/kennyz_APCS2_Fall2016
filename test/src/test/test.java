package test;

public class test {
	public static String swapPairs(String string1){
		int n = string1.length();
		char char1 = ' ';
		char char2 = ' ';
		String returnString = "";
		if (n % 2 == 0){
			for (int i = 0; i < n; i += 2){
				char1 = string1.charAt(i);
				char2 = string1.charAt(i + 1);
				returnString += char1 + char2;
			}
		}else{
			for (int i = 0; i < n; i += 2){
				char1 = string1.charAt(i);
				char2 = string1.charAt(i + 1);
				returnString += char1 + char2;
			}
			returnString += string1.charAt(n - 1);	
		}
		return(returnString);
	}
}
	

public static void main(String[] args) {
	swapPairs("hello");
}
