package Enum_0210.Calculations;

public class DevideCalculation extends AddCalculation {

    DevideCalculation(double a, double b) {
        if (b == 0) {
            System.out.println("you can't devide by 0");
            System.exit(1);
        } else {
            this.field1 = a;
            this.field2 = b;
        }
    }


    DevideCalculation(Calculation ob) {
        if (ob.field2==0){
            System.out.println("you can't devide by 0");
            System.exit(1);
        } else {
        field1 = ob.field1;
        field2 = ob.field2;
    }

}


    @Override
    public double execute(){
        return this.field1/this.field2;
    }
    @Override
    public void print(){
        System.out.println(this.field1 + " / "  + this.field2);

    }


}
