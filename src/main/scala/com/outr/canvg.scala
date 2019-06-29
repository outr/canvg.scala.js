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