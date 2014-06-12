/***
 * Excerpted from "Programming Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala for more book information.
***/
//Java code—will not compile due to incorrect catch order

public class CatchOrder {
  public void catchOrderExample() {
    try {
      String str = "hello";
      System.out.println(str.charAt(31));
    }
    catch(Exception ex) { System.out.println("Exception caught"); }
    catch(StringIndexOutOfBoundsException ex) { 
      System.out.println("Invalid Index"); }
  }
}
