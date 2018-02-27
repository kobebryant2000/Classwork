package Feb26;

public class Fraction implements Comparable<Fraction>
{
    private int num;
    private int deno
    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = dm;
        enom;
        simplify();

    }
    public int compareTo(Fraction o)
    {
        int difference = this.num*o.denom - o.num*this.denom;
        if (difference > 0) return 1;
        else if (difference < 0) return - 1;
        return 0;
    }
    private void simplify()
    {

    }
}
