public class sumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(1,11));
    }
    public static boolean isOdd(int num) {
        if(num < 0 || num % 2 == 0) return false;
        else return true;
    }
    public static int sumOdd(int start, int end) {
        if(start < 0 || end < 0 || end < start) return -1;
        int sum = 0;
        for(int i = start ; i <= end ; i++) {
            if(isOdd(i)) sum += i;
        }
        return sum;
    }
}
