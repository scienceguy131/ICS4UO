public class Points {
  int x,y;
  
  public Points() { //no parameters
    this(0,0)
  }
  public Points(int x){// 1 parameters
    this(x,x)
  }
  public Points(int x, int y){// 2 parameters
    this.x = x;
    this.y = y;
  }  
}
