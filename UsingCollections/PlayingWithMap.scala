//START:FEEDS
val feeds = Map("Andy Hunt" -> "blog.toolshed.com", 
  "Dave Thomas" -> "pragdave.pragprog.com",
  "Dan Steinberg" -> "dimsumthinking.com/blog")
//END:FEEDS

println("/" + "/" + "START:FILTER_OUTPUT")
//START:FILTER
val filterNameStartWithD = feeds filterKeys( _ startsWith "D" )
println("# of Filtered: " + filterNameStartWithD.size)
//END:FILTER
println("/" + "/" + "END:FILTER_OUTPUT")

println("/" + "/" + "START:FILTER2_OUTPUT")
//START:FILTER2
val filterNameStartWithDAndBlogInFeed = feeds filter { element => 
  val (key, value) = element
  (key startsWith "D") && (value contains "blog")
}
println("# of feeds with auth name D* and blog in URL: " + 
  filterNameStartWithDAndBlogInFeed.size)
//END:FILTER2
println("/" + "/" + "END:FILTER2_OUTPUT")

println("/" + "/" + "START:GET_OUTPUT")
//START:GET
println("Get Andy's Feed: " + feeds.get("Andy Hunt"))
println("Get Bill's Feed: " + feeds.get("Bill Who"))
//END:GET
println("/" + "/" + "END:GET_OUTPUT")

println("/" + "/" + "START:APPLY_OUTPUT")
//START:APPLY
try {
  println("Get Andy's Feed Using apply(): " + feeds("Andy Hunt"))
  print("Get Bill's Feed: ")
  println(feeds("Bill Who"))
}
catch {
  case ex : java.util.NoSuchElementException => println("Not found")
}
//END:APPLY
println("/" + "/" + "END:APPLY_OUTPUT")

println("/" + "/" + "START:UPDATE_OUTPUT")
//START:UPDATE
val newFeeds1 = feeds.update("Venkat Subramaniam", "agiledeveloper.com/blog")
println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
println("Venkat's blog in new feed: " + newFeeds1("Venkat Subramaniam"))
//END:UPDATE
println("/" + "/" + "END:UPDATE_OUTPUT")

println("/" + "/" + "START:UPDATE2_OUTPUT")
//START:UPDATE2
val mutableFeeds = scala.collection.mutable.Map(
    "Scala Book Forum" -> "forums.pragprog.com/forums/87")
mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forums/55"
println("Number of forums: " + mutableFeeds.size)
//END:UPDATE2
println("/" + "/" + "END:UPDATE2_OUTPUT")
