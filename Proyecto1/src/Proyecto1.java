import java.util.Scanner;
public class Proyecto1 {
	public static void main(String[]args){
		int select; 
		int token = 0;
        do{
		System.out.println("-=Bienvenido a Love Letter=-\n");
		System.out.println("(1) Jugar una partida\n");
		System.out.println("(2) Selecciona el numero de tokens a jugar\n");
		System.out.println("(3) Mostrar reglas del juego\n");
		System.out.println("(4) Salir\n");
		System.out.println("Seleccione : ");
		select = new Scanner(System.in).nextInt();
		}
		while(select != 1 && select != 2 && select !=3 && select !=4 );
		if(select == 1){
			System.out.print("Ingrese su nombre: \n");
			String Nombre1 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.print("Ingrese nombre de Rival: \n");
			String Nombre2 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.println("\"" + Nombre1 + "\"" + token + "\t \t\"" + Nombre2 + "\"" + token);
		}
		else if (select == 2){
			System.out.print("Introduzca numero de Tokens que desea jugar ");
			System.out.print("(puede jugar hasta 7 tokens):\n");
			token = new Scanner(System.in).nextInt();
			}
		else if (select == 3){
			System.out.println("Aqui van las reglas del juego");
			
			
		}
		else{
			System.out.println("Saliendo del juego........");
			
		}
	}

}
