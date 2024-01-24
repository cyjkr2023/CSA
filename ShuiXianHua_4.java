public class ShuiXianHua_4 {
    public static void main(String[] args) {
        ShuiXianHua();
    }
    public static void ShuiXianHua() {
        int ge , shi , bai;
        System.out.print("水仙花数有：");
        for (int i = 100;i <1000;i++)
        {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100;
            int sum;
            sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if(sum == i)
                System.out.print(i + "   ");
        }
    }
}
