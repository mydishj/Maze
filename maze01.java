package Chapter07;

public class maze01 {
	/*
	迷宫分析
	1.先创建迷宫，使用二维数组表示墙 ， 共 八行七列
	2.先规定map 数组的元素值 ： 0表示可以走 1表示有障碍物(墙) 2表示可以走 3表示走过但是不通
	3.将最上面的一行和最下面的一行 ，全设为 1
	4.将最右的一列和最左的一列 ，全设为 1
	5.在设置两个障碍物 map[3][1]，map[3][2]
	  终点为map[6][5]
	  起点为map[1][1]
	 */
	public static void main(String[] args) {
		//迷宫大小
		int[][] map = new int[8][7];
		int pan = 0;
		//迷宫的上和下边
		for (int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//迷宫的两边和两个障碍物
		for (int i = 0; i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//设置单独的障碍物
		map[3][5] = 1;
		map[4][4] = 1;
		map[5][3] = 1;
		map[1][2] = 1;
		map[3][1] = 1;
		map[3][2] = 1;
		System.out.println("");
		//输出迷宫地图
		System.out.println("====map的地图====");
		for (int[] ints : map) {
			for (int anInt : ints) {
				System.out.print(anInt + " "); //输出
			}
			System.out.println();
		}
//		//第一种使用 findtheway 找路
		maze02 a1 = new maze02();
		a1.findtheway(map,1,1);
		System.out.println("====map的找路的情况如下====");
		//输出迷宫地图
		for (int[] ints : map) {
			for (int j = 0; j < ints.length; j++) {
				System.out.print(ints[j] + " "); //输出
				if (ints[j] == 2) {
					pan++;
				}
			}
			System.out.println();
		}

		//迷宫大小
		int[][] map1 = new int[8][7];
		int pan1 = 0;
		//迷宫的上和下边
		for (int i = 0; i < 7; i++){
			map1[0][i] = 1;
			map1[7][i] = 1;
		}
		//迷宫的两边和两个障碍物
		for (int i = 0; i < 8;i++){
			map1[i][0] = 1;
			map1[i][6] = 1;
		}
		//设置单独的障碍物
		map1[3][1] = 1;
		map1[3][2] = 1;
		System.out.println("====map1的地图====");
		//输出迷宫地图
		for (int i = 0; i < map1.length; i++){
			for (int j = 0; j < map1[i].length;j++){
				System.out.print(map1[i][j] + " "); //输出
			}
			System.out.println();
		}
		//第二种使用 findtheway01 找路
		maze03 a2 = new maze03();
		a2.Findtheway01(map1,1,1);
		System.out.println("====map1找路的情况如下====");
		//输出迷宫地图
		for (int i = 0; i < map1.length; i++){
			for (int j = 0; j < map1[i].length;j++){
				System.out.print(map1[i][j] + " "); //输出
				if (map1[i][j] == 2){
					pan1++;
				}
			}
			System.out.println();
		}
		System.out.println("策略1：顺序 下 右 上 左 先走了"+pan+"步");
		System.out.println("策略2：顺序 上 右 下 左 先走了"+pan1+"步");
		if (pan < pan1){
			System.out.println("策略1：顺序 下 右 上 左 先走了"+pan+"步");
		}else {
			System.out.println("策略2：顺序 上 右 下 左 先走了"+pan1+"步");
		}
	}
}
class maze02{
	//找路
	//使用递归回溯
	//1.Findtheway方法专门找迷宫的路
	//2.如果找到，就返回true ， 否则 false
	//3.map 是二维数组即表示迷宫
	//4.i,j是球的位置
	//5.因为递归找路需要规定 map 数组的各个值的含义
	//  0表示可以走 1表示有障碍物 2表示可以走 3表示走过但是不通
	//6.当map[6][5] = 2的时候就表示找到终点 否则继续查找
	//7.确定球找路的策略   下 右 上 左 / 上 右 下 左
	//练习8.修改找路的策略，看路是否有变化
	//练习9.求出最短路径
	//1.穷举
	//解法：可以看出优化方式可以从搜索的路径上开始解决，此方法的搜索路径是  下 右 上 左 / 上 右 下 左 两种。
	//     可以多写几种遍历的方式来进行比较，如下例中比较了两种搜索的路径不同，来通过走过的节点数，判断最短的路径。
	//     注意，要用不同的引用来传值，也就是要重新创建一个map二维数组，来进行调用findtheway方法。
	//2.图

	public boolean findtheway(int[][] map,int i,int j){
		if (map[6][5] == 2){//说明到达终点
			return true;
		}else{
			if (map[i][j] == 0){//当前这个位置0，表示可以走
				//假定可以走
				map[i][j] = 2;
				//使用找路的策略
				//下 右 上 左
				if (findtheway(map,i + 1 , j)){

					return true;
				}else if (findtheway(map,i , j + 1)){

					return true;
				}else if (findtheway(map,i - 1 , j)){

					return true;
				}else if (findtheway(map,i , j - 1)){

					return true;
				}else {
					map[i][j] = 3;
					return false;
				}
			}else {//map[i][j] == 1，2，3  0表示可以走 1表示有障碍物 2表示可以走 3表示走过但是不通
				return false;
			}
		}
	}
}

class maze03{
	//练习8.修改找路的策略，看路径是否有变化
	//有变化 ， 路径改变成 7 字型
	public boolean Findtheway01(int[][] map1,int i,int j) {
		if (map1[6][5] == 2) {//说明到达终点
			return true;
		} else {
			if (map1[i][j] == 0) {//当前这个位置0，表示可以走
				//假定可以走
				map1[i][j] = 2;
				//使用找路的策略
				//上 右 下 左
				if (Findtheway01(map1, i - 1, j)) {
					return true;
				} else if (Findtheway01(map1, i, j + 1)) {
					return true;
				} else if (Findtheway01(map1, i + 1, j)) {
					return true;
				} else if (Findtheway01(map1, i, j - 1)) {
					return true;
				} else {
					map1[i][j] = 3;
					return false;
				}
			} else {//map[i][j] == 1，2，3  0表示可以走 1表示有障碍物 2表示可以走 3表示走过但是不通
				return false;
			}
		}
	}
}

