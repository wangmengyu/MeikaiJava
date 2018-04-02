import java.util.Scanner;
class Ex32{
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数A：");
        int a = stdIn.nextInt();
        System.out.print("整数B：");
        int b = stdIn.nextInt();
        if (a > b && b!=0) {
            if (a%b==0) {
                System.out.println(b+"是"+a+"的约数");
            }
        }
    }


}