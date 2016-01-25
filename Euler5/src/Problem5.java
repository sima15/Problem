
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1;
		for(int i=2; i<=20; i=i+2){
			if((float)number%i!=0) {
				number++;
				continue;
			}
			
			if(i==20){
				System.out.println(number);
				break;
			}
		}

	}

}
