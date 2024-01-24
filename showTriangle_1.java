import java.util.Scanner;

public class showTriangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要打印的等腰三角形的行数：");
        int n = sc.nextInt();
        showTriangle(n);
    }

    public static void showTriangle(int n) {
        for(int i = 1;i <= n;i++)//控制打印的层数
        {
            for (int m = 1;m <= n - i;m++)//控制每一层打印的空格数
            {
                System.out.print(" ");
            }
            for (int j = 1;j <= 2*i - 1;j++)//控制每一层打印的 * 数
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
