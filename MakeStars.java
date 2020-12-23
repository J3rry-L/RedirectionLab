import java.util.*;
public class MakeStars{
  public static void main(String[] args){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner(System.in);
      while (n.hasNextLine()){
        Scanner w = new Scanner(n.nextLine());
        while (w.hasNext()){
          int wordLength = w.next().length();
          for (int i = 0; i < wordLength; i++){
            System.out.print("*");
          }
          System.out.print(" ");
        }
      System.out.print("\n");
      }
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
