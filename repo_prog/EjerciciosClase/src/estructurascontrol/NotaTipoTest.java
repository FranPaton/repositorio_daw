package estructurascontrol;

import java.util.Scanner;

/*	Exámen tipo test
 *  N* de preguntas, nº de aciertos y nº de errores
 *  Resultado = ((aciertos - errores/2) * 10 ) / numPreguntas
 *  Redondear con Math.round y calcular nota
 *  0-4 INSUF
 *  5-6 SUF
 *  7-8 NOT
 *  9-10 SOB 
 */ 

public class NotaTipoTest {

	public static void main(String[] args) {
		
		int numPreguntas, numAciertos, numErrores;
		int notaMedia;
		String msgResultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce número de preguntas");
		numPreguntas = entrada.nextInt();
		System.out.println("Introduce número de aciertos");
		numAciertos = entrada.nextInt();
		System.out.println("Introduce número de errores");
		numErrores = entrada.nextInt();
		if (numAciertos + numErrores <= numPreguntas) {
			notaMedia = Math.round((numAciertos - numErrores/2)*10) / numPreguntas;
			
			msgResultado = "\nNúmero de preguntas: " +  numPreguntas 
					+ "\nNúmero de aciertos: " + numAciertos
					+ "\nNúmero de errores: " + numErrores
					+ "\n------------------------"
					+ "\nNota media: " + notaMedia;
			//System.out.println(msgResultado);
					
			switch(notaMedia) {
				case 0,1,2,3,4:
				{
					msgResultado += " - Insuficiente";
					break;
					
				}
				case 5,6:{
					msgResultado += " - Suficiente";
					break;
				}
				case 7,8:{
					msgResultado += " - Notable";
					break;
				}
				case 9,10:{
					msgResultado += " - Sobresaliente";
					break;
				}
				default: msgResultado += " - Insuficiente";
				
			}
			
		}
		else {
			msgResultado = "Error. La suma de aciertos y errores no puede superar el número de preguntas";
		}
		
		System.out.println(msgResultado);
		
		
	}

}
