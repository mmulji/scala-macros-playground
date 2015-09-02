
object NetworkDeps {

  class State(name: String)

  case class One() extends State("One")
  case class Two() extends State("Two")
  case class Three() extends State("Three")
  case class Four() extends State("Four")


  class Network {

    var states: Set[State] = null
    var startingState: State = null

  }

}

