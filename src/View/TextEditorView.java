package View;

import Controller.TextEditorController;
import Model.TextEditorModel;

import java.io.File;

public class TextEditorView {
    private TextEditorController controller;

    public TextEditorView(TextEditorController controller) {
        this.controller = controller;
    }

    public void displayLines() {
        controller.getLines().forEach(System.out::println);
    }
}





