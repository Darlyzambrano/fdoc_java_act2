package com.example;

import java.util.Scanner;

public class EjerciciosActividad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ============================================================
        // ========================= WHILE =============================
        // ============================================================

        // 1. While: imprimir números del 1 al 10
        System.out.println("WHILE 1: Numeros del 1 al 10");
        int i = 1;
        while (i <= 10) { // validación antes de cada iteración
            System.out.println(i);
            i++;
        }

        // 2. While: suma de 1 a n
        System.out.println("\nWHILE 2: Suma de 1 hasta n");
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = 0;
        int j = 1;
        while (j <= n) {
            suma += j;
            j++;
        }
        System.out.println("Suma total = " + suma);

        // 3. While: buscar un número en un arreglo
        System.out.println("\nWHILE 3: Buscar número en arreglo");
        int[] nums = {3, 8, 12, 20, 25};
        System.out.print("Ingrese número a buscar: ");
        int buscar = sc.nextInt();
        int k = 0;
        boolean encontrado = false;

        while (k < nums.length && !encontrado) {
            if (nums[k] == buscar) {
                encontrado = true;
            }
            k++;
        }
        if (encontrado) System.out.println("Número encontrado.");
        else System.out.println("Número NO encontrado.");


        // ============================================================
        // ======================= DO-WHILE ============================
        // ============================================================

        // 1. Do-while: menú interactivo
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Saludar");
            System.out.println("2. Decir fecha");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) System.out.println("Hola!");
            else if (opcion == 2) System.out.println("Hoy es un gran día.");
        } while (opcion != 3);

        // 2. Do-while: leer números hasta ingresar 0
        System.out.println("\nDO-WHILE 2: Suma hasta 0");
        int num;
        int total = 0;
        do {
            System.out.print("Ingrese número (0 para salir): ");
            num = sc.nextInt();
            total += num;
        } while (num != 0);

        System.out.println("Suma total = " + total);

        // 3. Do-while: validar una contraseña
        System.out.println("\nDO-WHILE 3: Validar contraseña");
        String claveCorrecta = "1234";
        String ingreso;

        do {
            System.out.print("Ingrese contraseña: ");
            ingreso = sc.next();
        } while (!ingreso.equals(claveCorrecta));

        System.out.println("Acceso permitido");


        // ============================================================
        // =========================== FOR =============================
        // ============================================================

        // 1. For: imprimir pares de 2 a 20
        System.out.println("\nFOR 1: Pares del 2 al 20");
        for (int x = 2; x <= 20; x += 2) {
            System.out.println(x);
        }

        // 2. For: factorial de un número
        System.out.println("\nFOR 2: Factorial");
        System.out.print("Ingrese número: ");
        int numFact = sc.nextInt();
        long factorial = 1;
        for (int x = 1; x <= numFact; x++) {
            factorial *= x;
        }
        System.out.println("Factorial = " + factorial);

        // 3. For: suma de un arreglo
        System.out.println("\nFOR 3: Suma de arreglo");
        int[] valores = {5, 10, 20, 30};
        int sumArr = 0;
        for (int x = 0; x < valores.length; x++) {
            sumArr += valores[x];
        }
        System.out.println("Suma total = " + sumArr);


        // ============================================================
        // ======================== FOR-EACH ===========================
        // ============================================================

        // 1. For-each: suma de enteros
        System.out.println("\nFOR-EACH 1: Suma de enteros");
        int[] datos = {2, 4, 6, 8};
        int sumaFe = 0;
        for (int valor : datos) {
            sumaFe += valor;
        }
        System.out.println("Suma = " + sumaFe);

        // 2. For-each: recorrer palabras
        System.out.println("\nFOR-EACH 2: Palabras");
        String[] palabras = {"Java", "es", "potente"};
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // 3. For-each: promedio de calificaciones
        System.out.println("\nFOR-EACH 3: Promedio de calificaciones");
        double[] notas = {4.5, 3.8, 5.0, 4.0};
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / notas.length;
        System.out.printf("Promedio = %.2f\n", promedio);


        // ============================================================
        // =================== BREAK Y CONTINUE ========================
        // ============================================================

        // 1. Break: detener al cumplir condición
        System.out.println("\nBREAK 1: detener al llegar a 7");
        for (int x = 1; x <= 10; x++) {
            if (x == 7) break;
            System.out.println(x);
        }

        // 2. Continue: omitir pares
        System.out.println("\nCONTINUE 1: omitir pares");
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) continue;
            System.out.println(x);
        }

        // 3. break + continue: detener al 15, omitir múltiplos de 3
        System.out.println("\nBREAK + CONTINUE");
        for (int x = 1; x <= 20; x++) {
            if (x % 3 == 0) continue;
            if (x == 15) break;
            System.out.println(x);
        }

        sc.close();
    }
}
