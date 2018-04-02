import java.util.Scanner;

class Circle1{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入半径：");
        double r = stdIn.nextDouble();
        System.out.println("周长：" + (2*3.14*r));
        System.out.println("面积：" + (3.14*r*r));
    }

}