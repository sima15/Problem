
public class Euler41 {
	static boolean palindrome = false;
	static void Pal(int i, int j){
		int num = i*j;
		int[] number = new int[6];
		
		for(int k=0; k<=5; k++){
			number[5-k] = num%10;
			num = num/10;
		}
		
		for (int m=0; m<=3; m++){
			if(number[m]==number[5-m]){
				if(m==3)palindrome=true;
			}else palindrome= false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=999; i>=100; i--){
			for(int j=999; j>=100; j--){
				Pal(i,j);
				if(palindrome==true) System.out.println(i+", "+j+", "+ i*j);
				break;
			}
		}

	}

}
