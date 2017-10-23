package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

//разобраться с кодировками, битами, байтами
//

public class IOHomework {
    public static void main (String [] args ) throws IOException {

//        InputStream inputStream = new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test1.txt");
//        int i = inputStream.read();
//        System.out.println(Integer.toHexString(i)); // выводит 31  а не 1 - почему?
//
//        OutputStream outputStream = new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test2.txt");
//        outputStream.write(0b0000001);
//        outputStream.flush();//данные которые подвисли в буффере нужо записать в источник (для оптимизации)
//        outputStream.close();
//
//        Reader reader = new InputStreamReader(new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test1.txt"), "UTF-8");
//        int c;
//        do {
//             c = reader.read();
//            System.out.print((char)c );
//        }while (c != -1);


        Writer writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Лиза Ш\\Desktop\\test2.txt"), "UTF-8");//default utf-8

        writer.write("jadgsf64  ");
        writer.flush();
        writer.close();











    }
}
