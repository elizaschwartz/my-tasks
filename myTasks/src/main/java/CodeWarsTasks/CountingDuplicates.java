package CodeWarsTasks;

/*
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (bandB)
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String text1 = text.toLowerCase();
        char[] textArr = text1.toCharArray();
        int counter = 0;


        for (int j = 0; j < textArr.length-1; j++) {
            char temp = textArr[j];
            boolean a = false;

            for (int i = 1+j; i < textArr.length; i++) {
                if (textArr[i] == temp && textArr[i]!='*') {
                    a = true;
                    textArr[i]='*';
                }

            }
            temp = '*';
            if (a){
                counter++;

            }

        }

        return counter;
    }

}
