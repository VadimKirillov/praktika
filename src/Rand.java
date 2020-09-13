import java.util.Scanner;
public class Rand {
    public static void main(String[] args) {
        int n,arr[];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int [n];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 1000);
        for (int i: arr)
            System.out.print( i + " " );
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println();
        for (int i: arr)
            System.out.print( i + " " );
    }
}
