import java.util.Scanner;
class ArithDouble{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x和y的值");
        System.out.print("x:");
        double x = scanner.nextDouble();
        System.out.print("y:");
        double y = scanner.nextDouble();
        System.out.println("x+y=" + (x+y));
        System.out.println("x-y=" + (x-y));
        System.out.println("x*y=" + (x*y));
        System.out.println("x/y=" + (x/y));
    }

}