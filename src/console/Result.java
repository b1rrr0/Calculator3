package console;


public class Result {

  //глобальная проверка знака
    public static int Check(int term1, String sign1, int term2) {
        if (sign1.equals("-") | sign1.equals("+") | sign1.equals("*") | sign1.equals("%"))
            return _Result(term1, sign1, term2);
        if (sign1.equals("Nod"))
            return Nod(term1, term2);
        if (sign1.equals("Nok"))
            return Nok(term1, term2);
            return BinPow(term1,term2);


    }

// проверка знака и выполнение действия
    public static int _Result(int term1, String sign1, int term2) {
        if (sign1.equals("-"))
            return term1 - term2;
        if (sign1.equals("+"))
            return term1 + term2;
        if (sign1.equals("*"))
            return term1 * term2;
        if (sign1.equals("/"))
            return term1 / term2;
        return term1 % term2;

    }

//Расчет нода по Евклиду
    public static int Nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return Nod(b, a % b);
    }

// Расчет нок через Нод
    public static int Nok(int x, int y) {
        return (x * y) / (Nod(x, y));
    }


//Быстрое Выозведение в степень за счет разбиение Числа степени на n-ное кол-во чисел со степенью в 2 раза меньшей
    public static int  BinPow(int a, int n) {
        int ans = 1;

        while (n>0) {
            if ( n % 2==0)
                ans *= a;
            a *= a;
            n >>= 1;
        }
        return ans;
    }



}





