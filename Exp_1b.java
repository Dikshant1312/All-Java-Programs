public class Exp_1b {
    public static void main(String[] args) {
        int fib=0,i=0,j=1;
        System.out.print(i+" "+j);
        for(int n=2;n<10;n++){
            fib=i+j;
            System.out.print(" "+fib);
            i=j;
            j=fib;
        }
    }
}