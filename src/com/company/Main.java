package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args){
        //scaner para salir (while)
        Scanner na = new Scanner (System.in);
        boolean salir = false;
        //varianble para el switch
        int option;

//ciclo while
       while(!salir){

            //menu
            System.out.println("OPERACIONES CON CADENAS");
            System.out.println("1. Tamaño de cadena ingresada ");
            System.out.println("2. Subcadena ");
            System.out.println("3. Comparación de palabras");
            System.out.println("4. comparación de tamaño");
            System.out.println("0. salir");


        try{
            System.out.println("Seleccione una opción ");
            option = na.nextInt();
            //scaner para variables de los case
            Scanner no = new Scanner (System.in);
            //variables
            String cadena;
            String cadena1;
            int subcad;

            //opciones
            switch (option) {

                case 1://encontrar el tamaño de una cadena

                    System.out.println("INGRESE CADENA DE LA QUE DESEA SABER SU TAMAÑO ");
                    cadena = no.nextLine();
                    System.out.println("Cadena Ingresada  - " + cadena + " -");
                    System.out.println("Tamaño de cadena  " + cadena.length() + " caracteres" + "\n" + "\n");

                    break;
                case 2: // subcadenas
                    System.out.println("SUBCADENAS");
                    System.out.println("Ingrese cadena: ");
                    cadena = no.nextLine();
                    System.out.println("Ingrese indice inicial: ");
                    subcad = no.nextInt();
                    cadena1 = cadena.substring(subcad);
                    System.out.println("La subcadena es: - " + cadena1 + " -"+ "\n" + "\n");



                    break;
                case 3://comparacion de palabras
                    System.out.println("COMPARACION DE PALABRAS"+"\n");

                    System.out.println("Ingrese primera cadena ");
                    cadena = no.nextLine();
                    System.out.println("Ingrese segunda cadena  ");
                    cadena1 = no.nextLine();
                    System.out.println(" Desea Ignorar Mayusculas? ");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("0. volver");
                    subcad = no.nextInt();
//------------------------------validar no IMPORTAN LAS MAYUSCULAS--------------------------------------------
                    if (subcad==1){

                        if(cadena.equalsIgnoreCase(cadena1)){
                            System.out.println(cadena +"  y  "+ cadena1+"  son iguales "+ "\n" + "\n");
                        }else{
                            System.out.println(cadena +"  y  "+ cadena1+" No son iguales "+ "\n" + "\n");
                        }
//----------------------------validar si importan las mayusculas---------------------------------------------------
                    }
                    else if(subcad==2){
                        if(cadena.equals(cadena1)){
                            System.out.println(cadena +"  y  "+ cadena1+"  son iguales "+ "\n" + "\n");
                        }else{
                            System.out.println(cadena +"  y  "+ cadena1+" NO son iguales "+ "\n" + "\n");
                        }
                    }
                    else{
                        System.out.println("volver"+ "\n" + "\n");
                    }
                    break;


                case 4: // comparar tamaños de cadenas



                    break;

                case 0:
                    System.out.println("created by: "+ "\n"+ "LILY");
                    salir = true;
                    break;
                default:

                    System.out.println("Números validos 1 - 4 (0 para salir)");

            }

        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un Número");
            na.next();
        }
        }

    }
}
