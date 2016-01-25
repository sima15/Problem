
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0L;
		long sumSq = 0L;
		long square = 0L;
		
		for (int i=1; i<=100; i++){
			sum += i;
			square += i*i;
		}
		
		sumSq = sum* sum;
		System.out.println(sumSq-square);
		

	}

}
