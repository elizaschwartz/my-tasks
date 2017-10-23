package Enum_0210.RandomAdvice;

public class Choice {

    public String getAnswer(){
        Answers[] arrValues = Answers.values();
        int rand = (int)(Math.random()*99);
        String result= null;

        for (int i =1; i<arrValues.length; i++) {
           if(rand >=arrValues[i].min && rand <= arrValues[i].max){
              result = arrValues[i].name();
           }
        }
        return result;
    }
}
