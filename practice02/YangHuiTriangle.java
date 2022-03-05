package practice02;

public class YangHuiTriangle {
	public static void main(String[] args) {
		/*
		案例
		使用二维数组打印一个10行的杨辉三角
		1
		12
		121
		1231
		12341
		.....
		思路分析
		1.第一行有1个元素，第n行有n个元素，
		2.第一行的第一个元素和最后一个元素都是1
		3.从第三行开始，对于非第一个元素和最后一个元素的元素的值。arr[i][j]
		  arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
		 */
		int[][] arr = new int[10][2];
		for (int i = 0; i < arr.length; i++){
			arr[i] = new int[i + 1];
			//遍历一维数组，并给一维数组赋值
			for (int j = 0; j < arr[i].length; j++){
				//每一行的第一个元素和最后一个元素都是1
				if ( j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1;
				}else{//中间的元素
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}//输出杨辉三角
		for (int i = 0; i < arr.length;i++){
			for (int j = 0; j < arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
