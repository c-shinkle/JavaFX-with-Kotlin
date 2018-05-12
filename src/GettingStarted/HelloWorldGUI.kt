package GettingStarted

import javafx.application.Application
import javafx.application.Application.launch
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import javafx.stage.Stage

fun main(args: Array<String>) {
    launch(HelloWorldGUI::class.java)
}

class HelloWorldGUI : Application() {

    override fun start(primaryStage: Stage) {
        val grid = GridPane()
        grid.alignment = Pos.CENTER
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.padding = Insets(25.0, 25.0, 25.0, 25.0)

        val scenetitle = Text("Welcome")
        scenetitle.font = Font.font("Tahoma", FontWeight.NORMAL, 20.0)
        grid.add(scenetitle, 0, 0, 1, 1)

        val userName = Label("User Name:")
        grid.add(userName, 0, 1)

        val userTextField = TextField()
        grid.add(userTextField, 1, 1)

        val pw = Label("Password")
        grid.add(pw, 0, 2)

        val pwBox = PasswordField()
        grid.add(pwBox, 1, 2)

        val btn = Button("Sign in")
        val hbBtn = HBox(10.0)
        hbBtn.alignment = Pos.BOTTOM_RIGHT
        hbBtn.children.add(btn)
        grid.add(hbBtn, 1, 4)

        val actiontarget = Text()
        grid.add(actiontarget, 1, 6)

        btn.setOnAction {
            actiontarget.fill = Color.FIREBRICK
            actiontarget.text = "Sign in button pressed"
        }

        val scene = Scene(grid, 300.0, 275.0)
        primaryStage.scene = scene
        primaryStage.title = "JavaFX Welcome"
        primaryStage.show()
    }
}