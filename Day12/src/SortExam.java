
public class SortExam {

	public static void main(String[] args) {

		int data[] = { 90, 78, 100, 30, 55 };

		bubbleSort(data);

		for (int i : data) {
			System.out.print(i + " ");
		}
	}

	public static void bubbleSort(int[] data) {
		int exchg = 0;
		int forcount = 0;

		for (int j = 0; j < 4; j++) {

			for (int i = 4; i > j; i--) {
				if (data[i - 1] > data[i]) {
					int temp = data[i - 1];
					data[i - 1] = data[i];
					data[i] = temp;

					exchg++;
				}

				forcount++;
			}

		}
		System.out.println("반복문횟수: " + forcount);
		System.out.println("교환횟수: " + exchg);
	}
}
