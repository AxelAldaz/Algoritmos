package com.algoritmos;

import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		//pedir base y exponente, calcular resultado
		int base;
		int exp;
		Ciclos ciclo = new Ciclos();
		/*
		System.out.println("Dame la base");
		base = sc.nextInt();
		System.out.println("Dame el exponente");
		exp = sc.nextInt();
		System.out.println("El resultado es: " +ciclo.Potencia(base, exp));
		*/
		//decir si un alumno paso o no, de acuerdo a calificaciones y asistencias
		Condicionales condicion = new Condicionales();
		/*int calificacion;
		int asistencias;
		
		System.out.println("Cual es tu calificacion?");
		calificacion = sc.nextInt();
		System.out.println("Cuantas asistencias tienes?");
		asistencias = sc.nextInt();
		System.out.println("¡Pasaste: "+condicion.acreditar(asistencias, calificacion));
		*/
		//Salario de un trabajador por horas
		/*double pago;
		double horas;
		
		System.out.println("Cuantas horas trabajaste?");
		horas = sc.nextDouble();
		System.out.println("cuanto te pagan la hora?");
		pago = sc.nextDouble();
		System.out.println("Tu pago es: "+condicion.Salario(horas, pago));
		*/
		
		//Pedir tres numeros y decir cual es el numero de enmedio
		/*int x;
		int y;
		int z;
		
		System.out.println("ingresa el primer numero");
		x = sc.nextInt();
		System.out.println("ingresa el segundo numero");
		y = sc.nextInt();
		System.out.println("ingresa el tercer numero");
		z = sc.nextInt();
		System.out.println("el numero de en medio es: "+condicion.Medio(x, y, z));
	   */
		//Suma de cifras de 2 numeros
		/*int n1, n2;
		System.out.println("Ingresa el primer numero");
		n1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
		n2 = sc.nextInt();
		System.out.println("el total de las cifras es: "+ciclo.sumaNumero(n1, n2));
		*/
		//programa para saber la hora agregandole segundos
		/*int h,m,s,num;
		
		System.out.println("Ingresa la hora");
		h = sc.nextInt();
		System.out.println("Ingresa los minutos");
		m = sc.nextInt();
		System.out.println("Ingresa los segundos");
		s = sc.nextInt();
		System.out.println("Son las: "+h+":"+m+":"+s);
		System.out.println("Ingresa los segundos que quieres incrementar");
		num = sc.nextInt();
		System.out.println("Ahora son las: "+condicion.Horas(h, m, s, num));
		*/
		
		/*int numero=0;
		System.out.println("Ingresa un numero");
		numero = sc.nextInt();
		System.out.println("El numero invertido es: "+ciclo.invertirNumero(numero));
	    */
		
		int x=0, y=0;
		System.out.println("Ingresa un  numero");
		x = sc.nextInt();			
		ciclo.Adivinar(x, y);
		

	}
	

}

