package com.mycompany.teste;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade do veículo em Km/h: ");
        int velocidade = sc.nextInt();

        int multa = calcularMulta(velocidade);

        if (multa > 0) {
            System.out.println("Você foi multado em " + multa + "R$");
        } else {
            System.out.println("Você está dentro do limite de velocidade.");
        }
    }

    public static int calcularMulta(int velocidade) {
        int multa;

        if (velocidade > 80) {
            if (velocidade <= 90) {
                multa = 150;
            } else if (velocidade <= 110) {
                multa = 250;
            } else {
                multa = 400;
            }
        } else {
            multa = 0;
        }

        return multa;
    }
}