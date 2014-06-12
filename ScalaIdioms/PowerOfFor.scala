//START:LOOP
for (i <- 1 to 3) { print("ho ") }
//END:LOOP

//START:DOUBLE
val result = for (i <- 1 to 10) 
  yield i * 2
//END:DOUBLE   

//START:DOUBLEUSINGMAP
val result2 = (1 to 10).map(_ * 2)
//END:DOUBLEUSINGMAP

//START:DOUBLEEVEN
val doubleEven = for (i <- 1 to 10; if i % 2 == 0)
   yield i * 2
//END:DOUBLEEVEN

//START:USECURLY
for {
  i <- 1 to 10
  if i % 2 == 0
}
 yield i * 2
//END:USECURLY

println(result)
println(doubleEven)                   
println(result2)
