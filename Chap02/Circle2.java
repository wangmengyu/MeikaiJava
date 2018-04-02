import java.util.Scanner;

class Circle2{
    public static void main(String args[]){
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入半径：");
        double r = stdIn.nextDouble();
        System.out.println("周长：" + (2*PI*r));
        System.out.println("面积：" + (PI*r*r));
    }

}