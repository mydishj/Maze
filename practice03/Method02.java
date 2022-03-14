package practice03;

import jdk.swing.interop.SwingInterOpUtils;

public class Method02 {
	public static void main(String[] args) {
		A1 a = new A1();
	}
}
	class A1 {
		//同一个类中的方法：直接调用即可
		public void print(int n){
			System.out.println("print()方法被调用 n = " + n);
		}
		public void sayOk(){
			//sayOk调用 print(直接调用即可)
			print(10);
			System.out.println("继续执行~~");
		}
		public void m1(){
			//创建B对象，然后调用方法即可
			System.out.println("m1() 方法被调用");
			B b = new B();
			b.hi();
		}
	}
	class B{
	public void hi(){
		System.out.println("b类中的，hi()被执行");
	}
}

