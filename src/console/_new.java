package console;
import java.util.Scanner;

public class _new {

    public static int MyReadInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите целое число");
        while (true) {
            if (scanner.hasNextInt())
                return scanner.nextInt();
            else {
                String i=scanner.nextLine();;
                if (i.equals("/help")) _Start();
                else
                System.out.println("Вы ввели не целое число");


            }
        }
    }

    public static String MyReadChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знак");
        while (true) {
            String i = scanner.nextLine();

            if ((i.equals("+")) || (i.equals("-")) || (i.equals("*")) || (i.equals("%")) || (i.equals("/")) ||
                    (i.equals("Nod")) || (i.equals("Nok")) || (i.equals("^")) )
            return i;

            if (i.equals("/help"))
                _Start();
            else
                System.out.println("Вы ввели недопустимый знак");
        }
    }


    public static void _Start()
    {
        System.out.println("\nВас приетсвует калькулятора Java");
        System.out.println("Тут вы можете:");
        System.out.println("Делить без остатка (/)");
        System.out.println("Узнать отстаток от деления (%)");
        System.out.println("Складывать (+)");
        System.out.println("Вычитать (-)");
        System.out.println("Довольно Быстро возводить  в степень (^)");
        System.out.println("Узнать Нок (Nok)");
        System.out.println("Узнать Нод (Nod)\nнапомнить - /help ");

    }


    public  static boolean _Finish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Желаете выйти?(y / n)");
        while (true) {
            String i = scanner.nextLine();
            if (i.equals("y"))
                return false;
            if (i.equals("n"))
            return true;
            if (i.equals("/help")) _Start();
            System.out.println("Желаете выйти?(y / n)");


        }
    }
}