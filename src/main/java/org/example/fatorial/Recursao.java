package org.example.fatorial;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Recursao {
    public static int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static long fat(int n) {
        if (n < 2) {
            return 1;
        }
        return n * fat(n -1);
    }

    static BigInteger bigFat(int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    static BigInteger bigFatProfessora(BigInteger n) {
        BigInteger bigF = BigInteger.ONE;
        BigInteger bigI = new BigInteger("2");

        while(bigI.compareTo(n) != 1) {
            bigF = bigF.multiply(bigI);
            bigI = bigI.add(BigInteger.ONE);
        }

        return bigF;
    }

    public static void main(String[] args) {
//        for(int i = 0; i < 30; i++){
//            System.out.println("Fibonacci: " + i + " = " + fib(i));
//        }
//
//        for(int i = 0; i < 20; i++){
//            System.out.println("Fatorial Int: " + i + " = " + fat(i));
//        }
//
        for(int i = 0; i < 50; i++){
            System.out.println("Fatorial BigInteger: " + i + " = " + bigFat(i));
        }

        BigInteger bigLimite = new BigInteger("50");
        BigInteger i = BigInteger.ONE;
        while(i.compareTo(bigLimite) != 1){
            System.out.println("Fatorial BigIntegerProfessora: " + i + " = " + bigFatProfessora(i));
            i = i.add(BigInteger.ONE);
        }

        BigInteger nJogos = bigFatProfessora(new BigInteger("60")).divide
                (bigFatProfessora(new BigInteger("54")).multiply
                (bigFatProfessora(new BigInteger("6"))));

        System.out.println("Numero de jogos: " + nJogos);
        int intJogos = nJogos.intValue();
        System.out.println("Sua chance: " + 1.0 / intJogos);
//        1.997448858318156E-8
//        resultado é igual a 0,00000002

    }
}
