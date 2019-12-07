//Messing around with scanner and parseInt

import java.util.Scanner;
public class Dateme {
  public static void main(String[] args) {
    System.out.println(args.length);
    Scanner inputobj = new Scanner(System.in);
    System.out.println("Enter your date and amount of days");
    String userInput = inputobj.nextLine();
    
    String[] userInputArrString = userInput.split(" ",0);
    int[] userInputArr = new int[userInputArrString.length];
    for (int x = 0; x<userInputArr.length;x++){
      userInputArr[x] = Integer.parseInt(userInputArrString[x]);
      
    }
  }

}
