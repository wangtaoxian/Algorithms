import edu.princeton.cs.algs4.*;

//Fibonacci
public class ex1_1_19
{
    public static long Fibonacci(int N)
    {
        if (N==0) return 0;
        if (N==1) return 1;

        long[] a=new long[N+1];
        a[0]=0;
        a[1]=1;

        for(int i=2;i<=N;i++)
            a[i]=a[i-1]+a[i-2];

        return a[N];
    }

    public static void main(String[] args)
    {
        for (int N=0;N<100;N++)
        {
            StdOut.println(N + " " + Fibonacci(N));
        }
    }
}
