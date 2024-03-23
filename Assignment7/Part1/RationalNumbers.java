public class RationalNumbers
{
    private int numerator;
    private int denominator;

    public RationalNumbers(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    public RationalNumbers add(RationalNumbers other)
    {
        int resultNum=this.numerator*other.denominator+other.numerator*this.denominator;
        int resultDen=this.denominator*other.denominator;
        return new RationalNumbers(resultNum,resultDen);
    }
    public RationalNumbers multiply(RationalNumbers other)
    {
        int resultNum=this.numerator*other.numerator;
        int resultDen=this.denominator*other.denominator;
        return new RationalNumbers(resultNum,resultDen);
    }
    public RationalNumbers subtract(RationalNumbers other)
    {
        int resultNum=this.numerator*other.denominator-other.numerator*this.denominator;
        int resultDen=this.denominator*other.denominator;
        return new RationalNumbers(resultNum,resultDen);
    }

    public RationalNumbers divide(RationalNumbers other)
    {
        int resultNum=this.numerator*other.denominator;
        int resultDen=this.denominator*other.numerator;
        return new RationalNumbers(resultNum,resultDen);
    }

    public int compareTo(RationalNumbers other) {
        double thisValue = (double) this.numerator / this.denominator;
        double otherValue = (double) other.numerator / other.denominator;
        if (Double.compare(thisValue,otherValue)== 0)
        {
            System.out.println("The two rational numbers are equal");
        }
        else
        {
            System.out.println("The two rational numbers are not equal");
        }
        return  Double.compare(thisValue, otherValue);

    }

    public double tofloat()
    {
        return (double)  this.numerator / this.denominator;
    }

    public RationalNumbers abs()
    {
        return new RationalNumbers(Math.abs(this.numerator),(Math.abs(this.denominator)));
    }
    private void simplify()
    {
        int gcd = gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    // Method to find greatest common divisor
    private int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
}
