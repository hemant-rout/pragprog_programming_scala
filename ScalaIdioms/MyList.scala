class MyList[+T] //...

var list1 = new MyList[int]
var list2 : MyList[Any] = null

list2 = list1 // OK
