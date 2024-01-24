import java.util.Scanner;

public class isPalindrome_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = sc.nextInt();
        isPalindrome(number);
    }
    public static void isPalindrome(int number){
        boolean flag = true;
        int i = 0 , num = number;
        do{//判断这个数有几位，方便定义数组长度
            number = number / 10;
            i++;
        }while(number != 0);
        int[] arr = new int[i];
        for (int n = 0;n < i;n++)//对这个数每个位上进行存储
        {
            arr[i-n-1] = num % 10;
            num = num / 10;
        }
        for (int m = 0;m <= (i / 2);m++)//判断对称位置上的数字是否相同
        {
            if(arr[m] != arr[i-m-1])
                flag = false;
        }
        if(flag)
            System.out.print("是回文数");
        else
            System.out.print("不是回文数");
    }
}
