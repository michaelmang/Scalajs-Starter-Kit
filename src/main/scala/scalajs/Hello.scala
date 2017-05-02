package scala.scalajs.Hello
import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object Hello extends JSApp {
  def main(): Unit = {
    appendHello(document.body, "Hello Scala.js")
  }
  def appendHello(targetNode: dom.Node, text: String): Unit = {
    val titleNode = document.createElement("h1")
    val textNode = document.createTextNode(text)
    titleNode.appendChild(textNode)
    targetNode.appendChild(titleNode)
  }
}