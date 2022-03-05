package example;

public class Homework07 {
	public static void main(String[] args) {
		/*
		冒泡排序
		 */
		int[] arr = {1, 20, 99,88, 40, 11, 23};
		int pmet = 0;
		for (int i = 0; i < arr.length - 1; i++) { //外层循环
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					pmet = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = pmet;
				}
			}
			System.out.print("第" + (i + 1) + "轮" + " ");
			for (int j = 0;j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}