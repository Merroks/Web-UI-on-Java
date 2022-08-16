package Homework4;

//Формула Герона для вычисления площади треугольника
//Сначала необходимо подсчитать разность полупериметра и каждой его стороны. Потом найти произведение полученных
//чисел, умножить результат на полупериметр и найти корень из полученного числа.
//S=p⋅(p−a)⋅(p−b)⋅(p−c)
//где a , b , c — стороны, p — полупериметр, который можно найти по формуле:
//p=(a+b+c)÷2

public class Triangle {
    public static double calculateSquare(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Значение стороны меньше < 0");
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

