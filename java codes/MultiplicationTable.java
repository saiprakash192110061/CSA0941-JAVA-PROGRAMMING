public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            // Inner loop for multiplying by the number
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
