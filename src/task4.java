public class task4 {
    public static void main(String[] args) {
        System.out.println("Завдання 2:");
        String choise="N";    //Вибір операції  «Я погоджуюсь!» введіть: Так, ОК, Yes, Y, +, Ok
        //Вибір операції «Я відмовляюсь!» введіть: Ні, NO, N, -, No

        switch (choise){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;

            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
        }
    }
}
