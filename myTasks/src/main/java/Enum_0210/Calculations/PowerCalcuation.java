package Enum_0210.Calculations;

public class PowerCalcuation extends AddCalculation {

    PowerCalcuation(double a, double b){
        super(a,b);

    }

    PowerCalcuation(Calculation ob){
        field1 = ob.field1;
        field2 = ob.field2;
    }

    @Override
    public double execute(){
        return Math.pow( this.field1,this.field2);
    }

    @Override
    public void print(){
        System.out.println(this.field1 + " ^ "  + this.field2);

    }
}
