package Enum_0210.Calculations;

public class SubtractCalculation extends AddCalculation {

    SubtractCalculation(double a, double b){
            super(a,b);
    }

    SubtractCalculation(Calculation ob){
        field1 = ob.field1;
        field2 = ob.field2;
    }


    public double execute(){
        return this.field1-this.field2;
    }

    public void print(){
        System.out.println(this.field1 + " - "  + this.field2);

    }



}
