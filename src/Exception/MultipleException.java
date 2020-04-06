package Exception;

public class MultipleException {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            //arr[10]=10;
            arr[5] = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array Index Out BoundsException");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }
        System.out.println("Rest of the code");
    }
}
