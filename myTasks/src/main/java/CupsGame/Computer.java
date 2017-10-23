package CupsGame;
import java.util.Random;

public class Computer {

    public int hideBall(){
        Random rand = new Random();
        int ballInCupNo = rand.nextInt(3)+1;
        return ballInCupNo;
    }
}
