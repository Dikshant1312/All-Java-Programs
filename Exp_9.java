public class Exp_9 {
    public static void main(String args[]) {
    Results s=new Results();
    s.getNumber(04);
    s.getMarks(45,80);
    s.display();
}
}
class Test extends Student {
    double Marks1,Marks2;
    void getMarks(double M1,double M2)
    {
        Marks1=M1;
        Marks2=M2;
    }
    void displayMarks()
    {
        System.out.println("Marks obtained:");
        System.out.println("Sub 1="+Marks1);
        System.out.println("Sub 2="+Marks2);
    }
}

interface Sports {
    double sport_Weightage =7;
    void displayWt();
}
class Results extends Test implements Sports {
    double total;
    public void displayWt(){
        System.out.println("Sport weightage="+sport_Weightage);
    }
    void display() {
        total=Marks1+Marks2+sport_Weightage;
        displayNumber();
        displayMarks();
displayWt();
System.out.println("Total marks:"+total);
    }
}
class Student {
    int r_no;
    void getNumber(int n) {
        r_no=n;
    }
    void displayNumber() {
        System.out.println("Roll no:" +r_no);
    }
}
