package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public String getPath() {

        return scanner.next();
    }

    public String getLine() {

        return scanner.next();
    }

    public int getChose() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
