def useFriend(friend: Friend) = friend listen

val snowy = new Cat("Snowy") with Friend
val friend : Friend = snowy
friend.listen

useFriend(snowy)
