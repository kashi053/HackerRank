package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwapArraySorted {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] a) {
		
		int[] sorted = a.clone();
		Arrays.sort(sorted);
		int ans = 0;
		Map<Integer, Integer> value2index = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			value2index.put(a[i], i);
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != sorted[i]) {

				// Find the position of value sorted[i] in the input array
				int position = value2index.get(sorted[i]);

				// Swap sorted[i] with a[i]
				swap(a, i, position);

				// Update the position of a[position] in the value2index map
				value2index.put(a[position], position);

				// Increment swap count
				ans++;
			}
		}

		return ans;
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
