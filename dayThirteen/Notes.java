package dayThirteen;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        MultiLines myStr = new MultiLines();
        myStr.scanStr();
        myStr.printWord();
    }
}

class MultiLines extends ScanStr {
    public void printWord()
    {
        for (int i=0; i < message.length(); i++) 
        {
            for (int j=0; j < i; j++)
            {
                System.out.print(message.charAt(j));                
            }
            System.out.println(message.charAt(i));
        }
    }    
}

class ScanStr {
    Scanner scanner = new Scanner(System.in);
    public String message;

    public void scanStr() 
    {
        System.out.println("Type a word: ");
        message = scanner.nextLine();
    }
}