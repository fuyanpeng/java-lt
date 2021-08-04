package designpattern.singleinstance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger(){
        File file = new File("/tmp/log.txt");
        try {
            FileWriter writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        return instance;
    }

    public void  log(String message){
        try {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
