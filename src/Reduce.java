public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;
        int num = 100;
        while(num > 0){
            if (num % 2 == 0){
                num = num / 2;
            }
            else{
                num = num - 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
