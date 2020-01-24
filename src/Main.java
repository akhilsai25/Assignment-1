import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length==0)
        {
                System.out.println("Please enter the name of person. ");
                Scanner sc = new Scanner(System.in);
                name = sc.nextLine();
        }
        else
            name=args[0];
        Person person=new Person(name);
        System.out.println(person.toString());
    }
}
