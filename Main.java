
public class Main {

	public static void main(String[] args) {
		System.out.println(palindrome("raceca"));

	}
	public static boolean palindrome(String input){
		if(input.length()==0 || input.length() ==1) {
			return true;
		}
		if(input.charAt(0)==input.charAt(input.length()-1)) {
			return palindrome(input.substring(1,input.length()-1));
		}
		
		
		return false;
		
	}
	
}
