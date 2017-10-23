package Enum_0210.RandomAdvice;
/*
o	может быть - 15%   0 - 15
o	нет - 15%   16 - 30
o	да - 30% 31 - 60
o	позже - 15% 61- 75
o	скоро - 30% 76 - 89
o	никогда - 2% 90 - 100

*/

     enum Answers {
        Maybe (0, 15),
        No(16, 30),
        Yes (31, 60),
        Later(61, 75),
        Soon(76, 89),
        Never (90,100);

        int min,max;

        Answers(final int start, final int end){
            this.min = start;
            this.max = end;
        }

        int getMin() {
            return min;
        }

        int getMax(){
            return max;
        }






        }


