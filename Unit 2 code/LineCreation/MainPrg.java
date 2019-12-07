public class MainPrg {
  public static void main(String[] args) { 
   
    Points p1 = new Points(1,2);
    Points p2 = new Points(0);
    System.out.println("Point 1: (" + p1.x +","+ p1.y +")");
    System.out.println("Point 2: (" + p2.x +","+ p2.y +")");
    
    Lines line1 = new Lines(p1,p2);
    
    int m = line1.slope();
    System.out.println("Slope of this line is: " + m);
    
    int b = line1.bValue();
    System.out.println("The y intercept of this line is: " + b);
    
    String eqn = line1.eqn();
    System.out.println("The equation for your line is: "+eqn);
  }
}
