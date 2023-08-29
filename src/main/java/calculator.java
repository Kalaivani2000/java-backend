import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the first value: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second value: ");
            int number2 = scanner.nextInt();

            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            int result;

            switch (choice) {
                case 1 -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                case 2 -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }
                case 3 -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }
                case 4 -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                default -> {
                    System.out.println("Invalid choice.");
                }
            }
                  System.out.println("Enter the option:");


                int option=scanner.nextInt();
                if(option==2){
                    System.out.println("It will exit");
                    break;
                } else if (option==1) {
                    System.out.println("It will continue");
                    continue;
                }else{
                    System.out.println("Invalid choice of the condition");
                    break;
                }
        }
        }
    }

