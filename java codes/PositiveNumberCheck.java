public class PositiveNumberCheck {
    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;  
        }
        return false; 
    }
    public static void main(String[] args) {
        int num = 5;
        if (isPositive(num)) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is not positive.");
        }
    }
}
