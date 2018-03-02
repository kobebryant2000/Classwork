package Feb26;

public class Fraction implements Comparable<Fraction>
{
    private int num;
    private int denom;
    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
        simplify();

    }
    public int compareTo(Fraction o)
    {
        int difference = this.num*o.denom - o.num*this.denom;
        if (difference > 0) return 1;
        else if (difference < 0) return - 1;
        return 0;
    }
    public boolean equals (Object o)
    {
        if (o instanceof Fraction)
        {
            return this.compareTo((Fraction)o) == 0;
        }
        else return false;
    }
    private void simplify()
    {

    }
    public String toString()
    {
        return num + "/" + denom;
    }
}
