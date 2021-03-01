package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Main {


    public static void main(String[] args){
        Scanner na = new Scanner (System.in);
        boolean salir = false;
        int option;






       while(!salir){


            System.out.println("OPERACIONES CON CADENAS");
            System.out.println("1. Tamaño de cadena ingresada ");
            System.out.println("2. Subcadena ");
            System.out.println("3. Comparación de palabras");
            System.out.println("4. comparación de tamaño");
            System.out.println("0. salir");


        try{
            System.out.println("Seleccione una opción ");
            option = na.nextInt();
            Scanner no = new Scanner (System.in);
            String cadena;
            String cadena1;
            String cadena2;











            switch (option){

                case 1:

                    System.out.println("INGRESE CADENA DE LA QUE DESEA SABER SU TAMAÑO ");
                    cadena=no.nextLine();
                    System.out.println("Cadena Ingresada  - " + cadena + " -" );
                    System.out.println("Tamaño de cadena  " + cadena.length() + " carateres"+"\n"+"\n" );

                    break;
                case 2:
                    System.out.println("SUBCADENAS");

                    break;
                case 3:
                    System.out.println("COMPARACION DE PALABRAS"+"\n");
                    System.out.println("1. Desea Ignorar Mayusculas? ");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("0. volver");









                    break;
                case 4:



                    break;
                case 0:
                    System.out.println("created by: "+ "\n"+ "LILY");
                    salir = true;
                    break;
                default:

                    System.out.println("Elige números entre 1 y 4 (0 para salir)");

            }

        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            na.next();
        }
        }

    }
}
