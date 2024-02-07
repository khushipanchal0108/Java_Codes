import java.util.Scanner;
public class part1_input extends part1_EvenOdd
{
    int[] inputdata()
    {
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        total=sc.nextInt();
        int [] data=new int[total];
        System.out.println("Enter elements: ");
        for(int i=0;i<total;i++)
        {
            System.out.println("element "+(i+1));
            data[i]=sc.nextInt();
        }
        return data;
    }
}