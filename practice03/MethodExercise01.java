package practice03;

public class MethodExercise01 {
	/*
	练习
	1.编写类AA ， 有一个方法:判断一个数是奇数odd还是偶数，返回boolean
	2.根据行，列，字符打印对应行数和列数的字符，比如:行:4，列:4，字符#，则打印相应的效果
	 */
	public static void main(String[] args) {
		AA a = new AA();
		if (a.isOdd(5)){ //false
			System.out.println("是奇数");
		}else{
			System.out.println("是偶数");
		}
		//a.isOdd(2);
		a.print(4,4,'#');
	}
}
//编写类AA ， 有一个方法:判断一个数是奇数odd还是偶数，返回boolean
class AA{
	//思路
	//1.方法的返回类型 boolean
	//2.方法的名字 isOdd
	//3.方法的形参 (int num)
	//4.方法体，判断
	public boolean isOdd(int num){
//		if (num % 2 != 0){
//			System.out.println("是奇数");
//			return true;
//		}else{
//			System.out.println("是偶数");
//			return false;
//		}
//		等价if - else  (三目运算符)
		return num % 2 != 0 ? true: false;
//		return num % 2 != 0;
	}

	//根据行，列，字符打印对应行数和列数的字符，比如:行:4，列:4，字符#，则打印相应的效果
	//思路
	//1.方法的返回类型 viod
	//2.方法的名字 print
	//3.方法的形参 (int row , int column , char c )
	//4.方法体，循环
	//结果
	/*
			####
			####
			####
			####
	 */
	public void print(int row,int column,char c){
		for (int i = 0; i < row; i++){
			for (int j = 0; j < column; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
