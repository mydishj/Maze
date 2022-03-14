package practice03;

public class Hanrota {
	public static void main(String[] args) {
     hanluota hanluota = new hanluota();
	 hanluota.Hanluota(22,'A','B','C');
	}
}
class hanluota{
	//1.形参abc不是固定对应的实参，ABC三根柱子，而是 起始点 ，过渡点，终点，三根柱子
	//2.起始，过渡，终点 是形参
	//3.else代码中的内容
	//（1.A上面的一层(num - 1)挪到 B ，所以 起始=A 过渡=B 终点=B
	//（2.（num - 1）挪回A之后，之前A最底下的已经挪到C 最底下
	//（3.循环完成
	public void Hanluota(int num,char a,char b, char c) {
		//num表示要移动的个数，a,b,c,表示A塔，B塔，C塔
		//代表只有一个盘
		if (num == 1){
			System.out.println(a + "->" + c);
		}else {
			//如果有多个盘，可以看成两个，最下面的和上面的所有盘(num - 1)
			//移动上面的盘到 b,借助 c
			Hanluota(num - 1,a , c ,b);
			//把最下面的这个盘，移到 c
			System.out.println(a + "->" + c);
			//再把 b的所有盘，移动到c ，借助 a
			Hanluota(num - 1,b , a ,c);
			//a -> c 借 a -> b
			//b -> c 借 b -> a
		}
	}
}
