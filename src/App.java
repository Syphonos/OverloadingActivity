public class App {

    // Taking 2 parameters and returning the sum
    private static int computeSum(int num11, int num22) {
        return num11 + num22;
    }

    // Taking 3 parameters and returning the sum
    private static int computeSum(int num11, int num22, int num33) {
        return num11 + num22 + num33;
    }

    // Taking 2 parameters and getting the largest value among the 2 integers
    public static int greaterValue(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Taking 2 parameters and getting the largest value among the 2 doubles
    public static double greaterValue(double num1, double num2) {
        if(num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Printing out the sum of the 2 and 3 parameters of the method computeSum()
    // Printing out the Largest Value of both the integer and the double
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        System.out.print("\n");
        System.out.println("Sum of the numbers 16 and 53 is: " + computeSum(16, 53));
        System.out.println("Sum of the numbers 54, 2307, and 4608 is: " + computeSum(54, 2307, 4608));
        System.out.print("\n");
        System.out.println("The greater value between 34 and 35 is: " + greaterValue(34, 35));
        System.out.println("The greater value between 3.14 and 6.9 is: " + greaterValue(3.14, 6.9));
        System.out.print("\n");
    }
}