package cl.dojo.algoritmosbasicos;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgoritmosBasicos {
	
	public void imprimir() {
		System.out.println("----------ejercicio 1-------------");
		System.out.println("Escriba un m�todo que imprima todos los n�mero del 1 al 255.");
				
		for(int i =1;i<256;i++) {
			System.out.print(i+", ");
			
								
		}System.out.println(" ");
	}
	
	
	public void imprimir2() {
		System.out.println("----------ejercicio 2-------------");
		System.out.println("Escriba un m�todo que imprima todos los n�mero impares entre el 1 al 255.");
		
		
		for(int i =1;i<256;i=i+2) {
			System.out.print(i+", ");
			
			}System.out.println(" ");
			
		}
	
	public void imprimirsuma() {
		System.out.println("----------ejercicio 3-------------");
		System.out.println("Escriba un m�todo que imprima los n�meros desde el 0 hasta el 255, pero esta vez muestre tambi�n las suma de los n�meros que ha mostrado en pantalla hasta ahora.");
		
		int suma=0;
		for(int i =0;i<256;i++) {
			
			suma=suma+i;
			System.out.println("Nuevo numero: "+i+" "+"Suma: "+suma);
			
			
			
		}
	}
	
	
	public void recorer(){
		System.out.println("----------ejercicio 4-------------");
		System.out.println("Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un m�todo que recorra cada uno de los elementos del arreglo e imprima cada valor.");
		
		
		int[] x = {1,3,5,7,9,13};
		
		
		
		System.out.println(" largo de array: "+x.length);
		
		for(int i =0; i<x.length;i++) {
			
			System.out.printf(" posicion %d elemento %d " , i, x[i]);
			System.out.println("");
			
		}
		
		
		
		
	}
	
	public void promedio(){
		System.out.println("----------ejercicio 5-------------");
		System.out.println("Escribir un m�todo que tome un arreglo e imprima el promedio de los valores en el arreglo. "
				+ "Por ejemplo en un arreglo hay [2,8,3,10,1,14], su m�todo deber�a Imprimir �Promedio de 6.33�.");
		
		
		int[] x = {2,8,3,10,1,14};
		double suma=0;
		double	resultado=0;
		
		
		
		for(int i =0; i<x.length;i++) {
			suma=suma+x[i];
			resultado = suma/x.length;
			
			
		}System.out.printf("El promedio del array es: "+ Math.round(resultado*100.0)/100.0);
		
		
		System.out.println("");
		
	}
	
	public void arrayimpar() {
		System.out.println("----------ejercicio 6-------------");
		System.out.println("Escribir un m�todo que cree un arreglo �y� que contenga todos los n�meros impares entre 1 - 255. "
				+ "Cuando el m�todo haya terminado, �y� debe tener los valores de [1,3,5,7�255].");
		ArrayList<Integer> y=new ArrayList<Integer>();
		
		for(int i =1;i<256;i++) {
			if(i%2!=0) {
			y.add(i);
			
			}
			
		}System.out.println(y);
	}
	
	public void mayorquey(){
		System.out.println("----------ejercicio 7-------------");
		System.out.println("Escribir un m�todo que tome un arreglo y devuelva el n�mero de valores mayores a un valor Y dado. "
				+ "Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, despu�s de terminar el proceso el m�todo debe Imprimir el n�mero 2 "
				+ "(ya que hay 2 valores en el arreglo que son mayores que 3).");
		
		
		int[] x = {1,3,5,7};
		int y=3;
		int contador=0;
		
		
		
		for(int i =0; i<x.length;i++) {
			
			if(x[i]>y) {
				contador=contador+1;
				
			}
			
			
		}System.out.println("Hay "+contador+" mayores que: "+y);
		
		
		
		
	}
	
	public void cuadrado(){
		System.out.println("----------ejercicio 8-------------");
		System.out.println("Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un m�todo que multiplique "
				+ "cada valor en el arreglo por s� mismo. "
				+ "Cuando el m�todo haya terminado, el arreglo x debe contener valores que han "
				+ "sido elevados al cuadrado, digamos [1,25,100,4].");
				
		int[] arri = {1,5,10,-2};
						
		for(int i =0; i<arri.length;i++) {
			
				arri[i]=(int) Math.pow( arri[i],2);
				
				
		}System.out.println(java.util.Arrays.toString(arri));
		
				
	}
	
	public void negativos(){
		System.out.println("----------ejercicio 9-------------");
		System.out.println("Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que reemplace cualquier n�mero negativo por 0. "
				+ "Cuando el m�todo haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].");
				
		int[] arri = {1,5,10,-2};
		int a=0;				
		for(int i =0; i<arri.length;i++) {
			if(arri[i]<a) {
				
				arri[i]=0;
			}
				
				
				
		}System.out.println(java.util.Arrays.toString(arri));
		
				
	}
	
	public void minmaxprom(){
		System.out.println("----------ejercicio 10-------------");
		System.out.println("Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que devuelva un arreglo con el n�mero m�ximo, "
				+ "el n�mero m�nimo y el valor promedio que hay en el arreglo x. "
				+ "El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].");
				
		int[] arri = {1,5,10,-2};
		int a=0;
		int b=0;
		double suma =0;
		double promedio=0;
		Arrays.sort(arri);
		a=arri[arri.length-1];
		b=arri[0];
		 
		for(int i=0;i<arri.length;i++) {
			suma=suma+arri[i];
			promedio=suma/arri.length;
		}
		
		ArrayList<Integer> resultado=new ArrayList<Integer>();
		resultado.add(a);
		resultado.add(b);
		resultado.add((int) promedio);
		
		System.out.println(resultado);
		
				
	}
	public void cambio(){
		System.out.println("----------ejercicio 11-------------");
		System.out.println("Dado un arreglo x, digamos [1,5,10,7,-2], escribir un m�todo que cambie cada valor por el valor que sigue. "
				+ "Por ejemplo, cuando el m�todo haya terminado, un arreglo x [1,5,10,7,-2] se convertir� en [5,10,7,-2,0]. "
				+ "Observe que el �ltimo n�mero es 0. El m�todo no necesita ajustarse para los valores que est�n fuera de los l�mites.");
				
		int[] array = {1,5,10,7,-2};
		
		
		  for(int i =1; i<array.length;i++) {
			
			array[i-1]=array[i];
			
			if (i==array.length-1) {
				array[i]=0;
			}
			
			
			}
		 
		  System.out.println(java.util.Arrays.toString(array));
				
				
				
		}
		
				
	
	
	

}
