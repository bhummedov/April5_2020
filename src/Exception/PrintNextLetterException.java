package Exception;
import java.util.Scanner;

public class PrintNextLetterException {
    String sentence="word";
    public PrintNextLetterException(){
    }
    public PrintNextLetterException(String sentence){
        this.sentence=sentence;
    }
    public void printNextLetters(){
        char letter;
        try{
            for (int i=0 ; i<=this.sentence.length();i++){
                letter=this.sentence.charAt(i);
                letter++;
                System.out.println(letter);
            }
        }
        catch (NullPointerException e){
            System.out.println("String is null!!");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("\n Hold on champ you exceeded");
        }
        catch (Exception e){
            System.out.println("Daddy got you");
        }
    }
}







