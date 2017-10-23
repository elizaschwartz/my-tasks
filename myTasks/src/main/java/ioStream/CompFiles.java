package ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {
        int i=0, j=0;
         FileInputStream file1 = null;
         FileInputStream file2 = null;

         try {
            file1 =  new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test1.txt");
            file2 = new FileInputStream("C:\\Users\\Лиза Ш\\Desktop\\test2.txt");

            do{
                i = file1.read();
                j= file2.read();
                if(i != j) break;
            }while (i != -1 && j != -1);

            if (i != j){
                System.out.println("Файлы отличаются");}
                else {
                System.out.println("файлы совпадают");
            }

         } catch(IOException exs){
             System.out.println("Eroor reading" + exs);
         }


         try{
             file1.close();
             file2.close();
         }catch(IOException exc){
             System.out.println("Problem while closing");
         }


    }
}
