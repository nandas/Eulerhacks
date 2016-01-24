import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Euler003 {

	public static void main(String[] args) throws IOException {

		
		// TODO Auto-generated method stub

		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String line1 = null;
		line1 = buf.readLine();
		ArrayList<Long> aList = new ArrayList<Long>();
		if (!line1.isEmpty()) {
			int numberOfCases = Integer.valueOf(line1);
			if (numberOfCases > 0 && numberOfCases <= 10) {

				for (int i = 0; i < numberOfCases; i++) {

					aList.add(Long.valueOf(buf.readLine()));

				}
			} else {
				System.out.println("Invalid input !!");
				System.exit(0);
			}
			
			Euler003 euler = new Euler003();

			for (int i = 0; i < aList.size(); i++) {
				long temp = aList.get(i);
				System.out.println(euler.findBiggestPF(temp));
				
			}


		}else{
			System.out.println("Invalid input !!");
			System.exit(0);
		}

	}

	public int findBiggestPF(long temp){
		
		while(temp % 2 == 0){
			temp/=2;
			//System.out.println(temp);
		}
		
		for (int i = 3; i <= Math.sqrt(temp); i = i+2)
	    {
	        // While i divides n, print i and divide n
	        while (temp%i == 0)
	        {
	            
	           temp/= i;
	           //System.out.println(temp);
	        }
	    }
		
		if(temp > 2){
			//System.out.println(temp);
		}
	 
		
		return (int)temp;
	}
}
