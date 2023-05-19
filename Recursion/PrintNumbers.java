public class PrintNumbers {
    int i=1;
    public static void printNumbers(int n) {
        if (n > 1) {
            printNumbers(n - 1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10; // Change 'n' to your desired number
        printNumbers(n);
    }
}
