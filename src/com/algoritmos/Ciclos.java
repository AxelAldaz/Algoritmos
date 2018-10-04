package com.algoritmos;

import java.util.Scanner;

public class Ciclos {
	
	public int Potencia(int base, int exponente)
	{
		int res=1;
		
		for(int i= 0; i<exponente; i++)
		res *= base;
		
		return res;
	}
	
	public int sumaNumero (int n1, int n2)
	{
		int cont1 = 0;
		int cont2 = 0;
        while(n1>-1)
        {
        	n1 = n1/10;
        	cont1++;
        }
        while(n2>-1)
        {
        	n2 = n2/10;
        	cont2++;
        }
        return cont1+cont2;
	}
	
	public int invertirNumero(int numero)
	{
		int cifra, inverso = 0;
		
		while(numero!=0)
		{
		cifra =numero%10;
		inverso = (inverso * 10)+ cifra;
		numero/=10;
		}
		return inverso;
	}
	
	public String Adivinar(int x,int y)
	{
		Scanner sc = new Scanner(System.in);
		while(y==x)
		{
		y = sc.nextInt();	
		if(x>y)
		{
			return ("El numero es menor"+y);
		}
		else if(y>x)
		{
			return ("El numero es mayor"+y);
		}
			
		}return ("Adivinaste");
		
		
	}
	
	//public String Matriz(int numero)
	{
		//string cuadro = "";
		//return cuadro;
	}
}
