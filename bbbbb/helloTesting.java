public class helloTesting {

    public static void main(String[] args) {
        System.out.println("Hello Testing");
    }

    public static Boolean even(int numb) {

        if (numb % 2 == 0) {
            System.out.println("Number " + numb + "is even");
            return true;
        } else {
            System.out.println("Number " + numb + "is odd");
            return false;
        }
    }
}