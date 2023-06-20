
import java.util.Scanner;
public class BinarySearch {
public static int binarySearch(int array[], int target,int low,int high)
{
try{
int middle = low+high/2;
if(array[middle]<target)
{
binarySearch(array,target,middle+1,high);
}
else if(array[middle]>target)
{
binarySearch(array,target,low,middle-1);
}
else if(array[middle]==target)
{
return middle;
}
return -1;
} catch(Exception e)
{
return -1;
}
}
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Enter No. of testcases :");
int t=scn.nextInt();
while(t-->0)
{
System.out.println("Enter Size of Array :");
int n=scn.nextInt();
System.out.println("Enter Sorted Arrays :");
int arr[] = new int [n];
for(int i=0;i<n;i++)
{
arr[i]=scn.nextInt();
}
System.out.println("Enter target Value :");
int target = scn.nextInt();
int low=0 ;
int high = n-1;
int temp=binarySearch(arr,target,low,high);
if(temp==-1)
{
System.out.println( target +" is not found");
}else
{
System.out.println("element found at index "+ temp);
}
}
}
}