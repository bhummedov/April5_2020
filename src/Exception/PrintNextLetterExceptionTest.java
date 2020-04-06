package Exception;

public class PrintNextLetterExceptionTest {
    public static void main(String[] args) {
        PrintNextLetterException myLtr = new PrintNextLetterException();
        System.out.println(myLtr.sentence);
        myLtr.printNextLetters();
        PrintNextLetterException myLtr2 = new PrintNextLetterException();
        System.out.println(myLtr2.sentence);
        myLtr2.printNextLetters();
    }

}
