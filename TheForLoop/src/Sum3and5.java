public class Sum3and5 {
    public static void main(String[] args){

        int count = 0;

        for(int num1 = 1; num1 <= 1000; num1++){
            if(num1%3 == 0 && num1%5 ==0){
                System.out.println(num1 + " is divisible by both 3 and 5");
                count = count + 1;
            }

            if (count == 10){
                break;
            }

        }

    }
}
