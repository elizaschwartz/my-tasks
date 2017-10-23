package ioStream;

import java.io.*;
/* Создать простой шифратор/дешифратор. Создать обертку для выходного потока, которая будет добавлять к входящему в нее байту фиксированное значение.
Создать обертку для входного потока, которая будет отнимать от байта фиксированное значение */


public class Incoder {
    public static void main(String[] args) throws IOException {
        // без обертки
        InputStream inputStream = new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test1.txt");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test2.txt");

        InputStream inputStream1 = new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test2.txt");
        OutputStream outputStream1 = new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test3.txt");
        crypt(inputStream,outputStream);
        decrypt(inputStream1,outputStream1);


        // с оберткой закодировать и записать в новый файл
        OutputStream otpWr = new CryptWrapper(new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test4.txt"));
        otpWr.write(" sea horse 123".getBytes("UTF-8"));
        otpWr.flush();
        otpWr.close();
// раскодировать и записать обертка
        InputStream inp1 = new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test4.txt");
        OutputStream otpWrDeccrypt = new DecryptWrapper(new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test5.txt"));
        int i;
        do{
            i=inp1.read();
            otpWrDeccrypt.write(i);
        }while(i != -1);
    }





    public static void crypt(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        do{
            i = inputStream.read();
            outputStream.write(i+1);
            System.out.println(i + " e ncoded: " + (i+1));
        }while (i != -1);

        inputStream.close();
        outputStream.flush();
        outputStream.close();



    }


    public static void decrypt (InputStream inputStream, OutputStream outputStream) throws IOException{
        int i;
        do{
            i = inputStream.read();
            outputStream.write(i-1);
            System.out.print(i);

        }while(i!=-1);

        inputStream.close();
        outputStream.flush();
        outputStream.close();
    }
    }

