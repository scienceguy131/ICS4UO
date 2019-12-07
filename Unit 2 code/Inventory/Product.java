//Al
import java.util.ArrayList;
import java.io.*;

public class Product implements Serializable {
  
  private String code;
  private String name;
  private String description;
  private int qty;
  private int totalSales;
  
  public Product(String code,String name,String description,int qty,int totalSales) { 
    this.code = code;
    this.name = name;
    this.description = description;
    this.qty = qty;
    this.totalSales = totalSales;
  }
  
  public String[] printInventory(){
    String[] list = {code,name, Integer.toString(qty)};

    return list;
  }

  public  String getCode(){
    return code;
  }

  public String[] getAllAttributes(){
    String[] list = {code, name, description, Integer.toString(qty), Integer.toString(totalSales)};
    
    return list; 
  }

  public void setEditProduct(String code,String name,String description,int qty,int totalSales){
    this.code = code;
    this.name = name;
    this.description = description;
    this.qty = qty;
    this.totalSales = totalSales;
  }  

  public String[] listLow(){
    String[] list = {code, name, Integer.toString(qty)};
    
    return list;
  }

}//class
 