package com.example.myapplication

class Controller(
    private val viewer: Viewer

) {
    private val model = Model()



    fun onOnePressed() {
        model.text += "1"
        viewer.updateInput(model.text)

    }

    fun onTwoPressed() {
        model.text += "2"
        viewer.updateInput(model.text)
    }

    fun onThreePressed() {
        model.text += "3"
        viewer.updateInput(model.text)
    }

    fun onFourPressed() {
        model.text += "4"
        viewer.updateInput(model.text)
    }

    fun onFivePressed() {
        model.text += "5"
        viewer.updateInput(model.text)
    }

    fun onSixPressed() {
        model.text += "6"
        viewer.updateInput(model.text)
    }

    fun onSevenPressed() {
        model.text += "7"
        viewer.updateInput(model.text)


    }

    fun onEightPressed() {
        model.text += "8"
        viewer.updateInput(model.text)
    }

    fun onNinePressed() {
        model.text += "9"
        viewer.updateInput(model.text)
    }


    fun onPlusPressed() {
        model.text += "+"
        viewer.updateInput(model.text)

    }

    fun onZeroPressed() {
        model.text += "0"
        viewer.updateInput(model.text)
    }

    fun onMinusPressed() {
        model.text += "-"
        viewer.updateInput(model.text)
    }


    fun onDividePressed() {
        model.text += "/"
        viewer.updateInput(model.text)
    }

    fun onMultiplyPressed() {
        model.text += "*"
        viewer.updateInput(model.text)
    }

    fun onDotPressed() {
        model.text += "."
        viewer.updateInput(model.text)
    }

    fun onBackPressed() {
        if (model.text.isNotEmpty()){
            model.text = model.text.substring(0,model.text.length-1)
            viewer.updateInput(model.text)
        }

    }
    fun onClearPressed(){
            model.text = ""
            viewer.updateInput(model.text)
            viewer.updateResult("")

    }

    fun onOpenBracketPressed() {
        model.text += "("
        viewer.updateInput(model.text)

    }

    fun onCloseBracketPressed() {
        model.text += ")"
        viewer.updateInput(model.text)
    }

    fun onEqualPressed() {
        viewer.updateResult(model.calculateResults())


    }
}