package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa un numero entre 1 y 1000");
		int numero=entrada.nextInt();
		String romanos="";
		int cont=0;
		int num=0;
		if (numero>0&&numero<=1000) {
			if(numero==1000) {
				romanos=romanos.concat("M");
			}else {
				num = numero / 100%10;
				switch (num) {
				case 1:
					romanos=romanos.concat("C");
					break;
				case 2:
					romanos=romanos.concat("CC");

					break;
				case 3:
					romanos=romanos.concat("CCC");

					break;	
				case 4:
					romanos=romanos.concat("CD");

					break;	
				case 5:
					romanos=romanos.concat("D");

					break;	
				case 6:
					romanos=romanos.concat("DC");

					break;	
				case 7:
					romanos=romanos.concat("DCC");

					break;
				case 8:
					romanos=romanos.concat("DCCC");

					break;
				case 9:
					romanos=romanos.concat("CM");

					break;
				}
				num = numero / 10%10;
				switch (num) {
				case 1:
					romanos=romanos.concat("X");
					break;
				case 2:
					romanos=romanos.concat("XX");

					break;
				case 3:
					romanos=romanos.concat("XXX");

					break;	
				case 4:
					romanos=romanos.concat("XL");

					break;	
				case 5:
					romanos=romanos.concat("L");

					break;	
				case 6:
					romanos=romanos.concat("LX");

					break;	
				case 7:
					romanos=romanos.concat("LXX");

					break;
				case 8:
					romanos=romanos.concat("LXXX");

					break;
				case 9:
					romanos=romanos.concat("XC");

					break;
				}
				num = numero%10;
				switch (num) {
				case 1:
					romanos=romanos.concat("I");
					break;
				case 2:
					romanos=romanos.concat("II");

					break;
				case 3:
					romanos=romanos.concat("III");

					break;	
				case 4:
					romanos=romanos.concat("IV");

					break;	
				case 5:
					romanos=romanos.concat("V");

					break;	
				case 6:
					romanos=romanos.concat("VI");

					break;	
				case 7:
					romanos=romanos.concat("VII");

					break;
				case 8:
					romanos=romanos.concat("VIII");

					break;
				case 9:
					romanos=romanos.concat("IX");

					break;
				}
			}
			System.out.println("el numero "+numero+" en romano es: "+romanos);
		}else {
			System.out.println("El numero no esta en el rango");
		}

	}

}
