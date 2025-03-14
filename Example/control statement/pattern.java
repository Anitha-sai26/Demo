class pattern{

public static void main(String args[])
{
int n=5;
for(int i=0;i<n;i++)//for increasing
{
    for(int j=1;j<i+1;j++)
    {
        System.out.print("*");
    }
    System.out.println(" " );
}
for(int i=1;i<=n;i++)//for decreasing
{
    for(int j=n;j>=i;j--)
    {
        System.out.print("*");
    }
    System.out.println("* " );
}

for (int i=1;i<=n;i++)//for increasing
{
    for(int j=n;j>=i;j--)
    {
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
        System.out.print("*");
    }
    System.out.println( );

    }
    
    for (int i=1;i<=n;i++)//for increasing
{
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
        System.out.print("* ");
    }
    System.out.println( );

    }
}
}