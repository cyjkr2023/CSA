import java.util.Scanner;

public class reverseSUM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        int x = n;// x的作用是保留原数值
        int i = 0, m = 0;
        do {//求正整数的位数
            m = n % 10;
            n = n / 10;
            i++;
        } while (n != 0);
        System.out.println("您输入的正整数的位数是：" + i);
        String k = String.valueOf(x);//将正整数转化为字符串k
        reverseSUM(k);
    }

    public static void reverseSUM(String s) {
        char[] chars = s.toCharArray();//字符串转化为字符数组
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++)//将字符数组倒序
            chars1[i] = chars[chars.length - i - 1];
        String s1 = String.valueOf(chars1);//将倒序的字符数组转化为字符串
        System.out.print("您输入的正整数的逆序是：");
        System.out.println(s1);
    }
}
