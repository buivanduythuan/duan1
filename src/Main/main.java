package Main;

import Controller.TextEditorController;
import Model.TextEditorModel;
import View.TextEditorView;

import java.io.File;

public class main {
    public static void main(String[] args) {
        TextEditorModel model = new TextEditorModel();
        TextEditorController controller = new TextEditorController(model);
        TextEditorView view = new TextEditorView(controller);


        controller.loadFile("sample.txt");


        view.displayLines();


        controller.saveFile("output.txt");


        controller.recursivelyListFiles(new File("."));
    }
}

