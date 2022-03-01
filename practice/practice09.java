package practice;

public class practice09 {
	public static void main(String[] args) {
		/*
		*案例
		*  求（1）+（1+2）+（1+2+3）+.....（1+2+3+....+100）的结果
		*
		* 思路分析
		* 1.一共有100项相加
		* 2.每一项的数字都在逐渐增加
		* 3.双层循环
		* 	*/
		int sum = 0;
		for (int i = 1; i <= 100;i++){//i可以表示是第几项，同时也是前项的最后一个数
			for (int j = 1;j <= i;j++){//内层循环对1-i进行循环
				sum += j;
			}
		}
		System.out.println("sum="+sum);
	}
}
