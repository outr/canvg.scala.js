import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.|

package object canvg {
  def apply(canvas: String | html.Canvas, svg: String): Unit = TopLevel.canvg(canvas, svg)
  def apply(canvas: String | html.Canvas, svg: String, options: CanvgOptions): Unit = TopLevel.canvg(canvas, svg, options)
}