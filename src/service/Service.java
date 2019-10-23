package service;

import model.Model;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Service {

    public int countLine(Model path) {
        try {
            FileReader fileReader = new FileReader(path.getPath());
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int lineNumber = 0;

            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }
            return lineNumber;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void findLine(Model path, String findLine, String replaceLine) {
        Charset charset = StandardCharsets.UTF_8;
        try {
            String content = new String(Files.readAllBytes(Paths.get(path.getPath())), charset);
            content = content.replaceAll(findLine, replaceLine);
            Files.write(Paths.get(path.getPath()), content.getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
