package com.company;

import java.util.Scanner;

public class Main {


    public static void display (String variable) {
        System.out.println(variable);
    }

    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        display("Introduzca el número de aciertos");
        int numAciertos = sc.nextInt();
        display("Introduzca el número de errores");
        int numErrores = sc.nextInt();
        display("Introduzca el número de preguntas");
        int numPreguntas = sc.nextInt();
        int notaInt = 0;
        double notaDouble = 0;


        String calificacion = "";

        //Procesamiento de datos
        notaInt = ((numAciertos - (numErrores / 2)) * 10) / numPreguntas;
        notaDouble = ((numAciertos - (numErrores / 2)) * 10) / numPreguntas;
        double decimal = notaDouble -  notaInt;


        if (decimal >= 0.5) {
            notaInt +=1;
        }


        switch (notaInt) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                calificacion = "INSUFICIENTE";
                break;
            case 5:
                calificacion = "SUFICIENTE";
                break;
            case 6:
                calificacion = "BIEN";
                break;
            case 7:
            case 8:
                calificacion = "NOTABLE";
                break;
            case 9:
            case 10:
            calificacion = "SOBRESALIENTE";
            break;

        }
        display("La nota obtenida según su calificación es " +calificacion);

    }
}