class Exponential
{
public static int fun(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=Math.pow(2,n);j++)
{
c++;
}
}
return c;
}
public static void main(String[] args)
{
int n=10;
System.out.println("N=100 ,no.of instructions O(2^n): "+fun(n));
}
}