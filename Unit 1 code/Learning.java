// Learning Java syntax and different properties

public class Learning {
  // please stop viciously murdering stubborn arguers (mnemonic)
  public static void main(String[] args) {
    int integer = 609394;
    double bigdeci = 5.99434;//most used
    
    float smalldeci = 5.555f; // if you use float you must cast it
    smalldeci = (float)34.4;
    char character = '*';//any ascii character, SINGLE QUOTES
    
    String word = "lmaoooo gotem";//capitalize String
    String word2 = "yo Mama";
    String word3 = word + word2;//Output: lmaoooo gotemyo mama
    
    boolean check = true;
    check = 5<4; //false
    
    //*printing*
    System.out.println("Helo world, but this time in java");
    int iq = 9000;
    System.out.println("iq: " + iq);
    
    if (true == true){
      System.out.println("I knew this b*tch named becky");
    } else {
      System.out.println("Becky? New phone who dat");
    }
    
    int a = 4;
    int b = 5;
    boolean result;
    result = a < b; // true
    result = a > b; // false
    result = a <= 4; // a smaller or equal to 4 - true
    result = b >= 6; // b bigger or equal to 6 - false
    result = a == b; // a equal to b - false
    result = a != b; // a is not equal to b - true
    result = a > b || a < b; // Logical or - true
    result = 3 < a && a < 6; // Logical and - true
    result = !result; // Logical not - false
    
    int maybe = 4 == 4 ? 4:5;
    
    
    //arrays 
    int[] firstarray;//empty array
    firstarray = new int[10];//array of size 10
    
    int[] secondarray = new int[5];//size 5
    System.out.println(secondarray.length);
    secondarray[0] = 0;
    
    int[] thirdarray = {0,1,2,3,4,5,6,7,8,9};
    
    System.out.println(thirdarray);
    
    String[] stringarray = {"lol","ol","oike"};
    
    //loops
    
    //for loops
    for(int i = 0; i < 5; i++ ){
      System.out.println("Yo mama so old that her first pet was a T-rex");
      int mamaAge = ((i + 1) * 100);
      System.out.println("Your mama's age: " + mamaAge);
    }
    
    //while loops
    int c = 8;
    while(c < 15){
      System.out.println(c + " is less than 15");
      c++;
    }
    c=0;
    do{
      System.out.println(a + " is less than or equal to 0");
      c++;
    } while(c==0);
    
    // instead of this:
    int[] newarray = {1, 9, 9, 5};
    for (int i = 0; i < newarray.length; i++) {
      int el = newarray[i];
      System.out.print(el);
    }
    System.out.println();
    
    //we can do this:
    int[] newerarray = {1,2,3,4,5};
    for (int element:newerarray){
      System.out.println(element);
    }
    System.exit(0);
    
    
    
    
    
    
    
    
  }
  
}
