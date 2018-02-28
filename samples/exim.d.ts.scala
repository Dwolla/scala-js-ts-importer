
import scala.scalajs.js
import js.annotation._
import js.|

package exim {

@js.native
@JSGlobal
class Foo extends js.Object {
  def foo(a: Foo.Types.Bar): Foo.Types.Baz = js.native
}

@js.native
@JSGlobal
object Foo extends js.Object {
  type Bar = String

@js.native
@JSGlobal
class Baz extends js.Object {
}
  val Types: Foo.type = js.native
}

}
