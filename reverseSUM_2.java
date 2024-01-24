public class reverseSUM_2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        int num = NoDeath(arr , 19);
        System.out.print("num:" + num);
    }
    public static int NoDeath(int[] arr, int i) {
        if (i == 1 || i == 0)
            return 1;
        else
            return NoDeath(arr,i - 1) + NoDeath(arr,i - 2);
    }
}
