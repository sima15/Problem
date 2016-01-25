
public class Problem4 {

	public static void main(String[] args) {
		//
		int result =0;	
		Boolean palindrome = false;
		int BiggestPalindrome = 0;
		for (int k= 999;k >=100 && palindrome == false ;k--){
			for (int i=k; i>=100; i--){
				result = k*i;
				String strResult = String.valueOf(result);
				int length = strResult.length();
				for (int j=0; j<(length-1); j++){
					if (strResult.charAt(j)!=strResult.charAt(length-1-j)) {
						palindrome = false;
						break;				
					}
					if (j== 3){
						palindrome = true;
						BiggestPalindrome = result;
						break;}
	
				}
			}
		}
		System.out.println(BiggestPalindrome);

	}

}
