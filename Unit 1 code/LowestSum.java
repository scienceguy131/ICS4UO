//Al-Ansar Mohammed
//Sorts a given array of integers and prints the lowest 3
//Pros: Works
//Cons: Really inefficent sorting method, like supppper bad



public class LowestSum {
  public static void main(String[] args) { 
    int[] array = {-1,0,3,2,1,6,8,1,1,1,4,8};
    int[] newarray = sorter(array);
    int lowestsum = newarray[0]+newarray[1]+newarray[2];
    System.out.print("The lowest sum is: " + lowestsum); 
  }
  public static int[] sorter(int[] array){
    boolean sorted = false;// contiues until whole list is sorted
    while (!sorted){
      for(int x = 0; x < array.length; x++){
        for(int y = 0; y < array.length; y++){
          if (array[x] < array[y]){//array[x] =0, array[y] =5
            int temp = array[y];// temp = 5
            array[y] = array[x];//array[y] =0
            array[x] = temp;//array[x]= 5
          } 
       }
     }
      for(int x = 0; x < array.length; x++){
        for(int y = 0; y < array.length; y++){
          if(x == y){continue;}
          sorted = true;
          if (array[y] <= array[x]){continue;}
          else{sorted = false;} 
        }
      }
    }
    return array;
  }
 }
    for (int value:newarray){
      System.out.print(value+" "); // this is to check my sorted list
    } 
}

