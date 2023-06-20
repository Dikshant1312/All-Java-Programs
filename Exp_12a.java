class A extends Thread{
    public void run(){
        System.out.println("Thread A started");
        for(int i=1;i<=5;i++){
            System.out.println("\t From thread A: i="+i);
        }
        System.out.println("Exit from Thread A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread B started");
        for(int j=1;j<=5;j++){
            System.out.println("\t From Thread B: j= "+j);
        }
        System.out.println("Exit from Thread B");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Thread C started");
        for(int k=1;k<=5;k++){
            System.out.println("\t From Thread C: k="+k);
        }
        System.out.println("Exit from Thread C");
    }
}
public class Exp_12a{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        C t3=new C();
        t3.setPriority(t3.MAX_PRIORITY);
        t2.setPriority(t1.getPriority());
        t1.setPriority(t1.MIN_PRIORITY);
        System.out.println("Start Thread A");
        t1.start();
        System.out.println("Start Thread B");
        t2.start();
        System.out.println("Start Thread c");
        t3.start();
        System.out.println("end of Main Thread");
    }
} 
