/* Create the necessary class(es) that will
 * allow this program to run error free. 
 */
// Note to UpperCase vs lowercase "building"
// Output not required.
// Use notepad to create your program 
// and save/submit with .java extension
public class Quiz_2_program {
  public static void main(String[] args) {     
    int numberOfUnits = 3;
    
    Building building = new Building(numberOfUnits);  
    building.units[0].roomNumber = 100; 
    building.units[1].roomNumber = 101;
    building.units[2].roomNumber = 102;
    System.out.println(building.numberOfUnits); 
    
    Door door1 = new Door(32,85);
    Door door2 = new Door();
    Desk desk1 = new Desk();
    Desk desk2 = new Desk("melamine",3);
    Chair chair1 = new Chair();
    Chair chair2 = new Chair("blue",false,true);
    Chair chair3 = new Chair();
    Chair chair4 = new Chair();
    
    desk1.material = "steel";
    desk2.numberOfDrawers = 4;
    chair1.rolling = true;
    chair1.padded = false;
    //   ----------   door3 changed to door2 -------------
    door2.width = door1.width;
    building.units[0].chair = chair1;
    building.units[0].desk = desk1;  
    
    System.out.print(chair1.colour);  
    System.out.println(building.units[2].door.height);    
  }  // main
}  //Quiz_2_program