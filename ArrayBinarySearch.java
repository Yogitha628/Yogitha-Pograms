import java.util.*;
class ArrayBinarySearch
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int [n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
int sno=s.nextInt();
int r=Arrays.binarySearch(a,sno);
System.out.println(r);
}
}
