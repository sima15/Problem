
public class Problem3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] allNums = new boolean[(int) 600851475143L];
		
		for (long i=0; i<600851475143L; i++ ){
			allNums[(int) i] = true;
		}
		
		for (int i=0; i<Math.sqrt(600851475143L); i++ ){
			if(allNums[i]==true){
				for(long j=i*i; j<=600851475143L; j+=i){
					allNums[(int) j]=false;
				}
			}
			
		}
		
		for(long j=600851475143L; j>0; j--){
			if(allNums[(int) j]==true)System.out.println(j);break;
		}
		
		

	}

}
