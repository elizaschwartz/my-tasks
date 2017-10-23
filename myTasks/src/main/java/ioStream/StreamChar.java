package ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamChar {
    public static void main(String[] args) throws IOException {

        char c;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bвeдитe символы; окончание ввода - символ точки");

        do {
            c = (char) br.read();
            System.out.print(c);
        }while (c != '.');


    }
}
