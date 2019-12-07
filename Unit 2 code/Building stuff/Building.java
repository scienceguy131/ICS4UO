// Al-Ansar Mohammed
//01-11-19
public class Building {
  int numberOfUnits;
  Unit[] units;
  public Building(int numberOfUnits){
    units = new Unit[numberOfUnits]; 
    for (int i = 0;i<numberOfUnits;i++){
      units[i] = new Unit();
    }
  }
}
