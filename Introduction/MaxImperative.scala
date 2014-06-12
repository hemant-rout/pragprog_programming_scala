val values = List(2, 5, 3, 2, 4, 1)

var max = values(0)
for (val value <- values) {                 
  max = Math.max(max, value)  
}

println("Maximum is " + max)
