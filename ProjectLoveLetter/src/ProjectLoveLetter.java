import java.util.Scanner;

public class ProjectLoveLetter
{
	static int token=0;
    public static void main(String[]args)
    {
    	Scanner s = new Scanner(System.in);
    	int select;
    	String[] arrayDeck = 
				new String[] {"(1) Guard","(1) Guard","(2) Priest","(1) Guard"
				,"(3) Baron", "(1) Guard","(4) Handmaid","(1) Guard","(5) Prince","(2) Priest"
				,"(6) King","(3) Baron","(7) Countess","(4) Handmaid","(8) Princess","(5) Prince"};
    	System.out.println("-=Bienvenido a Love Letter=-\n");
		System.out.println("(1) Jugar una partida\n");
		System.out.println("(2) Selecciona el numero de tokens a jugar\n");
		System.out.println("(3) Mostrar reglas del juego\n");
		System.out.println("(4) Salir\n");
		System.out.println("Seleccione : ");
		select = s.nextInt();
		switch(select)
		{
		case 1:
			System.out.print("Ingrese su nombre: \n");
			String Nombre1 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.print("Ingrese nombre de Rival: \n");
			String Nombre2 = new Scanner(System.in).nextLine();
			System.out.println();
			System.out.println("\"" + Nombre1 + "\"\t" + token+"tokens \t\t\t\"" + Nombre2 +  "\"\t"  + token+"tokens");
			System.out.println("******Se han barajeado las cartas******");
			barajear(arrayDeck);
			break;
		case 2:
			do
			{
				System.out.print("Introduzca numero de Tokens que desea jugar ");
				System.out.print("(solo puede jugar 1,3 o 7 tokens):\n");
				token = s.nextInt();
				}
				while (token != 7 && token != 3 && token != 1);
					if(token == 7 || token==1 || token  == 3)
				System.out.println("numero de tokens seleccionados regresando a menu principal........");
					
					
				System.out.println("         *************************************         ");
				main(args);
				break;
		case 3:
		}

}
      public static void barajear(String[] arrayDeck)
      {
    	  for (int i=0;i<arrayDeck.length;i++)
    		{
    			int iDeck = (int)(Math.random()*arrayDeck.length);
    			String seleccion = arrayDeck[iDeck]; 
    			if (seleccion == null){
    			i--;
    			}
    			else
    			{
    			System.out.println(iDeck + arrayDeck[iDeck]);	
    			}
    			arrayDeck[iDeck]=null;
    		}
	  }	
		
	}
	