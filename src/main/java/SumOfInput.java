import java.util.Scanner;

class SumOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number here: ");
        int num = scanner.nextInt();
        System.out.println("Some number " + sumNumbers(num));
        System.out.println("Some number " + sumGuassian(num));
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static int sumGuassian(int n) {
        int total = 0;
//        for (int i = 1; i <= n; i++) {
            total = (n * (n + 1)) / 2;
      //  }
        return total;
    }
}







