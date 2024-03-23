
class FactorialException extends Exception
{
    public FactorialException(String message)
    {
        super(message);
    }
}
public class Fact
{
    public static void main (String[] args)
    {

        for (String arg : args)
            try
            {
                int n = Integer.parseInt(arg);
                if (n<0 || n>15)
                {
                    throw new FactorialException("Value out of range (1 to 15) for"+" "+n);
                }
                else
                {
                    System.out.println("The factorial of"+" "+n+" "+"is"+" "+factorial(n));
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println("Input Error "+e.getMessage()+" "+"Please enter integers");
            }
            catch (FactorialException e)
            {
                System.out.println("Caught in the exception "+e.getMessage());
            }

    }
    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;

    }

}

