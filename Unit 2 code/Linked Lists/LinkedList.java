//Linked List
//Functions that can work with linked lists
public class LinkedList {

  String value;
  LinkedList pointer;

  public LinkedList(String value) {
    this.value = value;
    pointer = null;
  } 

  public void display() {
    LinkedList temp = this;
    System.out.println(temp.value);

    while (temp.pointer != null) {
      temp = temp.pointer;
      System.out.println(temp.value);
    }
  } 

  public boolean okIndex(int index) {
    boolean okIndex = true;

    if (index < 0) {
      okIndex = false;
    }

    if (index > this.length()){
      okIndex = false;
    }


    if (!okIndex) {
      System.out.println("Invalid input, oop. Please enter an index between 0 and" + this.length());
    }

    return okIndex;
  }

  public void changeStart(String value) {

    LinkedList oldStart = new LinkedList("");

    oldStart.value = this.value;
    this.value = value;

    oldStart.pointer = this.pointer;
    this.pointer = oldStart;
  }

  public int length(){
    LinkedList temp = this;
    int length = 1;
    while (temp.pointer != null) {
      temp = temp.pointer;
      length++;
    }
    return length;
  }
 
  public void insert(String value, int index) {
    if (!this.okIndex(index)) {
      return;
    }
    if (index == 0) {
      this.changeStart(value);
      return;
    }

    LinkedList newNode = new LinkedList(value);
    LinkedList temp = this; // this == start of linked list

    int runningIndex = 0;
    while (runningIndex < index) {
      if (runningIndex == (index - 1)) {

        newNode.pointer = temp.pointer;
        temp.pointer = newNode;

      } else {
        temp = temp.pointer;// moves to the (end/where it needs to be)
        //System.out.println("temp has been moved");
      }
      runningIndex++;
    }
  }

  public void add(String x) { // adds (to the end) new element to linked list

    LinkedList newNode = new LinkedList(x);
    LinkedList temp = this; // temp == header

    while (temp.pointer != null) { // move along till last one (who's pointer will be null)
      temp = temp.pointer; // gets the last one
    } // temp now the last item in linked list

    temp.pointer = newNode; // point the last item to the new item
  } // add

  public void remove(int index) {
   
    if (index == 0){
      if (this.length() == 1){
        System.out.println("You cannot remove all the nodes");
        return;
      }
      this.value = this.pointer.value;
      this.pointer = this.pointer.pointer;
      return;
    }

    if (!this.okIndex(index)) {
      return;
    }
    

    LinkedList temp = this;

    int runningIndex = 0;
    while (runningIndex < index) {

      if (runningIndex == (index - 1)) {
        temp.pointer = temp.pointer.pointer;
      } else {
        temp = temp.pointer;// moves to the (end/where it needs to be)
        //System.out.println("temp has been moved");
      }
      runningIndex++;
    }
  }

} // class