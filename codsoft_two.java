import java.util.Scanner;

public class codsoft_two {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Welcome to the currency converter! ");
        System.out.println("1.USD to Rupees");
        System.out.println("2.Rupees to USD");
        System.out.println("3.Rupees to Euro");
        System.out.println("4.Euro to Rupees");
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("Enter the amount in USD: ");
            double usd = sc.nextDouble();
            double rupees = usd * 83.52;
            System.out.println("The amount in Rupees is: "+rupees);
            break;

            case 2:
            System.out.println("Enter the amount in Rupees: ");
            double rupees1 = sc.nextDouble();
            double usd1 = rupees1 / 83.52;
            System.out.println("The amount in USD is: "+usd1);
            break;

            case 3:
            System.out.println("Enter the amount in Rupees: ");
            double rupees2 = sc.nextDouble();
            double euro = rupees2 / 91.08;
            System.out.println("The amount in Euro is: "+euro);
            break;

            case 4:
            System.out.println("Enter the amount in euro: ");
            double euro1 = sc.nextDouble();
            double rupees3 = euro1 * 91.08;
            System.out.println("The amount in Rupees is: "+rupees3);
            break;

            default:
            System.out.println("Invalid Option");
    
        }

        sc.close();
    }
}
