import java.util.Scanner;

public class reverseSUM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        String line = String.valueOf(n);//将正整数转化为字符串k
        System.out.println("您输入的正整数的位数是：" + line.length());
        reverseSUM(line);
    }
    public static void reverseSUM(String s) {
/*
        //将字符串转为字符数组
        char[] chars = s.toCharArray();//字符串转化为字符数组
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++)//将字符数组倒序
            chars1[i] = chars[chars.length - i - 1];
        String s1 = String.valueOf(chars1);//将倒序的字符数组转化为字符串
        System.out.print("您输入的正整数的逆序是：");
        System.out.println(s1);
*/
        //不将字符串转为字符数组
        System.out.print("您输入的正整数的逆序是：");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
