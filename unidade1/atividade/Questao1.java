package br.com.ap3.distancia;

//Xico - Corrigindo: o nome da classe está errado
//Xico - Corrigindo: Falta codigo secreto
//Xico - Corrigindo: Falta javadoc

import java.util.Scanner;

public class Questao1 { //

    public static double getDistancia() {
        Scanner teclado = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância é: " + distancia);
        return distancia;
    }

    public static double getAmplitude() {
        double val1 = 0.0, val2 = 1.0, val3 = -1.0;

        double amplitude = Math.max(val1, Math.max(val2, val3)) - Math.min(val1, Math.min(val2, val3));

        return amplitude;
    }

    public static void main(String[] args) {
        System.out.println("Distância: " + getDistancia());
        System.out.println("Amplitude: " + getAmplitude());
    }
}
