import java.util.Arrays;

public class LotsOfCopies {
	public static void main (String[] args){
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
	}
	public static void changeMe(int x, String str, int[] arr){
		System.out.println(x);
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
	}
}
