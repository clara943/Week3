package SmallNum;

public class ZeroCount {

	public static void main(String[] args) {
		int[] num = { 4, 3, 0, 0 };
		int count = 0;
		boolean[] zeroIndex = new boolean[4];

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				count++;
				zeroIndex[i] = true;

			}

		}
		System.out.println(count);
		for (int i = 0; i < zeroIndex.length; i++) {
			System.out.println(zeroIndex[i]);
		}

	}

}
