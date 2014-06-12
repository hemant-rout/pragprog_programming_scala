/***
 * Excerpted from "Programming Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala for more book information.
***/
public class Loop { 

  // Java code
  public int sum(int number) {
    int result = 0;
    for(int i = 1; i <= number; i++) {
      result += i; 
    }
    return result;
  }              



  // Java code
  public int countEven(int number) {
    int result = 0;
    for(int i = 1; i <= number; i++) {      
      if (i % 2 == 0) {
        result++;        
      }
    }
    return result;
  }              

  

  // Java code
  public int countOdd(int number) {
    int result = 0;
    for(int i = 1; i <= number; i++) {      
      if (i % 2 != 0) {
        result++;        
      }
    }
    return result;
  }              


  public static void main(String[] args) {
    Loop loop = new Loop();
    System.out.println(loop.sum(11));
    System.out.println(loop.countEven(11));
    System.out.println(loop.countOdd(11));
  }  
}
