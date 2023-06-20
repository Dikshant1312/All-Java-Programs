class CmdLine
{
public static void main (String args[])
{
int invalid=0;
int number,count=0;
for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid=invalid+1;
System.out.println("Invalid No:"+args[i]);
continue;
}
count=count+1;
}
System.out.println("Valid No's:"+count);
System.out.println("Invalid Numbers:"+invalid);
}
}