import java.util.Scanner;
public class part1_EvenOdd
{
    public void evenodd()
    {
        part1_input input=new part1_input();
        int[] d=new int[10];
        int i;
        d=input.inputdata();
        System.out.println("Array element:");
        int s=d.length;
        int even[]=new int[s];
        int odd[]=new int[s];
        int evencount=0,oddcount=0;
        for(i=0;i<d.length;i++)
        {
            if(d[i]%2==0)
            {
                even[evencount]=d[i];
                evencount++;
            }
            else
            {
                odd[oddcount]=d[i];
                oddcount++;
            }

        }
        System.out.println("Elements of even array:");
        for(i=0;i<evencount;i++)
        {
            System.out.print(even[i]+" ");
        }
        System.out.println("\nElements of odd array:");
        for(i=0;i<oddcount;i++)
        {
            System.out.print(odd[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        part1_EvenOdd p = new part1_EvenOdd();
        p.evenodd();
    }
}

