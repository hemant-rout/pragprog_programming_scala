val values = List(2, 5, 3, 2, 4, 1)

println("Maximum is " + 
  (values(0) /: values) { (large, elem) => if (elem > large) elem else large } )