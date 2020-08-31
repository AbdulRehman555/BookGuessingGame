import java.util.Scanner;

public class Guess {
    private char[] chr;
    private boolean flag;

    public Guess(){
        chr=new char[10];
        flag=false;
    }

   public boolean isMatched(String book) {
       int bookLength = book.length();
       chr = book.toCharArray();
       Scanner scan = new Scanner(System.in);
       System.out.println("Guess the book: ");
       for (int i = 2; i >= 0; i--) {
           System.out.println("~~~~~~~~~~ Guess left : " + (i + 1) + " ~~~~~~~~~~");
           int trueCount = 0;
           int falseCount = 0;

           System.out.print("HINT ->  ");
           for (int j = 0; j < bookLength; j++)
               System.out.print("_ ");
           System.out.print("\n");
           for (int k = 0; k < bookLength; k++) {
               char name = scan.next().charAt(0);
               if (name == chr[k]) {
                   System.out.println("\tTRUE");
                   trueCount++;
               } else {
                   System.out.println("\tFalse");
                   falseCount++;
               }
           }
           System.out.print("True characters guessed = " + trueCount + "\n");
           System.out.print("False characters guessed = " + falseCount + "\n");
           if (trueCount == bookLength) {
               flag = true;
               break;
           }
           if (i != 0)
               System.out.print("Guess again\n");

       }
       return flag;
   }
}
