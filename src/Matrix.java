import java.util.Scanner;
public class Matrix {
    static int[][] input(int[][] a) {
        System.out.println("Введите матрицу");
        Scanner s = new Scanner(System.in);
        for (int m=0;m<2;m++) {
            for (int n=0;n<2;n++) {
                a[m][n] = s.nextInt();
            }
        }
        return(a);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        matrix1 = input(matrix1);
        int[][] matrix2 = new int[2][2];
        matrix2 = input(matrix2);
        System.out.println("Введите комманду: (1,4-Cложение) (2-Вычитание) (3-умн. на чилсо) (5-перемножение) (6-определитель) (7-обратная матрица) ");
        while (s.hasNextInt()) {
            int comm = s.nextInt();
            if (comm == 1) addition(matrix1, matrix2);
            if (comm == 2) subtraction(matrix1, matrix2);
            if (comm == 3) {
                System.out.println("Введите число для умножения: ");
                int pr = s.nextInt();
                multiplication(matrix1, pr);
            }
            if (comm == 4) addition(matrix1, matrix2);
            if (comm == 5) multWithTwo(matrix1, matrix2);
            if (comm == 6) System.out.println(definition(matrix1));
            if (comm == 7) revers(matrix1);
        }
        addition(addition(matrix1, matrix1), matrix1);
    }

    static int[][] addition(int[][] a,int[][] b) {
        int[][] c= new int[2][2];
        for (int m=0;m<2;m++) {
            for (int n=0;n<2;n++) {
                c[m][n] = a[m][n]+b[m][n];
                System.out.print(c[m][n] + " ");
            }
            System.out.println();
        }
        return(c);
    }

    static int[][] subtraction(int[][] a,int[][] b) {
        for (int m=0;m<2;m++) {
            for (int n=0;n<2;n++) {
                a[m][n] = a[m][n]-b[m][n];
                System.out.print(a[m][n] + " ");
            }
            System.out.println();
        }
        return(a);
    }

    static int[][] multiplication(int[][] a,int ch) {
        for (int m=0;m<2;m++) {
            for (int n=0;n<2;n++) {
                a[m][n] = a[m][n]*ch;
                System.out.print(a[m][n] + " ");
            }
            System.out.println();
        }
        return (a);
    }

    static void multWithTwo(int[][] a,int[][] b) {
        int[][] c = new int[2][2];
        c[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0];
        c[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1];
        c[1][0] = a[1][0]*b[0][0] + a[1][1]*b[1][0];
        c[1][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1];
        for (int m=0;m<2;m++) {
            for (int n=0;n<2;n++) {
                System.out.print(c[m][n] + " ");
            }
            System.out.println();
        }
    }

    static int definition(int[][] a) {
        int def;
        def=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
        return(def);
    }

    static void revers(int[][] a) {
        if (definition(a)!=0) {
            int[][] c = new int[2][2];
            c[0][0]=a[1][1];
            c[1][1]=a[0][0];
            c[0][1]=-a[0][1];
            c[1][0]=-a[1][0];
            for (int m=0;m<2;m++) {
                for (int n=0;n<2;n++) {
                    //c[m][n]=c[m][n]/definition(a);
                    System.out.print(c[m][n] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Обратное матрицы не существует");
    }
}