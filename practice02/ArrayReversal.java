package practice02;

public class ArrayReversal {
	public static void main(String[] args) {
		//arr {11,22,33,44,55,66} 反转为 {66，55，44，33，22，11}
		//编程思路
		/*
		 * 规律
		 * 1.arr[o] 和 arr[5] 进行交换 {66，22，33，44，55，11}
		 * 2.arr[1] 和 arr[4] 进行交换 {66，55，33，44，22，11}
		 * 3.arr[2] 和 arr[3] 进行交换 {66，55，44，33，22，11}
		 * 4.一共交换3次 = arr.length / 2
		 * 5.每次交换时，对应的下标 是 arr[i] 和 arr[arr.length / 2 - i]
		 * 代码
		 */
		//定义数组
			int[] arr = {11,22,33,44,55,66};
			int temp = 0;
			//统计数组的长度
			int len = arr.length;
			for (int i = 0; i < arr.length / 2; i++){
				//保存
				temp = arr[arr.length / 2];
				arr[arr.length / 2 - i] = arr[i];
				arr[i] = temp;
				/*
				*解析
				* temp 保存 arr[arr.length / 2]  下标
				* arr[i] 则 保存 arr[arr.length / 2 - i]
				* temp 则赋 arr[i]
				* */
			}

	}
}
