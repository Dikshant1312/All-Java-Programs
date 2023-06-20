class Exp_7a
{
public static void main(String args[])
{
StringBuffer a1= new StringBuffer("New");
StringBuffer a2=new StringBuffer("World");
StringBuffer a3=new StringBuffer("Name");
System.out.println("Original string a1: "+a1);
System.out.println("String a1 after reversing: "+a1.reverse());

System.out.println("Original capacity of a2: "+a2.capacity());  
System.out.println("String after appending Hello to a2: "+a2.append("Hello"));  
System.out.println("Capacity after appending: "+a2.capacity());

System.out.println("String a3 after replacing: "+a3.replace(1,2,"Hey"));
System.out.println("String a1 after deleting: "+a1.delete(2,3));
System.out.println("String a1 after inserting: "+a2.insert(2,"Me"));
}
}

