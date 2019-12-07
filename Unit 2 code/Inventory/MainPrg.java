//AL
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class MainPrg {

  public static void main(String[] args) {

    //in case of IOexception, creates default values
    ArrayList<Product> masterList = startup();
    save(masterList);
    
    //ArrayList<Product> masterList = getData();//deserialize data
    running(masterList);

  }

  //Running program
  //Takes in list of products
  public static void running(ArrayList<Product> masterList) {

    System.out.println("\nWelcome to the Inventory Master 2.0\n");

    while (true) {
      System.out.println("****************Main Menu****************");
      System.out.println("1) Print Inventory");
      System.out.println("2) Print Product Details");
      System.out.println("3) Add New Product");
      System.out.println("4) Remove Product");
      System.out.println("5) Edit Product Details");
      System.out.println("6) List All Products With Less Than 11 Items");
      System.out.println("7) Search For a Product");
      System.out.println("8) Save Changes");
      System.out.println("9) Save Changes and Exit Program\n");

      Scanner input = new Scanner(System.in);
      int menuChoice = menuChoice(input);

      switch (menuChoice) {
      case 1:
        printInventory(masterList);
        break;
      case 2:
        productDetail(masterList, input);
        break;
      case 3:
        addProduct(masterList, input);
        break;
      case 4:
        removeProduct(masterList, input);
        break;
      case 5:
        editProduct(masterList, input);
        break;
      case 6:
        listLow(masterList);
        break;
      case 7:
        search(masterList, input);
        break;
      case 8:
        save(masterList);
        break;
      case 9:
        quit(masterList);
        break;
      }//switch
    } // while
  }// function


  //Gets menu choice
  //Takes in scanner object
  //Returns choice, int
  public static int menuChoice(Scanner input) {
   
    while (true) {
      
      System.out.println("Please enter a menu choice (1-9):");
      
      try {
        
        int menuChoice = Integer.parseInt(input.nextLine());
        System.out.println();

        if (menuChoice < 1 || menuChoice > 9) {//out of bound menu choice
          int error = (1 / 0);
        }

        return menuChoice;

      } catch (Exception a) {// non int entry
        
        System.out.println("\nInvalid Entry!\n");
        input.reset();

      } // catch
    }//while
  }//function


  //Prints inventory
  //Takes in list of products
  public static void printInventory(ArrayList<Product> masterList) {
    
    System.out.println("\n**********INVENTORY LIST**********\n");

    if (masterList.size()==0){
     System.out.println("There are no products!\n");
    }

    for (int x = 0; x < masterList.size(); x++) {
      
      String[] list = masterList.get(x).printInventory();// {code,name, Integer.toString(qty)}
      
      System.out.println("Code:" + list[0] + "\nName:" + list[1] + "\nLeft in Stock:" + list[2] + "\n");
    }

    System.out.println();

  }//function

  //Prints the details of product given its code
  //Takes in list of products and scanner object
  public static void productDetail(ArrayList<Product> masterList, Scanner input) {
    
    System.out.println("Please enter the item code:");
    String enteredCode = input.nextLine();
    System.out.println();

    Boolean itemFound = false;

    for (int x = 0; x < masterList.size(); x++) {
      
      String[] list = masterList.get(x).getAllAttributes();// {code,name,description,qty,total sales}

      if (enteredCode.equals(list[0])) {
        
        System.out.println("Product details of item with code '" + enteredCode + "':");
        
        System.out.println("Name: " + list[1] + "\nDescription: " + list[2] + "\nQuantity: "
        + list[3] + "\nTotal Sales: " + list[4] + "\n");

        itemFound = true;
      }//if
    } // for

    if (!itemFound) {
      System.out.println("Sorry, there is no item with the code: " + enteredCode + "\n");
    }//if
  } //function

  //Add new product
  //Takes in list of products and scanner object
  public static void addProduct(ArrayList<Product> masterList, Scanner input) {
    
    String newCode;
    int newQty;
    int newTotalSales;

    //handles code
    while (true) {
      try {

        System.out.println("Enter product code:");
        String enteredCode = input.nextLine();
        System.out.println();

        for (int x = 0; x < masterList.size(); x++) {

          String code = masterList.get(x).getCode();

          if (enteredCode.equals(code)) {
            int error = 1 / 0;
          }
        }//for

        newCode = enteredCode;
        break;

      } catch (Exception e) {
        System.out.println("An item with that code already exists, please try again.");
      }
    }//while

    //handles name
    System.out.println("Enter product name:");
    String newName = input.nextLine();
    System.out.println();

    //handles description
    System.out.println("Enter product description:");
    String newDescription = input.nextLine();
    System.out.println();

    //handles qty
    while (true) {
      try {

        System.out.println("Enter product quantity:");
        int enteredQty = Integer.parseInt(input.nextLine());
        System.out.println();

        if (enteredQty < 0) {
          int error = 1 / 0;
        }

        newQty = enteredQty;
        break;

      } catch (Exception e) {
        System.out.print("Please enter a whole number (0 or greater)\n");
      }
    }//while

    //handles total sales
    while (true) {
      try {
        
        System.out.println("Enter amount sold:");
        int enteredTotalSales = Integer.parseInt(input.nextLine());
        System.out.println();

        if (enteredTotalSales < 0) {
          int error = 1 / 0;
        }

        newTotalSales = enteredTotalSales;
        break;

      } catch (Exception e) {
        System.out.print("Please enter a whole number (0 or greater)\n");
      }
    }//while

    masterList.add(new Product(newCode, newName, newDescription, newQty, newTotalSales));
    System.out.println("'" + newName + "' has been added to inventory\n");
  }//function

  //Removes a product given its code
  //Takes in list of products and scanner object
  public static void removeProduct(ArrayList<Product> masterList, Scanner input) {
    
    System.out.println("Please enter the item code:");
    String enteredCode = input.nextLine();
    System.out.println();

    Boolean itemfound = false;

    for (int x = 0; x < masterList.size(); x++) {

      String code = masterList.get(x).getCode();

      if (enteredCode.equals(code)) {

        masterList.remove(x);
        
        System.out.println("Item with code '" + code + "' was sucessfully removed\n");
        
        itemfound = true;

      }//if
    }//for

    if (!itemfound) {
      System.out.println("Sorry, there is no item with the code: " + enteredCode + "\n");
    }
  }//function

  //Edit product details
  //Takes in list of products and scanner object
  public static void editProduct(ArrayList<Product> masterList, Scanner input) {
      
    Boolean itemfound = false;

    System.out.println("Enter the item code of the item you wish to edit:");
    String currentCode = input.nextLine();

    for (int x = 0; x < masterList.size(); x++) {
      
      String[] list = masterList.get(x).getAllAttributes();// {code,name,description,qty,total sales}
      
      if (currentCode.equals(list[0])) {

        String newCode;
        int newQty;
        int newTotalSales;
        
        //new code
        while (true) {
          try {
           
            System.out.println("Enter new product code or press 'enter' to leave the same:");
            String enteredCode = input.nextLine();

            if (enteredCode.equals("")){
              System.out.println("Code kept the same\n");
              newCode = list[0];

              break;
            }

            for (int y = 0; y < masterList.size(); y++) {

              String code = masterList.get(y).getCode();
              
              if (enteredCode.equals(code)) {
                int error = 1 / 0;
              }
            }//for

            newCode = enteredCode;
            break;
          
          } catch (Exception e) {
            System.out.println("An item with that code already exists, please try again\n");
          }
        }//while
    
        //new name
        System.out.println("Enter new product name or press 'enter' to leave the same:");
        String newName = input.nextLine();
  
        if (newName.equals("")){
          System.out.println("Name kept the same\n");
          newName = list[1];
        }
    
        //new description
        System.out.println("Enter new product description or press 'enter' to leave the same:");
        String newDescription = input.nextLine();

        if (newDescription.equals("")){
          System.out.println("Description kept the same\n");
          newDescription = list[2];
        }
    
        //new qty
        while (true) {
          try {
            
            System.out.println("Enter product quantity or press 'enter' to leave the same:");
            String enteredQtySTRING = input.nextLine();

            int enteredQtyINT; 
    
            if (enteredQtySTRING.equals("")){
              
              System.out.println("Quantity kept the same\n");
              newQty = Integer.parseInt(list[3]);

              break;

            } else {
              enteredQtyINT = Integer.parseInt(enteredQtySTRING);
            }

            if (enteredQtyINT < 0) {
              int error = 1 / 0;
            }

            newQty = enteredQtyINT;
            break;
         
          } catch (Exception e) {
            System.out.print("Please enter a whole number (0 or greater)\n");
          }
        }//while
    
        //new total sales
        while (true) {
          try {
           
            System.out.println("Enter amount sold or press 'enter' to leave the same:");
            String enteredTotalSalesSTRING = input.nextLine();

            int enteredTotalSalesINT;

            if (enteredTotalSalesSTRING.equals("")){

              System.out.println("Total sales kept the same\n");
              newTotalSales = Integer.parseInt(list[4]);

              break;

            }else{
              enteredTotalSalesINT = Integer.parseInt(enteredTotalSalesSTRING);
            }

            if (enteredTotalSalesINT < 0) {
              int error = 1 / 0;
            }

            newTotalSales = enteredTotalSalesINT;
            break;

          } catch (Exception e) {
            System.out.print("Please enter a whole number (0 or greater)\n");
          }
        }//while
  
        masterList.get(x).setEditProduct(newCode, newName, newDescription, newQty, newTotalSales);
        System.out.println("Product updated!");
        
        itemfound = true;

        break;

      }//if
    }

    if (!itemfound) {
      System.out.println("Sorry, there is no item with that code\n");
    }

  }//function

  //List products with less than 11 items in stock
  //Takes in list of products 
  public static void listLow(ArrayList<Product> masterList) {
    
    Boolean itemFound = false;

    for (int x = 0; x < masterList.size(); x++) {

      String[] list = masterList.get(x).listLow();// {code,name,qty}

      if (Integer.parseInt(list[2]) <= 10) {
        
        System.out.println("Warning! Less than 11 left in stock:");
        System.out.println("Code:" + list[0] + "   Name:" + list[1] + "   QTY:" + list[2] + "\n");
        
        itemFound = true;
      } // if
    } // for

    if (!itemFound) {
      System.out.println("All products have more than 10 items in stock.\n");
    }
  }// function

  //Search for a given term  
  //Takes in list of products and scanner object
  public static void search(ArrayList<Product> masterList, Scanner input) {
    
    Boolean itemFound = false;

    System.out.println("Enter search term:");
    String searchTerm = input.nextLine();
    
    System.out.println("Searching for '" + searchTerm + "':");

    for (int x = 0; x < masterList.size(); x++) {
      
      String[] list = masterList.get(x).getAllAttributes();// {code,name,descripton,qty,total sold}
      
      for (int i = 0; i < list.length; i++) {
        
        if ((list[i].toLowerCase()).contains(searchTerm.toLowerCase())) {
          
          itemFound = true;
          
          System.out.println("Code: " + list[0] + "  Name: " + list[1] + "  Description: " + list[2] + "  Qty: "
              + list[3] + "  Total Sold: " + list[4]);
          
              break;
        }//if
      } // for i
    } // for x

    if (!itemFound) {
      System.out.println("There is no product containing the term '" + searchTerm + "'");
    }

    System.out.println();

  }// function

  //Serializes data
  //Takes in list of products 
  public static void save(ArrayList<Product> masterList) {
    
    System.out.println("Saving data");
    
    try {
      
      FileOutputStream file = new FileOutputStream("Data"); // new obj called file
      ObjectOutputStream out = new ObjectOutputStream(file);// new obj called out

      out.writeObject(masterList);//writes to file
      out.close();
      file.close();
      
      System.out.println("Data has been saved");
    
    } catch (IOException ex) {
      System.out.println("IOException");
    }
  }

  //Deserializes data
  //accesses data from a 'Data' file that is in the same folder as this program
  //returns list of products
  public static ArrayList<Product> getData() {

    System.out.println("Retrieving Data");

    ArrayList<Product> masterList = null;

    try {

      FileInputStream file = new FileInputStream("Data"); // new obj called file
      ObjectInputStream in = new ObjectInputStream(file);// new obj called in

      masterList = (ArrayList<Product>) in.readObject();

      in.close();
      file.close();

      System.out.println("Data has been retrieved");

    } catch (IOException ex) {
      System.out.println("IOException");

    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException");
    }

    return masterList;
    
  }//function

  //Saves and quits program
  //Takes in list of products 
  public static void quit(ArrayList<Product> masterList) {  
   
    save(masterList);
    
    System.out.println("\nGoodbye!");
    
    System.exit(0);
  }

  //start up data in case of IO error
  //if IO Error occurs, delete data file and call this function
  //returns list of products
  public static ArrayList<Product> startup() {
    Product prod1 = new Product("1", "apple", "anti-doctor", 560, 440);
    Product prod2 = new Product("2", "banana", "made for hands", 17, 983);
    Product prod3 = new Product("3", "orange", "...orange", 3, 997);

    ArrayList<Product> masterList = new ArrayList<Product>();

    masterList.add(prod1);
    masterList.add(prod2);
    masterList.add(prod3);

    return masterList;
  }//function

}//class