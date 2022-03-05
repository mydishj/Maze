package practice02;

public class TwoDmiensionalArray03 {
	public static void main(String[] args) {
		/*
		案例
		int arr[][] = {{4,6},{1,2,4,5,2},{-1}};遍历该二维数组，并得到和
		思路分析
		1.遍历二维数组，并将各个值累计到sum即可
		 */
		int arr[][] = {{4,6},{1,2,4,5,2},{-1}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
			sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
