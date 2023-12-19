package varArgsExample;

public class VarArgsExample {
    // Method using varargs
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example 1: Calling sum() with multiple arguments
        int result1 = sum(1, 2, 3, 4, 5);
        System.out.println("Sum 1: " + result1);

        // Example 2: Calling sum() with an array
        int[] array = {10, 20, 30};
        int result2 = sum(array);
        System.out.println("Sum 2: " + result2);

        // Example 3: Calling sum() with no arguments
        int result3 = sum();
        System.out.println("Sum 3: " + result3);
    }
}
