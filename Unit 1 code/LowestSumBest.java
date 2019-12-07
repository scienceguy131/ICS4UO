//Al-Ansar Mohammed
//Displays sum of lowest 3 numbers in a given array of integers
//Sorts list, then selects lowest 3
//Pros: Works, simple concept
//Con: Requires the entire list to be sorted before

public class LowestSumBest {
  public static void main(String[] args) { 
    int[] array = {0,3,3,2,1,6,8,1,-1,1,4,-8};
    int[] newarray = sorter(array);
    int lowestsum = newarray[0]+newarray[1]+newarray[2];
    System.out.println("The lowest sum is: " + lowestsum); 
    for(int value: newarray){
      System.out.print(value+" ");
    }
  }
  
  public static int[] sorter(int[] array){
    boolean sorted = false;
    while (!sorted){
      sorted = true;
      for(int x = 0; x < array.length-1; x++){  
        if (array[x] > array[x+1]){
          sorted = false;
          int temp = array[x+1];
          array[x+1] = array[x];
          array[x] = temp;
        } 
      }
    }
    return array;
  }
}

