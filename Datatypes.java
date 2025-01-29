import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("start giving inputs");
            int p=scanner.nextInt();
            double q =scanner.nextDouble();
            float r =scanner.nextFloat();
            long s=scanner.nextLong();
            System.out.println("enter the char");
            char character=scanner.next().charAt(0);
            System.out.println("enter name");
            String name=scanner.next();
            System.out.println(p);
            System.out.println(q);
            System.out.println(r);
            System.out.println(s);
            System.out.println(character);
            System.out.println(name);
            scanner.close();
        }
    }    
}
