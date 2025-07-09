import java.util.Scanner;
public class userinput
{
    public static void main(String[] args)
    {
        Scanner stringScanner = new Scanner(System.in);
        String name,city;
        name="king";
        city="tenkasi";
        String street = stringScanner.nextLine();
        System.out.print("name is"+name);
        System.out.println(" I am from"+city);
        System.out.print(street);
    }
}