package practice02;

public class YangHuiTrianle02 {
	public static void main(String[] args) {
		/*
		等腰杨辉三角形
		  杨辉三角的规律
		  1.第n行有n个数字.
		  2.每一行的开始和结尾数字都为1. 用二维数组表示就是a[i][0]=1;  a[i][j]=1(当i==j时);
		  3.第n+1行的第i个数字等于第n行的i-1个数字加上第n行的i个数字。用二维数组表示就是 a[i+1][j]=a[i][j-1]+a[i][j];
		思路分析
		1.
		 */
		int rows = 10;
		for (int i = 0; i < rows; i++) {
			int number = 1;
			//打印空格字符串
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				//而关于System.out.format是一种类似于C语言中的输出
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
