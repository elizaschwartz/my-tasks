package Enum_0210.KamenNoznicyBumaga;

public class Computer  implements PlayerInterface {
    String name;
    int points;

    Computer(String name_var){
        this.name=name_var;
    }

    public String getName(){
        return this.name;
    }



    public int getMove(Computer obj){
        int a = 1;
        int b = 3;
        return (a+(int)((Math.random()*b)));
    }



    public void addPoints(){
    ++points;
    }




}

