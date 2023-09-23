<p align="center" style ="font-size: 24px"><em>Факультет программной инженерии и компьютерной техники</em></p>

<p align="center" style ="font-size: 24px"><strong>Лабораторная работа №1 </br>
По дисциплине : «Программирование»</br>
Вариант 2318</strong>
</p>
<p align="left">Преподаватель: <strong>Чупанов Аликылыч Алибекович</strong></br>
Выполнила: <strong>Логинова Ольга Олеговна</strong></br>
Группа: <strong>P3131</strong>
</p>

# Лабораторная работа #1

## 1. Текст задания.

Написать программу на языке Java, выполняющую соответствующие варианту действия. Программа должна соответствовать
следующим требованиям:

1. Она должна быть упакована в исполняемый jar-архив.
2. Выражение должно вычисляться в соответствии с правилами вычисления математических выражений (должен соблюдаться
   порядок выполнения действий и т.д.).
3. Программа должна использовать математические функции из стандартной библиотеки Java.
4. Результат вычисления выражения должен быть выведен в стандартный поток вывода в заданном формате.

Выполнение программы необходимо продемонстрировать на сервере `helios`.

Введите вариант: <span style="font-size:20px"><strong>`2318`</strong></span>

1. Создать одномерный массив c типа int. Заполнить его чётными числами от `4` до `22` включительно в порядке убывания.
2. Создать одномерный массив x типа double. Заполнить его 13-ю случайными числами в диапазоне от `-12.0` до `3.0`.
3. Создать двумерный массив C размером `10x13`. Вычислить его элементы по следующей формуле (где `x = x[j]`)
   <img src="C:\Users\4814285\IdeaProjects\labs\lab1\math.jpg" />
4. Напечатать полученный в результате массив в формате с двумя знаками после запятой.

## 2. Исходный код программы.

```java
import static java.lang.Math.*;

public class Main {
   //    При присвоении переменной типа float дробного литерала с плавающей точкой, например, 3.1, 4.5 и т.д.,
//    Java автоматически рассматривает этот литерал как значение типа double.
//    И чтобы указать, что данное значение должно рассматриваться как float, нам надо использовать суффикс f;
   public static void main(String[] args) {
      int[] c = {22, 20, 18, 16, 14, 12, 10, 8, 6, 4};
      float[] x = new float[13];
      for (int i = 0; i < x.length; i++) {
         x[i] = (float) random() * 15 - 12;
      }
      double[][] resultArray = new double[10][13];
      for (int i = 0; i < c.length; i++) {
         for (int j = 0; j < x.length; j++) {
            if (c[i] == 18) {
               resultArray[i][j] = cbrt(atan(sin(x[i])));
            } else if (c[i] == 6 || c[i] == 8 || c[i] == 12 || c[i] == 20 || c[i] == 22) {
               resultArray[i][j] = cbrt(pow((2.0 / 3 * x[i]), x[i]) / 2);
            } else {
               double arcsinValue = asin((x[i] - 4.5) / (15));
               double pow1 = 2 * arcsinValue;
               double pow2 = tan(arcsinValue);
               resultArray[i][j] = pow((1.0 / 4 / sin(atan((x[i] - 4.5) / 15))), pow(pow1, pow2));
            }
         }
      }
      printArray(resultArray);

   }

   public static void printArray(double[][] array) {
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            System.out.printf("%10.2f", array[i][j]);
         }
         System.out.println();
      }
   }

}



```

## 3. Результат работы программы.

```java
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86 0,86
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66 0,66
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70 0,70
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
        NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN NaN
```

## 4. Выводы по работе.

Я изучисла базовый синтаксис и базовые операции в языке Java. Узнала о том, как работает JVM, за счет которой
поддерживается кроссплатформенность Java. Узнала о том, что такое JRE и JDK, и чем они отличаются.
Научилась компилировать программу с помощью утилиты javac, которая генерирует файл с байт-кодом, использовать
MANIFEST.mf,
создавать и запускать jar-файл на сервере.


