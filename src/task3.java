public class task3 {
    public static void main(String[] args) {
        int start = 1;
        int n = 6;
        if (n > 0 & n <= 9){

            if(n == start){
                System.out.println("Ви зараз знаходитесь на даному поверсі");
            }

            if(n > start) {
                if (n == 2) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 3) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви піднялись на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви піднялись на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви піднялись на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви піднялись на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви піднялись на 8 поверх");
                } else if (n == 9) {
                    System.out.println("Ви піднялись на 9 поверх");
                }
            }

            if(n < start) {
                if (n == 1) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 2) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 3) {
                    System.out.println("Ви спустились на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви спустились на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви спустились на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви спустились на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви спустились на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви спустились на 8 поверх");
                }
            }
        }
        else{
            System.out.println("Ви ввели неіснуючий поверх");
        }
    }
}
