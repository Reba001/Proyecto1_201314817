import java.util.Scanner;
public class ProjectLoveLetter {
public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	int select1 = 1;
	int select2 = 2;
	int select3 = 3;
	int select4 = 4; 
	System.out.println("-=Bienvenido a Love Letter=-\n");
	System.out.println("(" + select1  +  ") Jugar una partida\n");
	System.out.println("(" + select2 + ") Selecciona el numero de tokens a jugar\n");
	System.out.println("(" + select3 + ") Mostrar reglas del juego\n");
	System.out.println("(" + select4 + ") Salir\n");
	System.out.println("Introduzca un numero: ");
	int select = s.nextInt();
	if (select == select1){
		System.out.println("Ingrese un nombre: ");
	}
}
}
