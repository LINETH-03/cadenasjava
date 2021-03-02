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
            System.out.println("=======OPERACIONES CON CADENAS======="+"\n");
            System.out.println("1. Tamaño de cadena ingresada ");
            System.out.println("2. Subcadena ");
            System.out.println("3. Comparación de cadenas");
            System.out.println("4. comparación de tamaño");
            System.out.println("0. salir"+ "\n" + "\n");


        try{
            System.out.println(" Seleccione una opción ");
            option = na.nextInt();
            //scaner para variables de los case
            Scanner no = new Scanner (System.in);
            //variables
            String cadena;
            String cadena1;
            int subcad;
            int lon;
            int alm;

            //opciones
            switch (option) {

                case 1://encontrar el tamaño de una cadena
                    System.out.println("AL INGRESAR UNA CADENA DE CARACTERES CONOCERA SU TAMAÑO"+"\n");
                    System.out.println("Ingrese cadena para saber su tamaño");
                    cadena = no.nextLine();
                    System.out.println("\n"+"Cadena Ingresada  - " + cadena + " -");
                    System.out.println("El tamaño de la cadena ingresada es:  " + cadena.length() +  "\n" + "\n");
                    break;

                case 2: // subcadenas
                    System.out.println("=======SUBCADENAS======="+"\n");
                    System.out.println("Ingrese cadena: ");
                    cadena = no.nextLine();
                    System.out.println("Ingrese indice inicial de la cadena: ");
                    subcad = no.nextInt();
                    System.out.println("Ingrese el tamaño de la cadena que desea mostrar: ");
                    lon=no.nextInt();
                    alm = cadena.length();
                    if (subcad+lon>alm){
                        System.out.println("los indices son mas grandes que la cadena ingresada"+ "\n" + "\n");
                    }
                    else{
                        cadena1 = cadena.substring(subcad,subcad+lon);
                        System.out.println("La subcadena es: - " + cadena1 + " -"+ "\n" + "\n");
                    }
                    break;

                case 3://comparacion de palabras
                    System.out.println("=======COMPARACION DE CADENAS======="+"\n");

                    System.out.println("Ingrese primera cadena ");
                    cadena = no.nextLine();
                    System.out.println("Ingrese segunda cadena  ");
                    cadena1 = no.nextLine();
                    System.out.println("\n"+" Desea Ignorar Mayusculas? ");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("0. volver"+"\n");
                    subcad = no.nextInt();
                    //------------------------validar no IMPORTAN LAS MAYUSCULAS------------------------
                    if (subcad==1){

                        if(cadena.equalsIgnoreCase(cadena1)){
                            System.out.println(cadena +"  y  "+ cadena1+"  son iguales "+ "\n" + "\n");
                        }else{
                            System.out.println(cadena +"  y  "+ cadena1+" No son iguales "+ "\n" + "\n");
                        }
                    }
                    //----------------------------validar si importan las mayusculas------------------------------
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
                    System.out.println("=======COMPARAR TAMAÑO DE CADENAS======="+"\n");
                    System.out.println("Ingrese primera cadena ");
                    cadena = no.nextLine();
                    System.out.println("Ingrese segunda cadena  ");
                    cadena1 = no.nextLine();
                    System.out.println("\n"+" ¿Desea Ignorar los espacios en blanco? ");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("0. volver"+"\n");
                    subcad = no.nextInt();
                    //----------------mostrara las cadenas sin espacios------------------------
                    if (subcad==1){
                        lon=cadena.replace(" ","").length();
                        alm=cadena1.replace(" ","").length();
                        if(lon==alm){
                            System.out.println(cadena +" ("+ lon+") "+"  y  "+ cadena1+" ("+ alm +") "+"  Tienen la misma cantidad de caracteres sin espacios"+ "\n" + "\n");
                        }else{
                            System.out.println(cadena +" ("+ lon+") "+"  y  "+ cadena1+" ("+alm+") "+" No tienen la misma cantidad de caracteres sin espacios"+ "\n" + "\n");
                        }
                    }
                    //--------------------mostrara las cadenas con  espacios------------------------------
                    else if(subcad==2){

                        if(cadena.length()==cadena1.length()){
                            System.out.println(cadena +" ("+ cadena.length() +") " +"  y  "+ cadena1+" ("+ cadena1.length() +") " +"  Tienen la misma cantidad de caracteres con espacios"+ "\n" + "\n");
                        }else{
                            System.out.println(cadena + " (" + cadena.length() + ") " + "  y  "+ cadena1+" ("+ cadena1.length() +") " +" NO Tienen la misma cantidad de caracteres con espacios"+ "\n" + "\n");
                        }
                    }
                    else{
                        System.out.println("volver"+ "\n" + "\n");
                    }
                    break;

                case 0://salir
                    System.out.println("created by: "+ "\n"+ "LILY");
                    salir = true;
                    break;
                default:

                    System.out.println("\n"+"Números validos 1 - 4 (0 para salir)");
            }

        }catch (InputMismatchException e) {
            System.out.println("\n"+"Debes insertar un Número"+"\n");
            na.next();
        }
        }
    }
}
