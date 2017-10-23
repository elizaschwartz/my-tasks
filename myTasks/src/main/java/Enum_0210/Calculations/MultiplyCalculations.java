package Enum_0210.Calculations;

public class MultiplyCalculations extends AddCalculation  {


   MultiplyCalculations(double a, double b){
            super(a,b);

    }

    MultiplyCalculations(Calculation ob){
        field1 = ob.field1;
        field2 = ob.field2;
    }

    @Override
    public double execute(){
        return this.field1*this.field2;
    }

    @Override
    public void print(){
        System.out.println(this.field1 + " * "  + this.field2);

    }



}
