import java.util.Scanner;

public class booking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of tickets");
        int numberOfTickets = scanner.nextInt();

        System.out.println("Enter the age of the user");
        int age = scanner.nextInt();

        System.out.println("Enter the discount of the price");
        int ticketPrice = scanner.nextInt();

        if (age <= 10 || age > 50) {
            System.out.println("Tickets are free");
        } else if (age > 10 && age <= 20) {
            System.out.println("Tickets are Rs.100");
            int cost = numberOfTickets*100;
            System.out.println("Your ticket cost is :" +cost);
        } else if (age > 20 && age <= 40) {
            System.out.println("Tickets are Rs.200");
            int cost = numberOfTickets*200;
            System.out.println("Your ticket cost is :" +cost);
        } else if(age>40 && age<=50){
            System.out.println("Trickets are Rs.150");
            int cost = numberOfTickets*150;
            System.out.println("Your ticket cost is :" +cost);
        }

        double totalCost = numberOfTickets * ticketPrice;

        // Apply discounts based on the number of tickets
        if (numberOfTickets >= 5 && numberOfTickets < 10) {
            double discount = numberOfTickets * ticketPrice * 5;
            totalCost -= discount;
            System.out.println("5% discount applied. Total cost after discount: " + totalCost);
        } else if (numberOfTickets >= 10) {
            double discount = numberOfTickets * ticketPrice * 10;
            totalCost -= discount;
            System.out.println("10% discount applied. Total cost after discount: " + totalCost);
        } else {
            System.out.println("Total cost: " + totalCost);
        }
    }
}

