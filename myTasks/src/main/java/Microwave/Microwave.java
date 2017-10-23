package Microwave;
/*simulation of a work of a microwave*/

public class Microwave {

    public boolean isDoorOpen = true;
    public boolean isEmpty = true;
    Food food = new Food();

    public static void main(String[] args) {


        Microwave MyMicroweve = new Microwave();



        MyMicroweve.openDoor();
        MyMicroweve.putFood();
        MyMicroweve.closeDoor();

        try {
            MyMicroweve.warmFood();
        } catch( Exc1 s){
            System.out.println("EXS:door is open");
        }
        catch (Esc2 d) {
            System.out.println("EXS:food is not inside");
        }
        MyMicroweve.openDoor();
        MyMicroweve.takeFood();
    }




    public void openDoor() {
        if (!isDoorOpen) {
            isDoorOpen = true;
            System.out.println("You opened the door");
        } else {
            System.out.println("Door is open");
        }
    }

    public void closeDoor() {
        isDoorOpen = false;
        System.out.println("Door is closed");
    }

    public void putFood() {
        if (isEmpty) {
            System.out.println("Microwave is empty. Please put some food inside");
            isEmpty = false;
            System.out.println("Now there is food in microwave");
        } else {
            System.out.println("Food is already inside");
        }
    }


    public void takeFood() {
        if (food.isFoodCooked==true && isDoorOpen==true){
            System.out.println("Please take and enjoy your dinner");
        }

    }

    public void warmFood() throws Exc1, Esc2 {
        if (isDoorOpen == true) {
            throw new Exc1();//door
        } else {
            if (isEmpty == true) {//food
                throw new Esc2();
            } else {
                food.beeingCooked();
                System.out.println("Food is cooked");
            }
        }
    }
}
