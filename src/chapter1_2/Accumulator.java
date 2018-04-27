public class Accumulator {
    private double m;
    private double s;
    private int N;
    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N-1) / N * (x-m) * (x-m);
        m = m + (x-m) / N;
    }
    public double mean()
    {
        return m;
    }
    public double var() {
        return s/(N-1);
    }
    public double stddev() {
        return Math.sqrt(this.var());
    }

    //test
    public static void main(String[] args) {
        double[] test = new double[]{1, 7, 8, 1, 7, 7, 1, 5, 1, 0, 3};
        Accumulator a = new Accumulator();
        for (double i : test)
            a.addDataValue(i);
        System.out.println("The mean value is: " + a.mean());
        System.out.println("The variance value is: " + a.var());
        System.out.println("The standard deviation is: " + a.stddev());
    }
}
