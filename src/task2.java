public class task2 {
    public static void main(String[] args) {
        System.out.println("Завдання 2:");
        int n = 3573; //Введення цілого тризначного числа
        //Перевірка на тризначність
        if (n>99 & n<1000) {
            //Знаходження кожної цифри введеного вами числа
            int d1 = n / 100;
            int d2 = (n % 100) / 10;
            int d3 = n % 10;

            //Виявлення та виведення найбільшої з трьох цифри
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
