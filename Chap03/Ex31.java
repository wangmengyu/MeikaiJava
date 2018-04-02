import java.util.Scanner;
class Ex31{
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = stdIn.nextInt();
        if (num < 0){
            System.out.print(num+"的绝对值是"+((-1)*num));
        } else {
            System.out.print(num+"的绝对值是"+(num));
        }
    }
}