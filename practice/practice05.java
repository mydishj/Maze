/*
//* 案例 下面代码输出什么
*   什么都不会输出
    m = 0 if（m > 0）不成立
    则不执行if条件下的语句,直接退出
 */
package practice;

public class practice05 {
    public static void main(String[] args) {
        int m = 0,n = 3;
        if (m > 0){
            if (n > 2){
                System.out.println("ok1");
            }else{
                System.out.println("ok2");
            }
        }
        System.out.println("什么都没有");
    }
}
