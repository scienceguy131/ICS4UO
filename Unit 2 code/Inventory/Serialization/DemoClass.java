import java.io.Serializable;

public class DemoClass implements Serializable{
  int age;
  String name ;
  
  public DemoClass(int age, String name) { 
   this.age = age;
   this.name = name;
  }
}
