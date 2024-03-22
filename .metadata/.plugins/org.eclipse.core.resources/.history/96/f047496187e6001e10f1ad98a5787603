import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {

		int data[] = new int[1000];
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = random.nextInt(1000);
		}

		InsertionSort(data, 1000);

		for (int i = 0; i < 998; i++) {
			if (data[i] > data[i + 1])
				System.out.println("Error");
			System.out.println(data[i]);
		}
	}

	public static void InsertionSort(int[] data, int a) {
		for (int i = 1; i < a; i++) {
			int j;
			int temp = data[i];
			for (j = i; j > 0 && data[j - 1] > temp; j--) {
				data[j] = data[j - 1];
			}
			data[j] = temp;
		}
	}

}
