/***
 * Excerpted from "Programming Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala for more book information.
***/
import java.util.*;

public class FindMax {
  public static void main(String[] args) {
   List<Integer> temperatures = new ArrayList<Integer>();  
   temperatures.add(63);
   temperatures.add(87);
   temperatures.add(92);
   temperatures.add(84);
   temperatures.add(72);

   System.out.println(findMax(temperatures));
  }


 //Java code
 public static int findMax(List<Integer> temperatures) {
   int highTemperature = Integer.MIN_VALUE;
   for(int temperature : temperatures) {
    highTemperature = Math.max(highTemperature, temperature);
   }
   return highTemperature;
 }

}
