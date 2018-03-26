import java.util.Scanner;
class ArithInt{
    public static void main(String args[]){
        Scanner StdIn = new Scanner(System.in);//标准输入对象
        System.out.println("对x和y进行加减乘除余运算");
        System.out.print("x = ");
        int x = StdIn.nextInt();//获取下一个整数
        System.out.print("y = ");
        int y = StdIn.nextInt();
        System.out.println("x+y=" + (x + y));
        System.out.println("x-y=" + (x - y));
        System.out.println("x*y=" + (x * y));
        System.out.println("x/y=" + (x / y));
        System.out.println("x%y=" + (x % y));
    }
}

