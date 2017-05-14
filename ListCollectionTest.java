import java.util.*;

public class ListCollectionTest{
  public static void main(String[] args){
    System.out.println("List Collection Test program.");

    //create HashMap
    List<String> al1 = new ArrayList<String>(); //we can use LinedList too

    //add value
    al1.add("value1");
    al1.add("value3");
    al1.add("value4");
    al1.add("value2");


    //get all value
    for(String eachValue: al1){
      System.out.println(eachValue);
    }


  }
}
