//Al-Ansar Mohammed
//Sept 29th 2019
//Given an array of integers with at least one 8 and one 9, and an equal number 
//    of 8s and 9s, returns the array with the 9 immediately following the 8
//    while keeping the relative order the same
//Pros: Works, simple algorithm
//Cons: None that I can think of, but maybe in the future handle cases in which
//    the amount of 9s and 8s aren't equal


public class EightyNineV2 {
  public static void main(String[] args) { 
    int[] a = {9,8,1};
    //int[] eightyNinearray = eightyNine(a);
    int[] eightyNinearray = eightyNineNewList(a);
    for(int value:eightyNinearray){
      System.out.print(value);
    }
  }
  
  //This works by making a new list of the same length as the old one(length doesn't change), then 
  //it goes through the list and adds numbers to the new list in sequence,but skipping 9s. it does this
  //until it reaches an 8 if it reaches an 8 it will add a 9 next and add to the nine counter, then it contiues normally
  //current errors: none
  public static int[] eightyNineNewList(int[] array){
    int[]eightyNine = new int[array.length];
    int index = 0;
    int nineCounter = 0;
    while (index <= array.length-1) { 
      if (array[index] == 9){
        nineCounter--;//because we aren't adding this 9 (we only add following an eight)
        index++;
      }else{//as long as its not a nine it will add it 
        eightyNine[index+nineCounter] = array[index];//because if there's a nine it will shift eightyNine one to the right, this offets it
        if (array[index] == 8){//if it is an eight a nine will be auto added afterwards
          eightyNine[(index+nineCounter)+1] = 9;//makes the index after eight to 9
          nineCounter++;//to account for the shift in array
          index++;
        }
      } 
    }
    return eightyNine;
  }



    
    

  /*
  //this one was made because we didn't know if we were actually allowed to just do this rather than swapping the 9
  //so this one finds the index of the nearest single 9, then finds the index of the nearest 8
  // then based on which one is greater the 9 is either moved forwards or backwards to reach the eight
  
  //current errors: not exactly finished, need to finish the swap function and make sure i have indices set right
  public static int[] eightyNine(int[] array){
    for (int x = 0; x<array.length-1; x++){
      if (array[x] != 9){continue;}//only care if we have a 9 
      if (array[x-1] == 8){continue;}//if theres already a 8 in front, disregard the 9 (done)
      for(int y = 0; y<array.length-1; y++){
        if ((array[y] == 8) && (array[y+1] !=9)){
          if (y < x){//we have to move 9 back towards the 8
            for(int z = x; x < y; z--){
              //switch 9 with what's before it
              int temp = array[z];
              array[z] = array[z-1];
              array[z-1] = temp;
            }           
          }else{
            for(int z = x; y < x; z++){
              int temp = array[z];
              array[z] = array[z-+1];
              array[z+1] = temp;
            }
        }
      }
      
      
    }
    
    }
    return array;
  }
  */
  
  
  
}




  