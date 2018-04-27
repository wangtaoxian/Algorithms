import edu.princeton.cs.algs4.*;

public class ex1_1_27
{

    public static double binomial1(int N, int k, double p)
    {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial1(N - 1, k, p) + p * binomial1(N - 1, k - 1, p);
    }

    public static double binomial2(int N, int k, double p)
    {
        if (N==0 && k==0)
            return 1.0;
        if (N<0 || k<0)
            return 0.0;

        double[][] result = new double[N + 2][k + 2];


        for (int i = 0; i <= N+1; i++)
        {
            for (int j = 0; j <= k+1; j++)
            {
                if (i==1 && j==1)
                    result[i][j]=1;
                else if (i==0 || j==0)
                    result[i][j]=0.0;
                else
                    result[i][j] = (1 - p) * result[i - 1][j] + p * result[i - 1][j - 1];
            }
        }

        return result[N+1][k+1];
    }

    public static void main(String[] args)
    {
        int N=Integer.parseInt(args[0]);
        int k=Integer.parseInt(args[1]);
        double p=Double.parseDouble(args[2]);

        //StdOut.println(binomial1(N, k, p));
        StdOut.println(binomial2(N, k, p));
    }
}
