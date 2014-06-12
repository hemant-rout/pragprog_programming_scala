//START:ROUTE
def routePlan(coordinates : List[Tuple2[Double, Double]])
    (mapper : Tuple2[Double, Double] => Unit) {
 //...
}
//END:ROUTE

//START:CALLS      
routePlan(/*...*/) { x : Tuple2[Double, Double] => /*...*/ } // Explicit Type, OK

routePlan(/*...*/) { x => /*...*/ } // Type is inferred

routePlan(/*...*/) { x : Int => /*...*/ } //ERROR: Typemismatch
//END:CALLS
