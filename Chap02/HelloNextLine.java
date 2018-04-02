import java.util.Scanner;
class HelloNextLine{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("您的姓名是:");
        String s = stdIn.nextLine();//读取一行字符串
        System.out.println("您好，" + s + "先生");
    }

}