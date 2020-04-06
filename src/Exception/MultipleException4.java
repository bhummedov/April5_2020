package Exception;

public class MultipleException4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 40 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Excetion handled");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index Out Bound Exception handled");
//        }
        System.out.println("Codes");
    }
}
