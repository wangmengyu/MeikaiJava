import java.util.Scanner;
class Ex25{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x的值:");
        double x = scanner.nextDouble();
        System.out.print("y的值:");
        double y = scanner.nextDouble();
        System.out.println("合计值是：" + (x+y));
        System.out.println("平均值是:" + ((x+y)/2));
    }

}