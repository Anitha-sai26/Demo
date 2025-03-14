class Ifelseladder
{
    public static void main(String args[])
    {
        int marks=30;
        if(marks>90&&marks<=100)
        {
            System.out.println("excellent");
        }
        else if(marks>80&&marks<=90)
        {
            System.out.println("very good");
        }
        else if(marks>70&&marks<=80)
        {
            System.out.println("good");
        }
        else if(marks>60&&marks<=70)
        {
            System.out.println("avg");
        }
        else if(marks>50&&marks<=60)
        {
            System.out.println("below avg");
        }
        else if(marks>40&&marks<=50)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail")  ;
        }
    }
}