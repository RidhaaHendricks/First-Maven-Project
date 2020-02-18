package za.ac.cput;

 import java.util.Scanner;

public class HelloTest extends Hello {
    public static void main(String args[]){

        Hello hlo = new Hello();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        hlo.setName(sc.next());
        System.out.println("Enter surname: ");
        hlo.setSurname(sc.next());
        System.out.println("Enter age: ");
        hlo.setAge(sc.nextInt());
        System.out.println("Enter number: ");
        hlo.setNumber(sc.next());

        System.out.println(hlo.toString());

    }
}
