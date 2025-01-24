public class FirstEvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { 
                System.out.println("The first even number is: " + i);
                break;  
            }
        }
    }
}
