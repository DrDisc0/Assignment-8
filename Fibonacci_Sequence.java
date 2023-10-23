package assignment_8;

public class Fibonacci_Sequence {

}
public static void main(String[] args) {
    if (args.length != 1) {
        System.out.println("Usage: java Fibonacci <position>");
        return;
    }

    try {
        int position = Integer.parseInt(args[0]);
        long result = computeFibonacci(position);
        System.out.println("Fibonacci number at position " + position + ": " + result);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please provide a valid integer position.");
    }
}

public static long computeFibonacci(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }

    long prev = 0;
    long current = 1;

    for (int i = 2; i <= n; i++) {
        long next = prev + current;
        prev = current;
        current = next;
    }

    return current;
}
}