import action.CountLine;
import action.Replace;
import util.Input;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        switch (new Input().getChose()){
            case 1: new CountLine().countLine();break;
            case 2:new Replace().findLine();break;
            }
    }
}
