package modelo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		String letrasMorse[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String numerosMorse[]= {"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
		String cad;
		String morse="";
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese la palabra");
		cad=entrada.nextLine();
		cad=cad.toUpperCase();

		if(cad.length()>0) {
			/// espa?ol a morse
			if(!cad.contains(".")&&!cad.contains("-")) {
				for (int i = 0; i < cad.length(); i++) {
					if(cad.charAt(i)!=' ') {
						if(esNumero(cad.charAt(i)+"")) {
							// saco el numero del arreglo restando 1 por las posiciones del array
							morse=morse.concat(numerosMorse[Integer.parseInt(cad.charAt(i)+"")-1]+" ");
						}else {
							// saco la letra del arreglo y le resto A para dar a entender que a es el inicio
							morse=morse.concat(letrasMorse[Integer.parseInt((cad.charAt(i)-'A')+"")]+" ");
						}

					}else {
						// espacios 
						morse=morse.concat("   ");
					}
				}
			}else {
				//morse a espa?o
				int cont=0;
				String aux="";
				for (int i = 0; i < cad.length(); i++) {
					if(cad.charAt(i)==' ') {
						
							if(aux!="") {
								// vemos si es letra o numero
								if (aux.length()!=5) {
									for (int j = 0; j < letrasMorse.length; j++) {
										// recoremos el array y lo checamos y aumentamos 65 para sarcar el valor de la letra 
										if (aux.contentEquals(letrasMorse[j])) {
											char c=(char) ((j)+65);
											morse=morse.concat(c+"");
										}
										
									}
								} else {
									for (int j = 0; j < numerosMorse.length; j++) {
										// recoremos el array y asignamos j para meter el numero

										if (aux.contentEquals(numerosMorse[j])) {
											morse=morse.concat(j+"");
										}
										
									}
								}
							
							aux="";
						}
							if (cad.charAt(i+1)==' ') {
								i=i+2;
								morse=morse.concat(" ");
							}
							
					}else {
						aux+=cad.charAt(i);
					}
				}
				/// hacemos lo mismo para morse a espa?ol pero con el dato que se queda en aux
				if(aux!="") {
					if (aux.length()==4) {
						for (int j = 0; j < letrasMorse.length; j++) {
							if (aux.contentEquals(letrasMorse[j])) {
								char c=(char) ((j)+65);
								morse=morse.concat(c+"");
							}
							
						}
					} else {
						for (int j = 0; j < numerosMorse.length; j++) {
							if (aux.contentEquals(numerosMorse[j])) {
								morse=morse.concat(j+"");
							}
							
						}
					}
				}
				aux="";
			}
			
			
			System.out.println("\n"+morse);

		}
	}
		public static boolean esNumero(String numero) {
			try {
				Integer.parseInt(numero);
				return true;
			} catch (NumberFormatException e) {
				return false;	
			}
		}
	}
