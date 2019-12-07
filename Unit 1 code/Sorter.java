//Mohammed, Al-Ansar
//Main Sorting Algorithms  

public class Sorter {
  public static void main(String[] args) { 
  
  }      
} 

//bubble sort
public static int[] bubbleSort(int[] array){
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

//insertion sort
public static int[] insertionSort(int[]array){
  boolean sorted = false;
  while(!sorted){
    System.out.println();
    sorted = true;
    for(int x = 0; x < (array.length-1); x++){
      if (array[x] > array[x+1]){
        sorted = false;
        int temp = array[x+1];
        array[x+1] = array[x];
        array[x] = temp;
        for(int y = x; y >= 1; y--){
          if (array[y] < array[y-1]){
            int temp2 = array[y-1];
            array[y-1] = array[y];
            array[y] = temp2;
          }
        }
      }
    }      
  }  
  return array;
}

//selection sort
public static int[] selectionSort(int[]array){
  for (int x = 0; x < array.length-1;x++){
    int minValueIndex = array[x];
    int minValue = x;
    for(int y = x+1; y < array.length-1;y++){
      if(array[y] < minValue){
        minValueIndex = y;
        minValue = array[y];
      }
    }
    if(x != minValueIndex){
      array[minValueIndex] = array[x];
      array[x]= minValue;    
    }
  }
  return array;
}

//simple sort
public static int[] simpleSort(int[]array){
  int[] sorted = new int[array.length];
  int max = array[0];
  for(int x = 0; x<array.length-1; x++){
    if (array[x]> max){
      max = array[x];
    }
  }
  
  for(int i = 0; i<array.length-1; i++){
    int min = array[0];
    int minIndex = 0;
    for(int y = 0; y<array.length-1; y++){
      if (array[y]<= min){
        min = array[y];
        minIndex = y;
      }
    }
    System.out.println(min);
    sorted[i] = min;
    array[minIndex] = max;
  }
  return sorted;
}

}//end
