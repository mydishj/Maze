package practice02;

public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		/*
		案例
		办一个需要用二维数组来做出下面

		i = 0 : 	1
		i = 1 : 	2 2
		i = 2 : 	3 3 3

		 */
		//给每个一维数组开辟空间 new
		//如果没有给一维数组 new ，那么arr[i] 就是null
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++){

			arr[i] = new int[i + 1];
			//遍历一维数组，并给一维数组赋值
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1; //赋值
			}
		}
		//遍历arr输出
		for (int i = 0; i < arr.length; i++){
			//输出arr的每个一维数组
			for (int j = 0; j < arr[i].length;j++){
				//输出arr[i][j]
				System.out.print(arr[i][j]);
			}
			System.out.println();//换行
		}

	}
}
