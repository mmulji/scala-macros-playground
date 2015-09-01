


case class State(name: String)

case object One extends State("One")
case object Two extends State("Two")
case object Three extends State("Three")
case object Four extends State("Four")


class NetworkDeps {

  var states: List[State] = null
  var startingState: State = null

}
