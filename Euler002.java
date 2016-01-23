package Eulerhacks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Euler002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String line1 = null;
		line1 = buf.readLine();
		ArrayList<Long> aList = new ArrayList<Long>();
		if (!line1.isEmpty()) {
			int numberOfCases = Integer.valueOf(line1);
			if (numberOfCases > 0 && numberOfCases <= 10000) {

				for (int i = 0; i < numberOfCases; i++) {

					aList.add(Long.valueOf(buf.readLine()));

				}
			} else {
				System.out.println("Invalid input !!");
				System.exit(0);
			}


			Euler002 euler = new Euler002();

			for (int i = 0; i < aList.size(); i++) {
				long temp = aList.get(i);
				System.out.println(euler.fibo(temp));
				System.out.println(euler.fiboAdd(temp));
			}

		}else{
			System.out.println("Invalid input !!");
			System.exit(0);
		}

	}

	public long fiboAdd(long until){
		long n_minus_2 = 0;
		long n_minus_1 = 1;
		long result = 0;
		long n = 1;
		while (n <= until) {
			if (n % 2 == 0) {
				result = result + n;
			}
			n = n_minus_2 + n_minus_1;
			n_minus_2 = n_minus_1;
			n_minus_1 = n;
		}
		return result;
	}

	
	public long fibo(long until){
		long[] feb = new long[100];
		feb[0] = 0;
		feb[1] = 1;
		long result=0;
		for(int i=2; i < until; i++){

			if((feb[i-1] + feb[i-2]) > until){
				break;
			}else{
				feb[i] = feb[i-1] + feb[i-2];
				if(feb[i] % 2 ==0){
					result=result+feb[i];
				}
			}
		}


		return result;


	}
	
}
