import java.util.Scanner;
class Positive{
    public static  void  main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int n = stdIn.nextInt();
        if (n > 0) {
            System.out.println("该值为正数");
        }
    }
}