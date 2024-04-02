package Controller;

import Model.TextEditorModel;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextEditorController {
    private TextEditorModel model;

    public TextEditorController(TextEditorModel model) {
        this.model = model;
    }

    public void loadFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            model.setLines(reader.lines().collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : model.getLines()) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recursivelyListFiles(File directory) {
        if (directory.isDirectory()) {
            Arrays.stream(directory.listFiles())
                    .forEach(file -> {
                        System.out.println(file.getAbsolutePath());
                        recursivelyListFiles(file);
                    });
        }
    }

    public void setLines(List<String> lines) {
        model.setLines(lines);
    }

    public Iterable<Object> getLines() {
        return null;
    }
}


