

object DebugExample extends App {

  import DebugMacros._

  hello()

  val y = 10

  def test() {
    val p = 11
    debug(p)
    debug(p + y)
  }

  test()

}