package com.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class Arreglos {
	
	
	public long [] fibonacci(int limite)
	{
		
		long[] serie = new long[limite];
		
		if(limite>1)
		{
			serie[0] = 0;
			serie[1] = 1;
			for(int i=2; i<limite; i++)
			{
				serie[1]= serie[i-1]+serie[i-2];
			}
		}else if (limite == 1)
		{
			serie[0]=0;
		}
		
		return serie;
		
		
	}
	
	public int[] recorrido(int[] arreglo)
	{
		int[] nuevoAr = new int[arreglo.length];
				for(int i=1; i<arreglo.length; i++)
					nuevoAr[i]=arreglo[i-1];
			nuevoAr[0] = arreglo[arreglo.length-1];	
				return nuevoAr;
	}
	
	
	
	
	
	
		
		
	}
		

