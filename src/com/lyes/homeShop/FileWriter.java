package com.lyes.homeShop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileWriter implements Writer {
    private String fileName;
    private Path path;
    private String content;

    public FileWriter(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void start() {
        Path path = Paths.get(this.fileName);
        this.content = "";
    }

    @Override
    public void writeLine(String line) {
        content += line + "%n";
    }

    @Override
    public void stop() {
        try{
            Files.write(path, String.format(content).getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
