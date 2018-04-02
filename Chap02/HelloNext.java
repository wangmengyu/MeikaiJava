import java.util.Scanner;
class HelloNext{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("您的姓名是:");
        String s = stdIn.next();//读取第一个字符串，空格分割取得。
        System.out.println("您好，" + s + "先生");
    }

}