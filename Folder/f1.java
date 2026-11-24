import java.util.Scanner;
class f1
{
    public static void main(String args[])
    {
        int[] a=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int avg=sum/a.length;
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }
}