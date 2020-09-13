public class garmon {
    public static void main(String[] args) {
        float a;
        String str;
        for(int i=0; i<10; i++){
            a= (float) (1.0/(i+1.0));
            str = String.format("%.6f", a);
            System.out.print(str + " ");
        }
    }
}
