public class SumOddRange {

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }else if(number%2 == 1){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sumOfOdds = 0;

        if (end >= start && start > 0 && end > 0){
            for(int cycle = start; cycle <= end; cycle++){
                if (isOdd(cycle) == true){
                    sumOfOdds = sumOfOdds + cycle;
                }
            }
        } else {
            sumOfOdds = -1;
        }
        return sumOfOdds;
    }
}
