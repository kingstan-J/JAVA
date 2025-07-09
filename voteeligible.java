import java.io.*;
import java.util.Scanner;

public class voteeligible
{
    public static void main(String[] args)
    {
        Scanner voteobj = new Scanner(System.in);
        int age = voteobj.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }
        else
        {
            System.out.println("you are not eligible for vote");
        }

    }
}