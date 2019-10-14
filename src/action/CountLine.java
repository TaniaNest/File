package action;

import util.Input;

import java.io.*;

public class CountLine {

    public void countLine() {
        System.out.print("Input path to file: ");
        String path = new Input().getPath();
        try {
        File myFile = new File(path);
        FileReader fileReader = new FileReader(myFile);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        int lineNumber = 0;

        while (lineNumberReader.readLine() != null) {
            lineNumber++;
        }

        System.out.println(lineNumber);

        lineNumberReader.close();
    }
        catch (IOException e) {
        e.printStackTrace();
    }


    }
}
