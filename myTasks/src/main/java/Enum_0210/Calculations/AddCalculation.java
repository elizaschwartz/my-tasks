package Enum_0210.Calculations;

public class AddCalculation extends Calculation {


 public AddCalculation(double a, double b){
            this.field1 = a;
            this.field2 = b;
        }

        AddCalculation(Calculation ob){
     field1 = ob.field1;
     field2 = ob.field2;
        }


    AddCalculation(){
    }
    @Override
    public double execute(){
        return this.field1+this.field2;
    }

    @Override
    public void print(){
        System.out.println(this.field1 + " + "  + this.field2);
    }





}
