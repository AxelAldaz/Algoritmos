package com.algoritmos;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


public class AlgoritmosApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		//pedir base y exponente, calcular resultado
		int base;
		int exp;
		Ciclos ciclo = new Ciclos();
		Arreglos arreglo = new Arreglos();
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
		
		/*int x=0, y=0;
		System.out.println("Ingresa un  numero");
		x = sc.nextInt();			
		ciclo.Adivinar(x, y);
		*/
		
//		int arreglo[] = new int [10];
//		Random rn = new Random();
//		int n =0;
//		
//		for(int i=0;i<10;i++)
//		{
//			n = (int)(rn.nextDouble()*12)+1;
//			arreglo[i] = n;
//			arreglo[i]++;			
//		}
//		
//		
//		for(int i=0; i<10; i++){
//		switch (arreglo[i])
//		{
//		case 1:System.out.println(arreglo[i]+" -> Enero");
//			break;
//		case 2:System.out.println(arreglo[i]+" -> Febrero");
//			break;
//		case 3:System.out.println(arreglo[i]+" -> Marzo");
//			break;
//		case 4:System.out.println(arreglo[i]+" -> Abril");
//			break;
//		case 5:System.out.println(arreglo[i]+" -> Mayo");
//			break;
//		case 6:System.out.println(arreglo[i]+" -> Junio");
//			break;
//		case 7:System.out.println(arreglo[i]+" -> Julio");
//			break;
//		case 8:System.out.println(arreglo[i]+" -> Agosto");
//			break;
//		case 9:System.out.println(arreglo[i]+" -> Septiembre");
//			break;
//		case 10:System.out.println(arreglo[i]+" -> Octubre");
//			break;
//		case 11:System.out.println(arreglo[i]+" -> Noviembre");
//		break;
//		case 12:System.out.println(arreglo[i]+" -> Diciembre");
//		break;
//		default: System.out.println("error");
//		break;
//			
//		}
//		}
		
	
//		System.out.println("Ingresa un numero");
//		num = sc.nextInt();
//		long[] serie = new long[num];
//		serie= arreglo.fibonacci(num);
//		for(long num : serie)
//			System.out.println(num);
//		System.out.println("");
		
		
		//PILAS
//		Stack<String> pilas = new Stack<String>();
//		pilas.push("Adal");
//		pilas.push("Victor");
//		pilas.push("Efren");
//		pilas.push("La yadis");
//		System.out.println("El tamaño: "+pilas.size());
//		System.out.println("Ultimo elemento: "+pilas.peek());
//		System.out.println("El tamaño: "+pilas.size());
//		System.out.println("Ultimo elemento despues de peek: "+pilas.pop());
//		System.out.println("El tamaño: "+pilas.size());
//		System.out.println("Ultimo elemento despues de pop: "+pilas.peek());
//		System.out.println("El indice 1: "+pilas.get(1));
//		while(pilas.size()>0)
//			System.out.println(pilas.pop());
		
//		//COLAS
//		PriorityQueue<String> cola = new PriorityQueue<String>();
//		cola.add("Ulises");
//		cola.add("Pacheco");
//		cola.add("Axel");
//		cola.add("Chino");
//		
//		Iterator it = cola.iterator();
//		while(it.hasNext()){
//		   System.out.println(it.next());
//		}
//		//PEEK nos muestra el primer elemento de la cola
//		System.out.println("El primero: "+cola.peek());
//		//poll nos muestra el primer elemento de la cola y lo saca de ella
//		System.out.println("El primero: "+cola.poll());
//		System.out.println("El nuevo primero: "+cola.peek());
//		//Contains nos dice si muestra cola contiene cierto elemento
//		System.out.println("Contiene Ulises? "+cola.contains("Ulises"));
//		System.out.println("Contiene Manu? "+cola.contains("Manu"));
//		//Remove 
//		cola.remove("Pacheco");
	    
		//TreeSet
//		TreeSet<String> arbol = new TreeSet<String>();
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		
//		System.out.println("Elementos en el arbol: "+arbol.size());
//		Iterator it = arbol.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		
//		System.out.println("Se agrego elemento Marco? "+arbol.add("Marco"));
//		System.out.println("Se agrego elemento Cesar? "+arbol.add("Cesar"));
//		
//		//Remove
//		arbol.remove("Marco");
//		//Clear
//		arbol.clear();
		
		//HASHtable contiene claves para cada una de sus enradas
//		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
//		hash.put(1,"Yareli");
//		hash.put(2,"Alan");
//		hash.put(3,"Manu");
//		//Se recorre con Enumeration en lugar de Iterator
//		Enumeration en = hash.keys();
//		while(en.hasMoreElements()){
//			int clave = (int)en.nextElement();
//			System.out.println(clave+" - "+hash.get(clave));
//		}
//		hash.put(5,"Osvaldo");
//		hash.put(4,"Alan");
//		System.out.println("\n");
//		System.out.println("Existe la clave 3? "+hash.containsKey(3));
//		System.out.println("Existe la clave 4? "+hash.containsKey(4));
//		System.out.println("\n");
//		en= hash.keys();
//		while(en.hasMoreElements()){
//			int clave = (int)en.nextElement();
//			System.out.println(clave+" - "+hash.get(clave));
//		}
		
//		TreeMap<String, Integer> tmap = new TreeMap<>();
//		tmap.put("Michelle", 90);
//		tmap.put("Oscar", 95);
//		tmap.put("Alan",91);
//		tmap.put("Yareli", 89);
//		Iterator it = tmap.keySet().iterator();
//		while(it.hasNext())
//		{
//			String clave = (String)it.next();
//			System.out.println(clave+"-->"+tmap.get(clave));
//		}
//		tmap.remove("Yareli");
//		
//		int[] arreglor = {1,2,3,4,5,6,7,8,9,0};
//		for(int i : arreglor)
//			System.out.print(i+ " ");
//		System.out.println();
//		arreglor = arreglo.recorrido(arreglor);
//		for (int i: arreglor)
//			System.out.print(i+ " ");
		
		Archivos archivo = new Archivos();
		String lorem="";
		
		lorem = archivo.reemplazar("C:\\Users\\Axel Aldaz\\Desktop\\Prueba.txt");;
	    System.out.println(lorem);
	    archivo.Guardar("C:\\Users\\Axel Aldaz\\Desktop\\Prueba.txt", lorem);
//		
//	archivo.escribir("C:\\Users\\Axel Aldaz\\Desktop\\Escrito.txt","Que rosho!!");
//	archivo.escribir("C:\\Users\\Axel Aldaz\\Desktop\\Escrito.txt","plebes!!");
		
		
		
	}
	
	
}

