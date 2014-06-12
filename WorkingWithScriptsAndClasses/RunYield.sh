#---
# Excerpted from "Programming Scala",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/vsscala for more book information.
#---
mkdir classes
javac -d classes InvestmentType.java Investment.java
scala -classpath classes:. Yield.scala
/bin/rm -rf classes
