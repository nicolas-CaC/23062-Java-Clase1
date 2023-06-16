package clase1;

import clase2.Arrays;
import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Alo aló");
        System.err.println("Si en rojo");

        System.out.print("Holis");
        System.out.print("Hola de nuevo");

        System.out.print("\nIngrese su nombre de usuario: ");
        String nombre_usuario = entrada.nextLine();
        System.out.println("nombre del usuario: " + nombre_usuario);

        System.out.print("Ingrese su edad: ");
        int edad_usuario = entrada.nextInt();
        System.out.println("Edad del usuario: " + edad_usuario);

//        %d = decimal, numero
//        %c = char
//        %f = coma flotante
//        %i = int
//        %s = string
//        %u = unsigned int
//        %t = fecha
        System.out.printf("Su nombre es %s y su edad es %d\n", nombre_usuario, edad_usuario);

        String palabra1 = "Fin";
        String palabra2 = "Programa";
        System.out.println(palabra1 + " del " + palabra2);

        TipoNumericos numericos = new TipoNumericos(3);
        TiposBooleanos booleanos = new TiposBooleanos();
        TiposCadenas cadenas = new TiposCadenas("bien");
        TiposCadenas cadenas2 = new TiposCadenas("bien", "mal");
        
        System.out.println(numericos.a);
        System.out.println(numericos.g);
        System.out.println(numericos.e + numericos.f);
        System.out.println(booleanos.a);
        System.out.println(booleanos.b);
        System.out.println(cadenas.a);
        System.out.println(cadenas.c);
        System.out.println(cadenas2.c);
        
        Arrays nuevoArray = new Arrays();
        
        System.out.println(nuevoArray.arrayString[0]);
        System.out.println(nuevoArray.arrayString[1]);
        System.out.println(nuevoArray.arrayNumeros[3]);
        System.out.println(nuevoArray.arrayBooleano[0]);
        System.out.println(nuevoArray.arrayByte[3]);
        
        System.out.println(nuevoArray.matriz[0][0]);
        System.out.println(nuevoArray.matriz[0][1]);
        System.out.println(nuevoArray.matriz[1][0]);
        System.out.println(nuevoArray.matriz[1][1]);
      
        byte[] x = cadenas.c.getBytes();
        System.out.println(x.length - 1);
    }

}
