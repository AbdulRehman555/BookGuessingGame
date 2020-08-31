import java.util.Scanner;
import java.io.File;
public class Game {
    public static void main(String[] args) throws Exception {
        int randomNum = 0;
        String book = "";
        boolean flag=false;

        File file = new File("BookFile.txt");
        Scanner scanner = new Scanner(file);

        randomNum = (int) ((Math.random() * 5) + 1);
        for (int i = 0; i < randomNum; i++)
            book = scanner.nextLine();

        Guess myGuess=new Guess();
        flag= myGuess.isMatched(book);

        if (flag)
            System.out.print("CONGRATS YOU WON\n");
        else
            System.out.print("LOOSER\n");
    }

}
