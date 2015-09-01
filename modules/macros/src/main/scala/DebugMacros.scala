import scala.language.experimental.macros
import scala.reflect.macros.whitebox._

object DebugMacros {

  def hello(): Unit = macro hello_impl

  def hello_impl(c: Context)(): c.Expr[Unit] = {
    import c.universe._
    reify { println("Hello World!") }
  }

}
