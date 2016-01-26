package Eulerhacks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Euler004 {

	public int largest = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String line1 = null;
		 
		line1 = buf.readLine();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		if (!line1.isEmpty()) {
			int numberOfCases = Integer.valueOf(line1);
			if (numberOfCases > 0 && numberOfCases <= 100) {

				for (int i = 0; i < numberOfCases; i++) {

					aList.add(Integer.valueOf(buf.readLine()));

				}
			} else {
				System.out.println("Invalid input !!");
				System.exit(0);
			}

			Euler004 sol=new Euler004();
			int maxUntilNow=0;int currentProd=0,boundary=0;
			for (int k = 0; k < numberOfCases; k++) {
				boundary=aList.get(k);
				for(int i=100;i<1000;i++){
					for(int j=100;j<1000;j++){
						if((i*j)<boundary){
						if(sol.checkPalindrome(i*j)){
							currentProd=i*j;
                          if(currentProd > maxUntilNow){
                        	  maxUntilNow=currentProd;
                          }
                          
						}}
						
						
					}
					
				}
			}
			System.out.println(maxUntilNow);
		}else{

			System.out.println("Invalid input !!");
			System.exit(0);
		}


	}


	public boolean isLargest(int large){
		if (large > largest){
			largest=large;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkPalindrome(int num){
		int n = num; //used at last time check
		int reverse=0,remainder;
		while(num > 0){
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if(reverse == n)
			return true;
		else{
			return false;
		}

	}

}
