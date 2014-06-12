//START:FEEDS
val feeds = List("blog.toolshed.com", "pragdave.pragprog.com",
  "dimsumthinking.com/blog")
//END:FEEDS

println("/" + "/" + "START:GET_OUTPUT")
//START:GET
println("First feed: " + feeds.head)
println("Second feed: " + feeds(1))
//END:GET
println("/" + "/" + "END:GET_OUTPUT")

println("/" + "/" + "START:PREFIX_OUTPUT")
//START:PREFIX
val prefixedList = "forums.pragprog.com/forums/87" :: feeds
println("First Feed In Prefixed: " + prefixedList.head)
//END:PREFIX                                                     
println("/" + "/" + "END:PREFIX_OUTPUT")

println("/" + "/" + "START:PREFIXLIST_OUTPUT")
//START:PREFIXLIST
val feedsWithForums = 
  feeds ::: List("forums.pragprog.com/forums/87", "forums.pragprog.com/forums/55")
println("First feed in feeds with forum: " + feedsWithForums.head)
println("Last feed in feeds with forum: " + feedsWithForums.last)
//END:PREFIXLIST
println("/" + "/" + "END:PREFIXLIST_OUTPUT")

println("/" + "/" + "START:APPEND_OUTPUT")
//START:APPEND
val appendedList = feeds ::: List("agiledeveloper.com/blog")
println("Last Feed In Appended: " + appendedList.last)
//END:APPEND
println("/" + "/" + "END:APPEND_OUTPUT")

println("/" + "/" + "START:FILTER_EXIST_FORALL_OUTPUT")
//START:FILTER_EXIST_FORALL
println("Feeds with blog: " + feeds.filter( _ contains "blog" ).mkString(", "))
println("All feeds have com: " + feeds.forall( _ contains "com" ))
println("All feeds have dave: " + feeds.forall( _ contains "dave" ))
println("Any feed has dave: " + feeds.exists( _ contains "dave" ))
println("Any feed has bill: " + feeds.exists( _ contains "bill" ))
//END:FILTER_EXIST_FORALL
println("/" + "/" + "END:FILTER_EXIST_FORALL_OUTPUT")

println("/" + "/" + "START:MAP_OUTPUT")
//START:MAP
println("Feed url lengths: " + feeds.map( _.length ).mkString(", "))
//END:MAP
println("/" + "/" + "END:MAP_OUTPUT")

println("/" + "/" + "START:FOLDLEFT_OUTPUT")
//START:FOLDLEFT                              
val total = feeds.foldLeft(0) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total )
//END:FOLDLEFT
println("/" + "/" + "END:FOLDLEFT_OUTPUT")

println("/" + "/" + "START:FOLDLEFT2_OUTPUT")
//START:FOLDLEFT2                              
val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total2 )
//END:FOLDLEFT2
println("/" + "/" + "END:FOLDLEFT2_OUTPUT")

println("/" + "/" + "START:FOLDLEFT3_OUTPUT")
//START:FOLDLEFT3                              
val total3 = (0 /: feeds) { _ + _.length }
println("Total length of feed urls: " + total3 )
//END:FOLDLEFT3
println("/" + "/" + "END:FOLDLEFT3_OUTPUT")
