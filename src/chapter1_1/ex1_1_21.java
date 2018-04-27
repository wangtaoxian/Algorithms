import edu.princeton.cs.algs4.*;

public class ex1_1_21
{
    public static void main(String[] args)
    {
        System.out.println("Please input the number of lines: ");
        int n = StdIn.readInt();
        String[] name=new String[n];
        int[] first=new int[n];
        int[] second=new int[n];

        for (int i=0;i<n;i++)
        {
            name[i]=StdIn.readString();
            first[i]=StdIn.readInt();
            second[i]=StdIn.readInt();
        }

        System.out.println("---------------");

        for (int i=0;i<n;i++)
        {
            StdOut.printf("%-6s|%-6d|%-6d|%-6.3f",name[i],first[i],second[i],(float) first[i]/second[i]);
            System.out.println("\n");
        }


    }
}
