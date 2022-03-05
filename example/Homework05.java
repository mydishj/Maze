package example;

public class Homework05 {
	public static void main(String[] args) {
		/*
		随机生成10个整数(1—100的范围)保存到数组，并倒序打印以及求平均值，求最大值和
		最大值的下标,并查找里面是否有 8

		思路分析
			需定义 sum 用来储存总和数组
			需定义 maxidex 用来储存最大下标
			需定义 max 用来储存最大的数
		1.定义数组长度 长度为 10 int[] = new int[10];
		2.把第一个数定为最大的值
		3.随机数 1-100;
		4.遍历数组,倒叙打印
		5.判断是否有 8
		6.输出平均值 和 最大值 和 最大值的下标

		 */
		int[] arr = new int[10];//定义一个数组长度为10
		int sum = 0; //数组总和
		int maxidex = 0;//最大下标
		int max = arr[0];//把第一个数定义为最大的值
		//长度为 arr.length 的随机数
		for (int i = 0; i < arr.length;i++){
			//生产 随机数 1 - 100
			arr[i] = (int)(Math.random()*100)+1;
		}
		//遍历数组 倒叙打印
		for (int n = arr.length - 1; n >= 0; n--){
			System.out.print(arr[n] + " ");
			sum += arr[n]; //累计数组之和
			//判断最大值
			if (max < arr[n]){
				max = arr[n]; //将最大值赋值给max
				maxidex = n; //将最大下标赋值给maxidex
			}
		}
		int findNum = 8; //定义要查询的数字 8
		int index = -1; //用于判断  1 为 找到 -1 为 没有找到
		//遍历数组判断数组里是否有数字8  如果有则直接跳出循环
		for (int i = 0; i < arr.length;i++){
			if (arr[i] == findNum){
				System.out.println("找到数" + findNum + "下标为" + i);
				index = 1; //找到数字则为 1
				break;
			}
		}
		//没有数字 8 的输出
		if ( index == -1){
			System.out.println("此数组中不含有查询的数字:" + findNum);
		}
		System.out.println("最大值下标为:" + maxidex);
		System.out.println("平均值:" + (sum / arr.length));
		System.out.println("最大值:" + max);
	}
}
