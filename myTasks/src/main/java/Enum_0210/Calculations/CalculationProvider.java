package Enum_0210.Calculations;


import java.util.Scanner;

public class CalculationProvider {
    public Calculation getCalculation(){


        Calculation object = new AddCalculation();
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter number 1 and 2 : ");
        double field1 = input.nextDouble();
        double field2 = input.nextDouble();

        object.field1 = field1;
        object.field2 = field2;

        System.out.println("please enter an operation: ");
        String sign = input.next();

        switch (sign){
            case "+":
                object.print();
                System.out.println(object.execute());
                break;

            case "-":
                SubtractCalculation obj = new SubtractCalculation(object);
                System.out.println(obj.execute());
                break;

            case "*":
                MultiplyCalculations obj1 = new MultiplyCalculations(object);
                System.out.println(obj1.execute());
                break;

            case "/":
                DevideCalculation obj6 = new DevideCalculation(object);
                System.out.println(obj6.execute());
                break;

            case "^":
                PowerCalcuation obj7 = new PowerCalcuation(object);
                System.out.println(obj7.execute());
                object = obj7;



        }
        return object;
        }


    }

