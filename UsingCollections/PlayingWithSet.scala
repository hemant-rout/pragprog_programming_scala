//START:FEEDS
val feeds1 = Set("blog.toolshed.com", "pragdave.pragprog.com", 
  "pragmactic-osxer.blogspot.com", "vita-contemplativa.blogspot.com")
val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")
//END:FEEDS


println("/" + "/" + "START:FILTER_OUTPUT")
//START:FILTER
val blogSpotFeeds = feeds1 filter ( _ contains "blogspot" )
println("blogspot feeds: " + blogSpotFeeds.mkString(", "))
//END:FILTER
println("/" + "/" + "END:FILTER_OUTPUT")

println("/" + "/" + "START:MERGE_OUTPUT")
//START:MERGE
val mergedFeeds = feeds1 ++ feeds2
println("# of merged feeds: " + mergedFeeds.size)
//END:MERGE
println("/" + "/" + "END:MERGE_OUTPUT")
            
println("/" + "/" + "START:INTERSECT_OUTPUT")
//START:INTERSECT
val commonFeeds = feeds1 ** feeds2
println("common feeds: " + commonFeeds.mkString(", "))
//END:INTERSECT
println("/" + "/" + "END:INTERSECT_OUTPUT")

println("/" + "/" + "START:MAP_OUTPUT")
//START:MAP
val urls = feeds1 map ( "http://" + _ )
println("One url: " + urls.toArray(0))
//END:MAP
println("/" + "/" + "END:MAP_OUTPUT")

println("/" + "/" + "START:FOREACH_OUTPUT")
//START:FOREACH
println("Refresh Feeds:")
feeds1 foreach { feed => println("  Refreshing " + feed ) }
//END:FOREACH
println("/" + "/" + "END:FOREACH_OUTPUT")
