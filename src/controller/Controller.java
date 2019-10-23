package controller;

import instruction.Instruction;
import model.Model;
import service.Service;
import util.Info;
import util.Input;
import util.Validator;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Controller {

    private Input input = new Input();
    private Info info = new Info();
    private Service service = new Service();
    private Validator validator = new Validator();
    private Instruction instruction = new Instruction();


    public String getPath() {
        info.getInfo();
        String path = input.getPath();
        return path;
    }

    public void countLine() {
        Model path = new Model(getPath());
        info.getCount(service.countLine(path));
    }

    public void findLine() {
        Model path = new Model(getPath());
        service.findLine(path, input.getLine(), input.getLine());
    }

    public void choice() {
        info.getChoose();
        int num = input.getChose();
        while (!validator.isPositiveNumber(num)) {
            instruction.getInstruction();
            num = new Input().getChose();
        }
        switch (num) {
            case 1:
                countLine();
                break;
            case 2:
                findLine();
                break;
            default:
                repeat();
        }
    }

    public void repeat() {
        String exit;
        info.getRequest();
        exit = input.getAnswer();
        if (exit.equals("y") || exit.equals("yes")) {
            choice();
        } else {
            System.exit(0);
        }
    }
}




