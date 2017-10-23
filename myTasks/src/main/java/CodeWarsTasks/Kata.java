package CodeWarsTasks;
/*check if triangle */


 public class Kata {
    public static boolean isTriangle(int a, int b, int c) {
        boolean result = false;


        //Любая сторона треугольника меньше суммы двух других сторон и больше их разности:
        int[] arr = {a, b, c};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[1] + arr[2];
            int dec = arr[1] - arr[2];
            if (arr[0] < sum && arr[0]>dec){
                temp = arr[0]; //a 0 1 2
                arr[0]=arr[2];
                arr[2]=arr[1];
                arr[1] = temp;
            } else {
                return  false;
            }

        }

        return true;
    }
}