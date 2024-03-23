class NoMatchException extends Exception
{
    public NoMatchException(int line,String message)
    {
        super("Error at line number"+" "+line+" "+message);
    }
}
public class Nomatch
{
    public static  void main(String[] args)
    {
        String initial="India";
        String input = args[0];
        try
        {
            if (!initial.equals(input))
            {
                throw new NoMatchException(18,input+" "+"Doesnot Match the initial string India");
            }
            else
            {
                System.out.println(input+" "+"Matches the initial String : India");
            }

        }
        catch (NoMatchException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
