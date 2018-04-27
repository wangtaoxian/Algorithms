import edu.princeton.cs.algs4.*;

public class ex1_2_6 {
    public static void main(String[] args)
    {
        StdOut.print("s: ");
        String s = StdIn.readString();
        StdOut.print("t: ");
        String t = StdIn.readString();

        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0)
            StdOut.println(s + " is the circular rotation of " + t);
        else
            StdOut.println(s + " is not the circular rotation of " + t);
    }
}
