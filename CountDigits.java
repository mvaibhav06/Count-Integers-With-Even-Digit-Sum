public class CountDigits {
    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count = 0;

        for(int i=1; i<=num; i++){
            int sum = digitSum(i);
            if(sum%2 == 0){
                count++;
            }
        }
        return count;
    }
}
