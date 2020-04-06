package Exception;

public class MultipleException2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Bound Exception");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }
        System.out.println("Code...");
    }
}