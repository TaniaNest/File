package action;

import util.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Replace {

public void findLine(){
    System.out.print("Input path to file: ");
    String path = new Input().getPath();
    Charset charset = StandardCharsets.UTF_8;
    try {
        String content = new String(Files.readAllBytes(Paths.get(path)), charset);

    content = content.replaceAll(new Input().getLine(), new Input().getLine());
    Files.write(Paths.get(path), content.getBytes(charset));}
    catch (IOException e) {
        e.printStackTrace();
    }
}
}

