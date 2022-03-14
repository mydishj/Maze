package practice03;

public class Method01 {
	/*
	成员方法快速入门
	1.添加speak 成员方法，输出"我是一个好人"
	2.添加cal01 成员方法，可以计算从1+..+1000的结果
	3.添加cal02 成员方法，该方法可以接收一个数n，计算从 1 + .. +n 的结果
	4.添加getSum 成员方法，可以计算两个数的和
	 */
	public static void main(String[] args) {
		//方法的使用
		//1.方法写好后，如果不去调用(使用) ，就不会输出
		//2.先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();//调用cal01方法
		p1.cal02(5);//调用cal02方法，同时给n = 5;
		p1.cal02(50);//调用cal02方法，同时给n = 50;
		int returnRes = p1.getSum(10,50);
		System.out.println("getSum方法返回的值" + returnRes);
		//调用getSum ，同时给 num1 = 10 ,num = 50
		//把方法getsum 返回的值，赋给 变量 returnRes
	}
}
	class Person{
		String name;
		int age;
		//方法(成员方法)
		//添加speak 成员方法，输出"我是一个好人"
		//1.public 表示方法是公开
		//2.void :表示方法没有返回值
		//3.speak():speak是方法名 ，()表示为形参列表
		//4.{}为方法体
		//5.System.out.println("我是一个好人");
		public void speak(){
			System.out.println("我是一个好人");
		}
		public void cal01(){
			int res = 0;
			for (int i = 1; i < 1000; i++){
				res += i;
			}
			System.out.println("cal01计算结果" + res);
		}
		public void cal02(int n){
			//1.(int n) 形参列表，表示前面有一个形参 n ,可以接受用户输入
			int res = 0;
			for (int i = 1; i < n; i++){
				res += i;
			}
			System.out.println("cal02计算结果" + res);
		}
		public int getSum (int num1,int num2){
			//1.public 表示方法是公开
			//2.int :表示方法执行后，返回一个 int 值
			//3.getSum 方法名
			//4.(int num1,int num2)形参列表，可以接受用户的两个数
			//5.retrun res;表示把 res 的值 ,返回
			int res = num1 + num2;
			return res;
		}
	}

