
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int k=0, n=0, m=0, g=0;
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            k+=array[i];
        }
        while(n<size){
            m+=array[n];
            n++;
        }
        n=0;
        do{
            g+=array[n];
            n++;
        }while(n<size);

        for (int i = 0; i < size; i++) {
            System.out.print (array[i] + " " );
        }
        System.out.println();
        System.out.print(k);
        System.out.println();
        System.out.print(m);
        System.out.println();
        System.out.print(g);
    }
}