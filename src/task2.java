public class task2 {
    public static void main(String[] args) {

        int n = 879;

        if (n > 99 & n < 1000) {

            int d1 = n / 100;
            int d2 = (n % 100) / 10;
            int d3 = n % 10;


            if (d1 >= d2 & d1 >= d3) {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + d1);
            } else if (d2 >= d1 & d2 >= d3) {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + d2);
            } else {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + d3);
            }
        }else{
            System.out.println("Введене вами число: "+n+" не є тризначним");
        }
    }
}
