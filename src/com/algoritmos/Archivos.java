package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
	public String leer(String ubicacion)
	{
		String texto = "";
		try{
		File archivo = new File(ubicacion);
		FileReader reader = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(reader);
		String temp;
		while((temp=buffer.readLine()) != null){
			texto += temp+ "\n";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return texto;
	}

	
	public void escribir(String ubicacion, String contenido)
	{
		try{
		FileWriter archivo = new FileWriter(ubicacion);
		PrintWriter writer = new PrintWriter(archivo);
		writer.println(contenido);
		writer.close();
						
	}catch(IOException e){
		e.printStackTrace();
	}
	}
		
		public String reemplazar(String ubicacion){
			String texto = "";
			String Resultado = "";
			try{
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(reader);
			String temp;
			while((temp=buffer.readLine()) != null){
				texto += temp+ "\n";
				Resultado = texto.replaceAll("[a|e|i|o|u|A|E|I|O|U]", "_");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		return Resultado;	
		}
		
		
		
		public void Guardar(String ubicacion, String contenido)
		{
			try{
			FileWriter archivo = new FileWriter(ubicacion);
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
							
		}catch(IOException e){
			e.printStackTrace();
		}
		}

	}
	

