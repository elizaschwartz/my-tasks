package Strings;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a line");
        //String a = input.nextLine();
        String a = "ррр%123%оооо%456%";
//        System.out.println("Please enter a second line");
//        String b = input.nextLine();
//        System.out.println("Please enter a third line");
//        String c = input.nextLine();
        char[] arrA=a.toCharArray();

        //palindrom(arrA, a);
        //oneRowQuantityInAnother(a,b);
        //wordsQuantityInRow(a);
        //findAndReplaceSubstring(a,b,c);
        findNumbers(a);
    }

    /*Проверить, является ли строка палиндромом. То есть, равна ли самой себе, если ее перевернуть*/
 public static void palindrom(char[] arrA, String a){
     char[] arrReverse=new char[arrA.length];
     for (int i = 0; i<arrA.length; i++){
         arrReverse[i]=arrA[arrA.length-1-i];
     }
     String reverse = String.valueOf(arrReverse);
     if (reverse.equals(a)){
         System.out.println("String a: " + a + " is a palindrom to " + reverse);

     } else {
         System.out.println("String a: " + a + " is NOT a palindrom to " + reverse);
     }

 }

  /*  С клавиатуры вводятся две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.*/
    public static void oneRowQuantityInAnother(String a, String b){
        int temp = 0;
        if (!a.contains(b)){
            System.out.println("a doesnt contain b");
            System.exit(1);}
            else {
            while(a.contains(b)) {
                int index = a.indexOf(b);
                a = a.replaceFirst(b, "***");
                temp++;
            }
        }
        System.out.println("String b \"" + b + "\"  appeared " + temp + " times in the String a");
    }

    /*Подсчитать количество слов во введенной пользователем строке. Для упрощения задачи считаем, что слова разделяются исключительно одним пробелом, а первый и последний символы строки не являются пробелами.*/
    public static void wordsQuantityInRow (String a){
        int temp = 1;
        while(a.contains(" ")) {
            a = a.replaceFirst(" ", "***");
            temp++;
        }
        System.out.println("There is " + temp + " words in the line.");
    }

    /*
Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
    public static void findAndReplaceSubstring(String a, String b, String c){
            a=a.replaceAll(b,c);
        System.out.println("The result is: " + a);
        }


    /*
Выделить из строки все числа. Числа находятся в строке между знаками процента.
Пример: “qqqq %111% and %245%”. Результатом будут числа 111 и 245.*/

    public static void findNumbers(String a){
        String s = new String(a);
        int temp = 0; // номер индекса для начала поиска первого знака

        int signNumber=0;// ищу сколько знаков % в строке
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='%') {
                signNumber++;
            }
        }

        int endIndexNo=0; // кол-во знаков % которе были найдены
        while( endIndexNo<signNumber) {//пока количество отработаных символов не выше их общей сумме //  вовращал темп,
            int indFisrst = s.indexOf("%", temp) +1 ;//look for  second index from position indFirst +1
            ++endIndexNo;
            int indSecond = s.indexOf("%", indFisrst);
            ++endIndexNo;

            temp = indSecond + 1;
           String result = s.substring(indFisrst, indSecond);
           if(result.matches("\\d+")){
               System.out.println(result);
            }
        }



    }

}

