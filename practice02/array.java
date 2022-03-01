package practice02;

public class array {
	/*
	* 创建一个数组char类型的26个元素的数组，分别放置'A'-'Z'。
	* 使用for循环访问所有的元素并打印出来。
	* 提示:char类型数据运算  'A' + 2 -> 'C'
	*
	*思路分析
	* 创建一个char类型的26个元素的数组 char[] array2 = new char[26]
	* array2 + i == C
	* */
	public static void main(String[] args) {
		//数组可以先创建在存入数据
		char[] chars = new char[26];
			for (int i = 0; i < chars.length; i++){
				//chars 是char[]
				//chars[i] 是 char
				chars[i] = (char)('A' + i);// 'A' + i 是int 需要强制转换
			}
		for (int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
	}
}
