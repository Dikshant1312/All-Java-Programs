import java.io.*;
public class BufferReader
{
public static void main(String args[])throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferReader br=new BufferReader(r);
System.out.println("Enter ur name");
String name=br.readLine();
System.out.println("Welcome"+name);
}
}