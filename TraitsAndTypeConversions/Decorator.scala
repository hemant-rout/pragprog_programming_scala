//START:CHECK
abstract class Check {
  def check() : String = "Checked Application Details..."
}
//END:CHECK

//START:TRAITS
trait CreditCheck extends Check {
  override def check() : String = "Checked Credit..." + super.check()
}

trait EmploymentCheck extends Check {
  override def check() : String = "Checked Employment..." + super.check()
}

trait CriminalRecordCheck extends Check {
  override def check() : String = "Check Criminal Records..." + super.check()
}
//END:TRAITS
     
//START:USE1
val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck

println(apartmentApplication check)
//END:USE1
     
//START:USE2
val emplomentApplication = new Check with CriminalRecordCheck with EmploymentCheck

println(emplomentApplication check)
//END:USE2
