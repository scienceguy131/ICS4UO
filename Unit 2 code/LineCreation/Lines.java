public class Lines {
  Points p1,p2;
  
  //CONSTRUCTORS
  public Lines(Points p1,Points p2){//when declaring lines 2 point values are required
    this.p1 = p1;
    this.p2 = p2;
  }
  
  public Lines(int x1, int y1, int x2, int y2){//given two coordinates
    p1 = new Points(x1,y1);
    p2 = new Points(x2,y2);
  }
  
  //METHODS
  public int slope(){
    return (p1.y-p2.y)/(p1.x-p2.x);
  }
  
  public int bValue(){
    int m = slope();
    return (p1.y -(m*p1.x));
  }
  
  public String eqn(){
    int m = slope();
    int b = bValue();
    if(b==0 && m == 0){
      return("y = x");
    } else if (b == 0){
      return("y = " + m + "x");
    }
    return("y = " + m + "x + " + b);   
  }
}
  
  
  