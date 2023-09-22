import static java.lang.Math.*;

public class Main {
    //    ctrl + alt + l - расстановка всякой хуйни
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


