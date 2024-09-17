package pratice;

public class Findoddnumber{
    public static void main(String[] args) {
        int limit = 10; 
        System.out.println("Odd numbers in ascending order:");

        for (int i = 1; i <= limit; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}