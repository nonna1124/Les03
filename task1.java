package by.htp.les02.main;

public class task1 {
	public static void main(String[] args) {
		int n = 5;
		int k = 5;
		int[] A = new int[n];
		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			A[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < A.length; i++) {

			System.out.print(A[i] + " , ");
		}

		for (int i = 0; i < A.length; i++) {

			if (A[i] % k == 0) {
				
				sum = sum + A[i];
			}
		}
		System.out.println();

		if (sum == 0) {
			System.out.println("Нет чисел, кратных " + k);
		} else
			System.out.print("sum=" + sum);
	}
}
