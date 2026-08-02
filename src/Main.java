import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char choice0;

        System.out.println("***********************************");
        System.out.println("****Welcome to Multi-Calculator****");
        System.out.println("***********************************");
        System.out.println("Please enter your choice: ");
        System.out.println("A. Basic Calculator");
        System.out.println("B. Circumference Calculator");
        choice0  = Character.toUpperCase(scanner.next().charAt(0));



        switch(choice0){
            case 'A' -> {
                System.out.println("********************");
                System.out.println("**Basic Calculator**");
                System.out.println("********************");

                double C1num1;
                double C1num2;
                char C1Operator;
                double C1result = 0;
                boolean c1validOperator = true;


                System.out.print("Enter first number: ");
                C1num1 = scanner.nextDouble();

                System.out.print("Enter the operator (+, -, *, /, ^): ");
                C1Operator = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                C1num2 = scanner.nextDouble();


                switch(C1Operator){
                    case '+' -> C1result = C1num1 + C1num2;
                    case '-' -> C1result = C1num1 - C1num2;
                    case '*' -> C1result = C1num1 * C1num2;
                    case '/' -> {
                        if (C1num2 == 0) {
                            System.out.println("Cannot divide by zero");
                            c1validOperator = false;
                        } else {
                            C1result = C1num1 / C1num2;
                        }
                    }
                    case '^' -> C1result = Math.pow(C1num1, C1num2);
                    default -> {
                        System.out.println("Invalid input");
                        c1validOperator = false;
                    }
                }
                if(c1validOperator){
                    System.out.printf("The result is: %.3f", C1result);
                }
            }
            case 'B' -> {

                char choice01;

                System.out.println("****************************");
                System.out.println("**Circumference Calculator**");
                System.out.println("****************************");
                System.out.println("Please enter your choice: ");
                System.out.println("A. Solve for Circumference");
                System.out.println("B. Solve for Radius");
                System.out.println("C. Solve for Diameter");
                System.out.println("D. Solve for Area");
                choice01 = Character.toUpperCase(scanner.next().charAt(0));

                double C2radius;
                double C2circumference;
                double C2rdiameter;
                double C2rarea;


                double C2circumferenceans;
                double C2radiusans;
                double C2diameterans;
                double C2areaans;

                switch(choice01){
                    case 'A' -> {
                        System.out.println("*****************");
                        System.out.print("Enter the radius: ");
                        C2radius =  scanner.nextDouble();

                        C2circumferenceans = 2 * Math.PI * C2radius;
                        System.out.printf("The Circumference of the circle is: %.2f", C2circumferenceans);
                    }
                    case 'B' -> {
                        System.out.println("******************");
                        System.out.print("Enter the Circumference: ");
                        C2circumference = scanner.nextDouble();

                        C2radiusans = C2circumference / (2 * Math.PI);
                        System.out.printf("The Radius of the circle is: %.2f", C2radiusans);
                    }
                    case 'C' -> {
                        System.out.println("****************");
                        System.out.print("Enter the radius: ");
                        C2rdiameter = scanner.nextDouble();

                        C2diameterans = 2 * C2rdiameter;
                        System.out.printf("The Diameter of the circle is: %.2f",C2diameterans);

                    }
                    case 'D' -> {
                        System.out.println("****************");
                        System.out.print("Enter the radius: ");
                        C2rarea =  scanner.nextDouble();

                        C2areaans = Math.PI * Math.pow(C2rarea, 2);
                        System.out.printf("The area of the circle is: %.2f",C2areaans);
                    }
                }






            }
        }






    }
}