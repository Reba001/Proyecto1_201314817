import java.util.Scanner;
public class ProjectLoveLetter{
	static int token=0;
    public static void main(String[]args){
    	int select=0;
    	Scanner s = new Scanner(System.in);
    	int c = token;
		System.out.println("-=Bienvenido a Love Letter=-\n");
		System.out.println("(1) Jugar una partida\n");
		System.out.println("(2) Selecciona el numero de tokens a jugar\n");
		System.out.println("(3) Mostrar reglas del juego\n");
		System.out.println("(4) Salir\n");
		System.out.println("Seleccione : ");
		select = s.nextInt();
		switch(select){
		case 1:
			System.out.print("Ingrese su nombre: \n");
			String Nombre1 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.print("Ingrese nombre de Rival: \n");
			String Nombre2 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.println("\"" + Nombre1 + "\"\t" + c+"tokens \t\t\t\"" + Nombre2 +  "\"\t"  + c+"tokens");
			break;
		case 2:
			do{
				System.out.print("Introduzca numero de Tokens que desea jugar ");
				System.out.print("(puede jugar 1,3 o 7 tokens):\n");
				token = new Scanner(System.in).nextInt();
				}
				while (token != 7 && token != 3 && token != 1);
					if(token == 7 || token==1 || token  == 3)
				System.out.println("numero de tokens seleccionados regresando a menu principal........");

					System.out.println();
					main(args);
		}

}
		
	}
	