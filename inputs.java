import java.util.Scanner; // importent for implmenting scanner object

class inputs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // used for simpal user input
        // the 6 data types:  byte, short, int, long, float, and double. ordered from smallest to largest 
        System.out.println("enter num: ");
            // asighnment statment(variable = declration)
        int input1 = sc.nextInt();
        System.out.println("enter another num: ");
        int input2 = sc.nextInt();
        double permVar = 2.5;

        System.out.println((input1 + input2) * permVar );
    }
}

// interview question one: what can the implmentation of scanner do for a program

// intervew question two: what are the 6 tpes of Data Types
