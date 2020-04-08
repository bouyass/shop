package com.lyes.homeShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


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
        content += line + "\n";
    }

    @Override
    public void stop() {
        try{
            PrintWriter writer = new PrintWriter(fileName+".txt");
            writer.println(content);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
