package Somativa;

import java.util.Scanner;

public class Somativa {
    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
        System.out.println("Informe a Operação Aritmética. (Adição = 1, Subtração = 2, Multiplicação = 3, Divisão = 4)");
        int Operaçao = sc.nextInt();
        System.out.println("Informe o Primeiro Número.");
        double num1 = sc.nextDouble();
        System.out.println("Informe o Segundo Número.");
        double num2 = sc.nextDouble();
        double total;
        if (Operaçao==1) {
            total = num1+num2; System.out.println("o resultado da soma é:"+total+".");
        } else if (Operaçao==2) {
            total = num1-num2; System.out.println("o resultado da subtração é:"+total+".");
        } else if (Operaçao==3) {
            total = num1*num2; System.out.println("o resultado da multiplicação é"+total+".");
        } else if (Operaçao==4) {
            total = num1/num2; System.out.println("o resultado da divisão é:"+total+".");
        } else {System.out.println("Operação Invalida");}
    }


    public void Exercicio2() {
        System.out.println("Informe o número da matrícula:");
        int matricula = sc.nextInt();
        double total = matricula%4;
        if (total==1) {
            System.out.println("O estudante está no time Chris.");
        } else if (total==2) {
            System.out.println("O estudante está no time Greg");
        } else if (total==3) {
            System.err.println("O estudante está no time Caruso");
        } else if (total==4) {
            System.out.println("O aluno está no time Jerome");
        } else {
            System.out.println("Matrícula");
        }
    }


    public void Exercicio3() {
        System.out.println("Informe o peso(em quilos) dos marangos comprados:");
        double pesoMorangos = sc.nextDouble();
        System.out.println("Informe o peso(em quilos) das maçãs compradas:");
        double pesoMacas = sc.nextDouble();
        System.out.println("Informe o peso(em quilos) das bananas compradas:");
        double pesoBananas = sc.nextDouble();

        double precoMorangos = pesoMorangos*3.30;
        double precoMacas = pesoMacas*1.80;
        double precoBananas = pesoBananas*2.30;
        double totalpreco = precoBananas + precoMacas + precoMorangos;
        double totaldepeso = pesoBananas + pesoMacas + pesoMorangos;
        double desconto;
        double precoFinal;
        if (totaldepeso>=30&&totaldepeso>=15) {
            desconto = totalpreco/10;
            precoFinal = totalpreco-desconto;
            System.out.println("O peso total a ser pago foi de"+precoFinal);
        } else if (totalpreco>=30) {
            desconto = totalpreco/10;
            precoFinal = totalpreco-desconto;
            System.out.println("O preço total a ser pago foi de"+totalpreco);
        } else if (totaldepeso>=15) {
            desconto = totalpreco/10;
            precoFinal = totalpreco-desconto;
            System.out.println("O preço a ser pago é"+totalpreco);
        } else {
            System.out.println("o preço total a ser pago foi"+totalpreco);
        }
    }
}