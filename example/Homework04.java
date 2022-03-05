package example;

public class Homework04 {
	public static void main(String[] args) {
		/*
		已知有个升序的数组，要求插入一个元素，该数组顺序依然
		是升序，比如:[10,12,45,90],添加23后，数组为[10,12,23,45,90]
		思路分析
		1.定义一个数为 23;
		2.定义数组 int[] arr = {10,12,45,90};
		3.原数组加一 int[] arrnum = new int[arr.length + 1];
		4.遍历数组 arr[i]赋值给arrnum[i]  arrnum[i] = arr[i];
		5.把23赋值给 arrnum 最后一个元素
		6.arrnum 赋值给 arr
		7.冒泡排序

		 */
		int num = 23;
		int[] arr = {10,12,45,90};
		int temp = 0;
		int[] arrnum = new int[arr.length + 1];
		//遍历数组
		for (int i = 0;i < arr.length;i++){
			arrnum[i] = arr[i];
		}
		//把23赋值给 arrnum 最后一个元素
		arrnum[arrnum.length - 1] = num;
		arr = arrnum;
		//外层循环
		for (int i = 0; i < arr.length - 1; i++) {
			//如果前面的数 > 后面的数，就进行转换
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "轮" + " ");
			for (int j = 0;j < arr.length;j++){
				System.out.print(arr[j] + " ");
			}
		}
	}
}
