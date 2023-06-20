import java.util.Scanner;
public class Exp3 {

public static void main(String[] args) {
Detail s= new Detail();
s.compute();
s.calculate();
s.calculate();
s.cal("Dikshant ", 4, 300, 400);
s.cal("Abbasali", 1, 338, 400);
}
}
class Detail{

String s_name;
int r_no;
int marks_obtained;
int total_marks;

void compute(){
Scanner scan1 = new Scanner(System.in);
System.out.println("Enter marks obtained");
int r1=scan1.nextInt();
System.out.println("Enter Total Marks");
int r2=scan1.nextInt();
float per= (r1*100)/r2;
System.out.println("Percentage:"+per);
}

double calculate() {
Scanner scan3 = new Scanner(System.in);
System.out.println("Enter marks obtained");
marks_obtained=scan3.nextInt();
System.out.println("Enter Total Marks");
total_marks=scan3.nextInt();
float a= (marks_obtained*100)/ total_marks;
System.out.println("Percentage:"+a);
return 0;

}

void cal(String n, int r, int m, int t) {
s_name=n;
r_no=r;
marks_obtained=m;
total_marks=t;
float perc=(marks_obtained*100)/ total_marks;
System.out.println("Name:"+s_name+"\nRoll No:"+r_no+"\nMarks:"+marks_obtained+
                                  "\nTotal:"+total_marks+"\nPercentage:" +perc);
}
}
