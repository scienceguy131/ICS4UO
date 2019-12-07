public class Arraychallenge {
  public static void main(String[] args) { 
    //q1 -  addition checker
    int[] numList = {1,1,1};
    int addto = 3;
    //returnadditoncombos(numList,addto);
    dupesBeGone(numList);
    //q2 - duplicate remover
    
  }
  public static void dupesBeGone(int[] dupeList){
    int[] noDupeList;
    int numDupes = 0;//********NEED TO ADD IF 0 AT THE END THEN RETURN ORGINAL LIST
    int[] dupeIndex = new int[1];
    
    for(int x = 0; x < dupeList.length; x++){
      for(int y = x+1; y < dupeList.length; y++){//x+1 allows it to compare every possible int without repeating itself
        if (dupeList[x] == dupeList[y]){
          if (numDupes == 0){
            dupeIndex[0] = y;
            numDupes++;
          }
          boolean indexInDupeList = false;
          for (int value:dupeList){
            if (y == value){
              indexInDupeList = true;
            }
          }
          if(!indexInDupeList){
            int[] temp = new int[dupeIndex.length+1];
            for(int i = 0; i < dupeIndex.length; i++){
              temp[i] = dupeIndex[i];
            }
            temp[temp.length-1] = y;
            dupeIndex = temp;
            
            numDupes++;

          }
        }
          
          /*if (numDupes == 0){
            dupeIndex[0] = y ;
            numDupes++;
            }else{
            System.out.println("reached else");  
            for (int i = 0; i < numDupes; i++){
              int[] updatedDupeIndex = new int[dupeIndex.length +1];
              for(int ii = 0; ii < dupeIndex.length; ii++){
                updatedDupeIndex[ii] = dupeIndex[ii];
                }
              updatedDupeIndex[updatedDupeIndex.length-1] = dupeList[y];
              dupeIndex = updatedDupeIndex;
              
              }     
           numDupes++; 
           }  
          }*/
        }    
      }
    
    for(int value:dupeIndex){
    System.out.print(value +" ");
    }
    System.out.println("\n" + numDupes);
  }

  public static int returnadditoncombos(int[] numlist,int numgoal){
    int combinations = 0;
    
    for(int x = 0; x < numlist.length; x++){
      for (int y = 0; y < numlist.length; y++){
        if ((x != y) && (numlist[x] + numlist[y] == numgoal)){
          System.out.println(numlist[x] + " + " + numlist[y] + " = " + numgoal);
          combinations++;
     }}}
    combinations /= 2;
    System.out.println(combinations);
    return combinations;
  }
  
}
