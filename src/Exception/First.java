package Exception;

public class First {
    public static void main(String[] args) {
//        int x=10;
//        int y = 0;
        try {
            int data =50/0;
           // System.out.println(x/y);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        System.out.println("can you see me");
    }
}
