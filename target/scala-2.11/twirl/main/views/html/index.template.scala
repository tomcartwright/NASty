
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>NASty</title>
  <!-- Link jQuery, MDL -->
  <link rel="stylesheet" href=""""),_display_(/*7.33*/routes/*7.39*/.Assets.at("css/material.css")),format.raw/*7.69*/("""">
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <script src=""""),_display_(/*9.17*/routes/*9.23*/.Assets.at("js/material.js")),format.raw/*9.51*/(""""></script>
  <script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("js/jquery-3.1.1.min.js")),format.raw/*10.59*/(""""></script>
</head>
<body>
    <!-- The drawer is always open in large screens. The header is always shown, even in small screens. -->
  <div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
    <header class="mdl-layout__header">
      <div class="mdl-layout__header-row">
        <div class="mdl-layout-spacer"></div>
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable mdl-textfield--floating-label
                    mdl-textfield--align-right">
          <label class="mdl-button mdl-js-button mdl-button--icon" for="fixed-header-drawer-exp">
            <i class="material-icons">search</i>
          </label>
          <div class="mdl-textfield__expandable-holder">
            <input class="mdl-textfield__input" type="text" name="sample"
            id="fixed-header-drawer-exp">
          </div>
        </div>
      </div>
    </header>
    <div class="mdl-layout__drawer">
      <span class="mdl-layout-title">NASty</span>
      <nav class="mdl-navigation">
        <a class="mdl-navigation__link" href="drive.scala.html">
          <i class="material-icons">backup</i>
          Drive
        </a>
        <a class="mdl-navigation__link" href="settings.scala.html">
          <i class="material-icons">settings</i>
          Settings
        </a>
        <a class="mdl-navigation__link" href="trash.scala.html">
          <i class="material-icons">delete</i>
          Trash
        </a>
        <a class="mdl-navigation__link" href="starred.scala.html">
          <i class="material-icons">star rate</i>
          Starred
        </a>
      </nav>
    </div>
    <main class="mdl-layout__content">
      <div class="page-content">
          <!-- Your content goes here -->
      </div>
    </main>
  </div>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 11:07:28 CST 2016
                  SOURCE: /Users/Tom/repos/NASty/app/views/index.scala.html
                  HASH: 45fdc7d375bdf7c9e27e0991cba435c4d0dc6a1c
                  MATRIX: 609->0|783->148|797->154|847->184|981->292|995->298|1043->326|1098->354|1113->360|1170->396
                  LINES: 25->1|31->7|31->7|31->7|33->9|33->9|33->9|34->10|34->10|34->10
                  -- GENERATED --
              */
          