package Eulerhacks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Euler001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int div1 = 3, div2 = 5;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String line1 = null;
		line1 = buf.readLine();
		ArrayList<Long> aList = new ArrayList<Long>();
		if (!line1.isEmpty() && !Pattern.matches("[a-zA-Z]+", line1)) {
			int numberOfCases = Integer.valueOf(line1);
			if (numberOfCases > 0 && numberOfCases <= 10000) {

				for (int i = 0; i < numberOfCases; i++) {
					aList.add(Long.valueOf(buf.readLine()));
				}
			} else {
				System.out.println("Invalid input !!");
				System.exit(0);
			}
		} else {
			System.out.println("Invalid input !!");
			System.exit(0);
		}

		Euler001 euler = new Euler001();

		for (int i = 0; i < aList.size(); i++) {
			long temp = aList.get(i);
			if (temp >= 15) {
				System.out.println(euler.sumAll(temp, div1)
						+ euler.sumAll(temp, div2) - euler.sumAll(temp, 15));
			} else {

				System.out.println(euler.sumAll(temp, div1)
						+ euler.sumAll(temp, div2));
			}
		}

		for (int i = 0; i < aList.size(); i++) {
			long temp = aList.get(i);
			System.out.println(euler.sumAllDin(temp, div1)
					+ euler.sumAllDin(temp, div2) - euler.sumAllDin(temp, 15));

		}

	}

	public long sumAll(long max, int divisor) {
		int firstnaturalnumber = divisor;
		int level1 = 2 * firstnaturalnumber; // 2a
		// System.out.println(level1);
		long actualn = max - 1;
		// System.out.println(actualn / divisor);
		actualn = actualn / divisor;
		long level3 = actualn - 1; // n-1
		// System.out.println(level3);
		long level2 = level3 * divisor; // (n-1)d
		// System.out.println(level2);
		long level0 = (long) level1 + level2;
		// System.out.println(level0);
		float newx = (float) actualn / 2;
		// System.out.println(newx);
		System.out.println((long) (newx * level0));
		return (long) (newx * level0);
	}

	public long sumAllDin(long max, int divisor) {
		double n = (max - 1) / divisor;
		double ap = (n / 2) * ((2 * divisor) + (n - 1) * divisor);
		System.out.println((long) ap);
		return (long) ap;
	}

}
