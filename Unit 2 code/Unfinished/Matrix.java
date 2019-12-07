//Gauss Jordan Elimination Solver, not functional yet

public class Matrix {
  public static void main(String[] args) { 
    double[][] matrix = 
    {{0,1,2},
     {3,4,5}};
    printMatrix(matrix);
    System.out.println("eq3weqwe");
    for (int row = matrix.length-1; row>-1;row--){
      for (col = 0; col<matrix[row].length;col++){
         //a = matrix[row][col] and col[row-1]
         // matrix[row][col]*matrix[row][col]
         //  matrix [row-1]
      }
    }
          
    
    
      
      
    

  }
    public static void printMatrix(double[][] matrix){
      for(int x = 0;x < matrix.length;x++){
        for(int y = 0;y < matrix[x].length;y++){
          System.out.print(matrix[x][y]+"  ");
        }
        System.out.println();
      }
    }
  
}
