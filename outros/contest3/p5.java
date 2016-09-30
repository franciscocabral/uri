/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fancisco
 */
public class p5 {

    public static int[] num;

    public static void gerarUnidades(int u) {
        for (int i = 0; i <= u; i++) {
            num[i]++;
        }
    }

    public static void gerarDecimals(int d, int u) {
        gerarUnidades(9);
        num[d] += u + 1;
    }

    public static void gerarDigitos(int[] numero) {
        for (int expoente = 0; expoente < numero.length; expoente++) {
            int d = numero[expoente];
            if (expoente == 0) {
                for (int i = 1; i <= d; i++) {
                    num[i]++;
                }
            } else if (expoente == 1) {
                for (int i = 1; i <= d; i++) {
                    if (i < d) {
                        gerarDecimals(i, 9);
                    } else {
                        gerarDecimals(i, numero[expoente - 1]);
                    }
                }
            }
//            continuar...
        }
    }

    

    public static void subtract(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            num[i] = a[i] - b[i];
        }
    }

    public static int[] countDigits(int[] a) {
        int[] tmp = new int[10];
        boolean started = false;
        for (int i = 9; i > 1; i--) {
            if (a[i] == 0 && !started) {
                continue;
            } else if (a[i] != 0) {
                started = true;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        int A, B;

        int[][] precompiled = new int[][]{{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 2, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 4, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 5, 2, 1, 1, 1, 1, 1, 1, 1}, {1, 6, 2, 2, 1, 1, 1, 1, 1, 1}, {1, 7, 2, 2, 2, 1, 1, 1, 1, 1}, {1, 8, 2, 2, 2, 2, 1, 1, 1, 1}, {1, 9, 2, 2, 2, 2, 2, 1, 1, 1}, {1, 10, 2, 2, 2, 2, 2, 2, 1, 1}, {1, 11, 2, 2, 2, 2, 2, 2, 2, 1}, {1, 12, 2, 2, 2, 2, 2, 2, 2, 2}, {2, 12, 3, 2, 2, 2, 2, 2, 2, 2}, {2, 13, 4, 2, 2, 2, 2, 2, 2, 2}, {2, 13, 6, 2, 2, 2, 2, 2, 2, 2}, {2, 13, 7, 3, 2, 2, 2, 2, 2, 2}, {2, 13, 8, 3, 3, 2, 2, 2, 2, 2}, {2, 13, 9, 3, 3, 3, 2, 2, 2, 2}, {2, 13, 10, 3, 3, 3, 3, 2, 2, 2}, {2, 13, 11, 3, 3, 3, 3, 3, 2, 2}, {2, 13, 12, 3, 3, 3, 3, 3, 3, 2}, {2, 13, 13, 3, 3, 3, 3, 3, 3, 3}, {3, 13, 13, 4, 3, 3, 3, 3, 3, 3}, {3, 14, 13, 5, 3, 3, 3, 3, 3, 3}, {3, 14, 14, 6, 3, 3, 3, 3, 3, 3}, {3, 14, 14, 8, 3, 3, 3, 3, 3, 3}, {3, 14, 14, 9, 4, 3, 3, 3, 3, 3}, {3, 14, 14, 10, 4, 4, 3, 3, 3, 3}, {3, 14, 14, 11, 4, 4, 4, 3, 3, 3}, {3, 14, 14, 12, 4, 4, 4, 4, 3, 3}, {3, 14, 14, 13, 4, 4, 4, 4, 4, 3}, {3, 14, 14, 14, 4, 4, 4, 4, 4, 4}, {4, 14, 14, 14, 5, 4, 4, 4, 4, 4}, {4, 15, 14, 14, 6, 4, 4, 4, 4, 4}, {4, 15, 15, 14, 7, 4, 4, 4, 4, 4}, {4, 15, 15, 15, 8, 4, 4, 4, 4, 4}, {4, 15, 15, 15, 10, 4, 4, 4, 4, 4}, {4, 15, 15, 15, 11, 5, 4, 4, 4, 4}, {4, 15, 15, 15, 12, 5, 5, 4, 4, 4}, {4, 15, 15, 15, 13, 5, 5, 5, 4, 4}, {4, 15, 15, 15, 14, 5, 5, 5, 5, 4}, {4, 15, 15, 15, 15, 5, 5, 5, 5, 5}, {5, 15, 15, 15, 15, 6, 5, 5, 5, 5}, {5, 16, 15, 15, 15, 7, 5, 5, 5, 5}, {5, 16, 16, 15, 15, 8, 5, 5, 5, 5}, {5, 16, 16, 16, 15, 9, 5, 5, 5, 5}, {5, 16, 16, 16, 16, 10, 5, 5, 5, 5}, {5, 16, 16, 16, 16, 12, 5, 5, 5, 5}, {5, 16, 16, 16, 16, 13, 6, 5, 5, 5}, {5, 16, 16, 16, 16, 14, 6, 6, 5, 5}, {5, 16, 16, 16, 16, 15, 6, 6, 6, 5}, {5, 16, 16, 16, 16, 16, 6, 6, 6, 6}, {6, 16, 16, 16, 16, 16, 7, 6, 6, 6}, {6, 17, 16, 16, 16, 16, 8, 6, 6, 6}, {6, 17, 17, 16, 16, 16, 9, 6, 6, 6}, {6, 17, 17, 17, 16, 16, 10, 6, 6, 6}, {6, 17, 17, 17, 17, 16, 11, 6, 6, 6}, {6, 17, 17, 17, 17, 17, 12, 6, 6, 6}, {6, 17, 17, 17, 17, 17, 14, 6, 6, 6}, {6, 17, 17, 17, 17, 17, 15, 7, 6, 6}, {6, 17, 17, 17, 17, 17, 16, 7, 7, 6}, {6, 17, 17, 17, 17, 17, 17, 7, 7, 7}, {7, 17, 17, 17, 17, 17, 17, 8, 7, 7}, {7, 18, 17, 17, 17, 17, 17, 9, 7, 7}, {7, 18, 18, 17, 17, 17, 17, 10, 7, 7}, {7, 18, 18, 18, 17, 17, 17, 11, 7, 7}, {7, 18, 18, 18, 18, 17, 17, 12, 7, 7}, {7, 18, 18, 18, 18, 18, 17, 13, 7, 7}, {7, 18, 18, 18, 18, 18, 18, 14, 7, 7}, {7, 18, 18, 18, 18, 18, 18, 16, 7, 7}, {7, 18, 18, 18, 18, 18, 18, 17, 8, 7}, {7, 18, 18, 18, 18, 18, 18, 18, 8, 8}, {8, 18, 18, 18, 18, 18, 18, 18, 9, 8}, {8, 19, 18, 18, 18, 18, 18, 18, 10, 8}, {8, 19, 19, 18, 18, 18, 18, 18, 11, 8}, {8, 19, 19, 19, 18, 18, 18, 18, 12, 8}, {8, 19, 19, 19, 19, 18, 18, 18, 13, 8}, {8, 19, 19, 19, 19, 19, 18, 18, 14, 8}, {8, 19, 19, 19, 19, 19, 19, 18, 15, 8}, {8, 19, 19, 19, 19, 19, 19, 19, 16, 8}, {8, 19, 19, 19, 19, 19, 19, 19, 18, 8}, {8, 19, 19, 19, 19, 19, 19, 19, 19, 9}, {9, 19, 19, 19, 19, 19, 19, 19, 19, 10}, {9, 20, 19, 19, 19, 19, 19, 19, 19, 11}, {9, 20, 20, 19, 19, 19, 19, 19, 19, 12}, {9, 20, 20, 20, 19, 19, 19, 19, 19, 13}, {9, 20, 20, 20, 20, 19, 19, 19, 19, 14}, {9, 20, 20, 20, 20, 20, 19, 19, 19, 15}, {9, 20, 20, 20, 20, 20, 20, 19, 19, 16}, {9, 20, 20, 20, 20, 20, 20, 20, 19, 17}, {9, 20, 20, 20, 20, 20, 20, 20, 20, 18}, {9, 20, 20, 20, 20, 20, 20, 20, 20, 20}, {11, 21, 20, 20, 20, 20, 20, 20, 20, 20}};

        do {
            A = s.nextInt();
            B = s.nextInt();
            int[] a = new int[String.valueOf(A).length()],
                  b = new int[String.valueOf(B).length()];
            if (A == 0 && B == 0) {
                break;
            }
            int tmp = A - 1;
            for (int i = 0; i < 10; i++) {
                a[i] = tmp % 10;
                tmp = tmp / 10;
                if (tmp == 0) {
                    break;
                }
            }
            tmp = B;
            for (int i = 0; i < 10; i++) {
                b[i] = tmp % 10;
                tmp = tmp / 10;
                if (tmp == 0) {
                    break;
                }
            }

            
            num = new int[10];
            gerarDigitos(b);
            int[] numb = num;
            num = new int[10];
            gerarDigitos(a);
            int[] numa = num;

            subtract(numb, numa);

            for (int i = 0; i < 9; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println(num[9]);

        } while (A != 0 || B != 0);

    }
};