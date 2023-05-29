package gr.aueb.cf.ch8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MultipleExeptionApp {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try(Scanner in = new Scanner(file)){
            ch=(char) System.in.read();
        }catch (FileNotFoundException |RuntimeException e2){
            System.out.println("File not found");
        }catch (Exception e3){
            System.out.println("Oooops something went wrong");
        }

    }
}
