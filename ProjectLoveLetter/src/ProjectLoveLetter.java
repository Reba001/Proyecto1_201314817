import java.util.Scanner;
import java.util.Random;
public class ProjectLoveLetter {
public static void main(String[]args){
	System.out.println("-=Bienvenido a Love Letter=-\n");
	System.out.println("(1) Jugar una partida\n");
	System.out.println("(2) Selecciona el numero de tokens a jugar\n");
	System.out.println("(3) Mostrar reglas del juego\n");
	System.out.println("(4) Salir\n");
	System.out.println("Introduzca un numero: ");
	int select = new Scanner(System.in).nextInt();
	if (select == 1){
		System.out.print("Ingrese su nombre: \n");
		String Nombre1 = new Scanner(System.in).nextLine();
		System.out.println();
		System.out.print("Ingrese nombre de Rival: \n");
		String Nombre2 = new Scanner(System.in).nextLine();
		System.out.println();
		System.out.println("\"" + Nombre1 + "\" #Tokens\t" + "\"" + Nombre2 + "\" #Tokens");
		}
	
 
	
}
}
