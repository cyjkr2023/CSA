import java.util.Scanner;

public class arraysDemo_5 {
    public static void main(String[] args) {
        arraysDemo();
    }
    public static void arraysDemo() {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十个数据：");
        for(int i = 0;i < 10;i++)//对数组进行输入
        {
            array[i] = sc.nextInt();
        }
        int max = array[0], min = array[0];
        for (int i = 1;i < 10;i++)
        {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("sum:"+ (max + min));
    }
}
