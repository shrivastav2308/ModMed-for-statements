public class Main {
    public static void main(String[] args) {
//        System.out.println(calInterest(10000.0,2.0));

        for(double i = 2 ; i < 9 ; i++) System.out.println(String.format("%.2f",calInterest(10000.0,i)));
        System.out.println("************");
        for(double i = 8 ; i > 1 ; i--) System.out.println(String.format("%.2f",calInterest(10000.0,i)));
    }
    public static double calInterest(double amount, double rate) {
        return amount * (rate/100);
    }
}