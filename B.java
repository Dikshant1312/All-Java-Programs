package pack; 
public class A
{ 
public int add(int a ,int b, int c)
{
return a+b+c;
}
public void display()
{
System.out.println("Welcome to Package");
}
public static void main(String[] args)
{
A a =new A();
System.out.println("Addition of nos is :" +a.add(5,2,8));
} 
}
import pack.A; 
import java.io.*;
class B
{
public static void main(String[] args)throws IOException
{
A a=new A();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter three nos: "); 
int n1 = Integer.parseInt(br.readLine());
int n2 = Integer.parseInt(br.readLine());
int n3 = Integer.parseInt(br.readLine()); 
System.out.println("Addition : "+a.add(n1,n2,n3));
a.display();
}
}
