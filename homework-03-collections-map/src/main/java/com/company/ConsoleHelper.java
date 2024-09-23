package com.company;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString(){
        String string;
        try{
            string = bufferedReader.readLine();
        } catch (IOException e){
            writeMessage("Произошла ошибка при попытке ввода текста, попробуйте еще раз");
            string = readString();
        }
        return string;
    }
}


