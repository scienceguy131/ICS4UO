import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization {
  public static void main(String[] args) { 
    
    //String fileName = "DemoClassData";//
    
   DemoClass child1 = new DemoClass(8,"anika");
    
    try{
      FileOutputStream file = new FileOutputStream("DemoData"); // new obj called file
      ObjectOutputStream out = new ObjectOutputStream(file);// new obj called out
      
      out.writeObject(child1);     
      out.close(); 
      file.close(); 
      System.out.println("Child1 has been serialized");
    }
    catch(Exception ex){System.out.println("Exception");}
    
    
    try{
      DemoClass none = null;
      FileInputStream file = new FileInputStream("DemoData"); // new obj called file
      ObjectInputStream in = new ObjectInputStream(file);// new obj called in
    
      none = (DemoClass)in.readObject();
      in.close(); 
      file.close(); 
              
      System.out.println("Object has been deserialized "); 
      //System.out.println(child1.age + child1.name); 
    }
   
    catch(Exception ex){System.out.println("Exception");}
    //catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");} 
    
    
    
    
    

    
  }
}
