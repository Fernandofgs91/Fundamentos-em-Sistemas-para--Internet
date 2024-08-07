/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Vl= scanner.nextInt();

        int Soma = 0;
        int Qnumero= 0;
        int QPares = 0;
        int QImpares = 0;

        while (Soma < Vl) {
                    int numero = scanner.nextInt();
            Soma += numero;
            Qnumero++;

      
            if (numero % 2 == 0) {
                QPares++;
            } else {
                QImpares++;
            }
        }
        double media = (double) Soma / Qnumero;
        System.out.println("Pares = " + QPares);
        System.out.println("Impares = " + QImpares);
        System.out.printf("Média = %.2f%n", media);

        
    }
}
