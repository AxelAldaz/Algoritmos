package com.algoritmos;

public class Condicionales {
	
	public boolean acreditar(int asistencia, int calificacion)
	{
		final int totalAsistencias = 70;
		boolean paso = false;
		if(asistencia >= (totalAsistencias*.8) && calificacion >= 60 )
			paso = true;
			
		return paso;
	}
	
	public double  Salario(double horas, double pago)
	{
		double total = 0;
		if (horas>40)
		{
			double extras = (horas-40)*(pago*1.5) ;
			total = (40*pago)+ extras;
		}
		else
		{
			 total = 40*pago;
		}
		
		
		
		return total;
		
		
	}
	
	public int Medio(int x, int y, int z)
	{
		if (x>y&&x<z||x>z&&x<y)
		{
			return x;
		}
		
		else if(y>x&&y<z||y<x&&y>z) 
		{
			return y;
		}
		
		else
			
		return y;
	}
	
	
	public String Horas(int h, int m, int s, int num )
	{
		if(num!=0)
		{
			s+=num;
			if(s>59)
			{
				m+=s/60;
				s=s%60;
					if(m>59)
					{
						h+=m/60;
						m=m%60;		
		
						if(h>23)
						{
							h=(h%24);	
						}
					}
			}
		}
		
		return ("Hora: "+h+":"+m+":"+s);
		
		
		
		
		
		
		
		
		
	}

}
