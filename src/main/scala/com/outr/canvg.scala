package com.outr

import org.scalajs.dom.html
import org.scalajs.dom.raw.CanvasRenderingContext2D

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSName, ScalaJSDefined}
import scala.scalajs.js.|

@js.native
@JSGlobalScope
object canvg extends js.Object {
  @JSName("canvg")
  def apply(canvas: String | html.Canvas, svg: String, options: CanvgOptions = js.native): Unit = js.native
}

@ScalaJSDefined
trait CanvgOptions extends js.Object {
  var log: js.UndefOr[Boolean] = js.undefined
  var ignoreMouse: js.UndefOr[Boolean] = js.undefined
  var ignoreAnimation: js.UndefOr[Boolean] = js.undefined
  var ignoreDimensions: js.UndefOr[Boolean] = js.undefined
  var ignoreClear: js.UndefOr[Boolean] = js.undefined
  var offsetX: js.UndefOr[Int] = js.undefined
  var offsetY: js.UndefOr[Int] = js.undefined
  var scaleWidth: js.UndefOr[Int] = js.undefined
  var scaleHeight: js.UndefOr[Int] = js.undefined
  var renderCallback: js.UndefOr[js.Function] = js.undefined
  var forceRedraw: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var useCORS: js.UndefOr[Boolean] = js.undefined
}