import java.util.Scanner;

public class ProjectLoveLetter
{
	static int token=0;
    public static void main(String[]args)
    {
    	Scanner s = new Scanner(System.in);
    	int select;
    	int jugar;
    	
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
			for (int i=0;i<arrayDeck.length;i++)
			{
				int iDeck = (int)(Math.random()*arrayDeck.length);
				String seleccion = arrayDeck[iDeck];
				 if (seleccion == null){
						i--;
						
						}
				else if (i==0){
				  System.out.println("Carta en la mano"+arrayDeck[iDeck]);
			  }	
			  else if(i==3)
			  {
				System.out.println("Mano del rival"+arrayDeck[iDeck]);  
			  }
				
				else if(i<16 && i>=13)
				{
				System.out.print("Cartas fuera del maso:"+arrayDeck[iDeck]+"\t\t");
				}
				else
				{
					if(i==1){
					System.out.println("tienes en tu mano"+arrayDeck[iDeck]);
					System.out.println("(1) Usar Carta1: ");
					System.out.println("(2) Usar Carta2: ");
					System.out.println("(3) Salir del juego");
					System.out.println("(4) Ver la mano del opnente");
					System.out.println("(5) ver el mazo barajeado");
					System.out.println("Porfavor seleccione una opcion: ");
			        jugar = s.nextInt();
			        switch (jugar)
			        {
			        case 1:
			        	System.out.print("Has jugado: "+arrayDeck[iDeck]+"\t\t");
			        	break;
			        case 2:
			        	System.out.print("Has jugado: "+arrayDeck[iDeck]+"\t\t");
			        	break;
			        case 3:
			        	break;
			        case 5:
			        	barajear(arrayDeck);
			        	main(args);
			        	break;
			        }
			        if(arrayDeck[iDeck]=="(1) Guard")
					{
					  System.out.println("Escoge una carta (1) Guard , (2) Priest, (3) Baron, (4) Handmaid, (5) Prince, (6) King, (7) Countess, (8) Princess");
					}
			        else if(arrayDeck[iDeck]=="(2) Priest"||i==3 && i==2)
			        {
			        	System.out.print("\t\tMano del Rival"+arrayDeck[iDeck]+"\n\n");
			        }
			        else if (arrayDeck[iDeck]=="(3) Baron")
			        {
			        	if(i==2 && i==3)
			        	{
			        		System.out.println("Su carta es mayor gana"+ arrayDeck[iDeck]);
			        	}
			        	}
			        }
			  
					else if (i==2){
						System.out.print("\t\tMano del Rival"+arrayDeck[iDeck]+"\n\n");
						
					}
				}
				arrayDeck[iDeck]=null;
				
			}
		
			
			
			
			
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
			System.out.println("La guardia echó una mirada de arriba a");
            System.out.println("abajo a Bartolemew Kaiss y frunció el");
            System.out.println("ceño. “Lo siento maestre Kaiss, pero la");
            System.out.println("princesa no recibe visitas. Como puede");
            System.out.println("imaginar se encuentra desconsolada por el");
            System.out.println("arresto de su madre.”");
            System.out.println("“Por supuesto,” dijo el joven compositor");
            System.out.println("asintiendo y con gesto comprensivo. “Pero");
            System.out.println("no estoy sólo de visita, verá: Su alteza ha");
            System.out.println("requerido mis servicios, vamos a practicar");
            System.out.println("canto.”");
            System.out.println("“La princesa ya tiene un maestro de");
            System.out.println("canto,” respondió la mujer bruscamente");
            System.out.println("arqueando una ceja.");
            System.out.println("“Estoy segura de que él ya lo sabe,");
            System.out.println("Odette,” dijo una voz gentil que resonó");
            System.out.println("desde la estancia que conectaba la");
            System.out.println("residencia al palacio. Ambos se giraron");
            System.out.println("para ver a Susannah, una de las doncellas");
            System.out.println("de la princesa Annete quien caminaba hacia");
            System.out.println("ellos. “Lo que el buen compositor quiere");
            System.out.println("decir es que Annete ha solicitado sus");
            System.out.println("obras para ensayar.” La joven mujer sonrío");
            System.out.println("a la guardia mientras le guiñaba el ojo a");
            System.out.println("Bartolemew de una manera cómplice");
            System.out.println("De su cartera, Bartolemew sacó un tubo");
            System.out.println("cerrado. “Si fueras tan amable de entregar");
            System.out.println("estas partituras, mi querida Susannah,” dijo");
            System.out.println("con una sonrisa y asentimiento.");
            System.out.println("La guardia recogió el tubo pero mientras");
            System.out.println("cambiaba de manos, algo se deslizó dentro");
            System.out.println("del tubo “™Que más hay aquí dentro?”");
            System.out.println("preguntó la guardia mientras se lo acercaba");
            System.out.println("a la oreja.");
            System.out.println("Ciertamente no la pequeña estatua de un pájaro");
            System.out.println("que tanto le gusta a la princesa,");
            System.out.println("pensó para");
            System.out.println("si Bartolemew. “Es... la pluma y tinta");
            System.out.println("que uso para escribir la música, es por");
            System.out.println("si acaso el maestro desea hacer algún");
            System.out.println("cambio. Siempre las incluyo en las nuevas");
            System.out.println("composiciones.”");
            System.out.println("Susannah le cogió el tubo a la suspicaz");
            System.out.println("guardia cuidadosamente. “™Oh quieres");
            System.out.println("dejarlo ya Odette? Es tan solo música,”");
            System.out.println("reprendió en tono jocoso.");
            System.out.println("“Me encargaré de que lleguen a milady,”");
            System.out.println("dijo mientras posaba su mano en el brazo");
            System.out.println("de Batolemew. “Estoy segura de que arde");
            System.out.println("en deseos de ver su contenido.”De su cartera, Bartolemew sacó un tubo");
            System.out.println("cerrado. “Si fueras tan amable de entregar");
            System.out.println("estas partituras, mi querida Susannah,” dijo");
            System.out.println("con una sonrisa y asentimiento.");
            System.out.println("La guardia recogió el tubo pero mientras");
            System.out.println("cambiaba de manos, algo se deslizó dentro");
            System.out.println("del tubo “™Que más hay aquí dentro?”");
            System.out.println("preguntó la guardia mientras se lo acercaba");
            System.out.println("a la oreja.");
            System.out.println("Ciertamente no la pequeña estatua de un pájaro");
            System.out.println("que tanto le gusta a la princesa,");
            System.out.println("pensó para");
            System.out.println("si Bartolemew. “Es... la pluma y tinta");
            System.out.println("que uso para escribir la música, es por");
            System.out.println("si acaso el maestro desea hacer algún");
            System.out.println("cambio. Siempre las incluyo en las nuevas");
            System.out.println("composiciones.”");
            System.out.println("Susannah le cogió el tubo a la suspicaz");
            System.out.println("guardia cuidadosamente. “™Oh quieres");
            System.out.println("dejarlo ya Odette? Es tan solo música,”");
            System.out.println("reprendió en tono jocoso.");
            System.out.println("“Me encargaré de que lleguen a milady,”");
            System.out.println("dijo mientras posaba su mano en el brazo");
            System.out.println("de Batolemew. “Estoy segura de que arde");
            System.out.println("en deseos de ver su contenido.”");
            System.out.println("objetivo");
            System.out.println("Tras el arresto de la Reina Marianna");
            System.out.println("acusada de alta traición, nadie resultó más");
            System.out.println("entristecida por la noticia que su hija la");
            System.out.println("princesa Annete.");
            System.out.println("Los pretendientes de la ciudad estado");
            System.out.println("de Tempest buscan consolar la pena de");
            System.out.println("Annete cortejandola para traer un poco de");
            System.out.println("alegría a su vida.");
            System.out.println("Tú eres uno de esos pretendientes,");
            System.out.println("intentado que tu carta de amor llegue a");
            System.out.println("la princesa. Lamentablemente ella se ha");
            System.out.println("recluido en su palacio por lo que debes");
            System.out.println("confiar que los intermediarios lleven tu");
            System.out.println("mensaje.");
            System.out.println("A lo largo del juego, mantendrás una carta");
            System.out.println("en secreto en tu mano, que representa");
            System.out.println("a quien llevará tu mensaje de amor a la");
            System.out.println("princesa.");
            System.out.println("Deberás asegurarte de que sea la persona");
            System.out.println("más cercana a la princesa la que tenga");
            System.out.println("tu carta al final del día, para que pueda");
            System.out.println("entregarla primero.");
            System.out.println("componentes");
            System.out.println("Tu ejemplar de Love Letter debe incluir");
            System.out.println("lo siguiente, si no es así contacta con");
            System.out.println("customerservice@alderac.com para recibir");
            System.out.println("asistencia técnica.");
            System.out.println("•");
            System.out.println("16 cartas de juego");
            System.out.println("•");
            System.out.println("4 ayudas de juego");
            System.out.println("•");
            System.out.println("fichas de afecto");
            System.out.println("cartas de juego");
            System.out.println("El juego tiene 16 cartas. Cada carta");
            System.out.println("diferente representa a alguien de la");
            System.out.println("residencia real.");
            System.out.println("Cada carta tiene un valor en la esquina");
            System.out.println("superior izquierda – cuanto más alto sea");
            System.out.println("el número, más cercana es la persona a");
            System.out.println("la princesa. En la parte inferior de cada");
            System.out.println("carta un texto describe su efecto cuando es");
            System.out.println("descartada.");
            System.out.println("ayudas de juego");
            System.out.println("En ellas aparecen las diferentes cartas");
            System.out.println("de juego, así como sus efectos y cuántas");
            System.out.println("copias de cada una hay en la baraja. No");
            System.out.println("se usan en el juego sino que sirven como");
            System.out.println("ayuda nemotécnica.");
            System.out.println("fichas de afecto");
            System.out.println("El juego incluye también fichas rojas usadas");
            System.out.println("para llevar la cuenta del creciente afecto de"); 
            System.out.println("la princesa por aquellos pretendientes que");
            System.out.println("consiguen entregar sus cartas.");
            System.out.println("pr epa r ación");
            System.out.println("de la partida");
            System.out.println("Baraja las 16 cartas colócalas cara abajo y");
            System.out.println("forma un mazo de robo. Elimina la primera");
            System.out.println("carta del mazo del juego sin mirarla.");
            System.out.println("Si estás jugando una partida de dos");
            System.out.println("jugadores, elimina tres cartas más del mazo");
            System.out.println("y déjalas aparte cara arriba. Estás cartas");
            System.out.println("no se usarán esta ronda.");
            System.out.println("Cada jugador roba una carta del mazo.");
            System.out.println("Esta carta es la mano inicial y debe");
            System.out.println("mantenerse en secreto");
            System.out.println("El jugador que haya tenido la cita más");
            System.out.println("reciente empieza (en caso de empate el más");
            System.out.println("joven de ellos comienza)");
            System.out.println("como jugar");
            System.out.println("Love Letter se juega en diferentes rondas.");
            System.out.println("Cada ronda representa un día. Al final de");
            System.out.println("cada ronda, la carta de un jugador llega a");
            System.out.println("la Princesa Annete, quien la leerá.");
            System.out.println("Cuando haya leído las suficientes cartas");
            System.out.println("de uno de los pretendientes, caerá");
            System.out.println("perdidamente enamorada, concediendo a");
            System.out.println("ese pretendiente el permiso para cortejarla.");
            System.out.println("Ese jugador ganará el corazón de la");
            System.out.println("princesa y la partida.");
            System.out.println("desar rollo");
            System.out.println("del juego");
            System.out.println("Durante tu turno, roba la carta superior");
            System.out.println("del mazo y añádela a tu mano. Entonces");
            System.out.println("elige una de las dos cartas y descártala");
            System.out.println("cara arriba delante tuya. Deberás aplicar el");
            System.out.println("efecto de la carta descartada, incluso si es");
            System.out.println("perjudicial para ti.");
            System.out.println("Consulta la página 15 para ver los efectos");
            System.out.println("de cada carta. De la misma manera si");
            System.out.println("tienes cualquier duda sobre situaciones");
            System.out.println("especiales con una carta allí encontrarás la");
            System.out.println("respuesta.");
            System.out.println("Las cartas descartadas permanecen delante");
            System.out.println("del jugador que las descarta. Colócalas");
            System.out.println("superpuestas de manera visible para que");
            System.out.println("quede claro el orden en que han sido");
            System.out.println("descartadas. Esto ayudara a los jugadores");
            System.out.println("a averiguar que cartas pueden tener en la");
            System.out.println("mano los demás.");
            System.out.println("Una vez es aplicado el efecto de la carta el");
            System.out.println("turno pasa al jugador a tu izquierda.");
            System.out.println("eliminado de la ronda");
            System.out.println("Si un jugador es eliminado de la ronda,");
            System.out.println("ese jugador descarta la carta en su mano");
            System.out.println("boca arriba, (sin aplicar su efecto) y deja de");
            System.out.println("jugar hasta la siguiente ronda.");
            System.out.println("hon r adez");
            System.out.println("Un jugador podría mentir al ser elegido");
            System.out.println("por el efecto de la Guardia, o no descartar");
            System.out.println("a la Condesa teniendo al rey o el príncipe");
            System.out.println("en la mano. Sugerimos por tanto que");
            System.out.println("no juegues con rufianes que se diviertan");
            System.out.println("haciendo trampas.");
            System.out.println("final de la ronda");
            System.out.println("Una ronda termina cuando el mazo de");
            System.out.println("robo es agotado al final de un turno,");
            System.out.println("la residencia real cierra al atardecer, la");
            System.out.println("persona más cercana a la princesa entrega");
            System.out.println("la carta de amor, y la princesa Annette se");
            System.out.println("retira a sus aposentos para leerla.");
            System.out.println("Aquellos jugadores que permanezcan en la");
            System.out.println("ronda revelan sus manos. El jugador con la");
            System.out.println("carta con el valor más alto gana la ronda.");
            System.out.println("En caso de empate el jugador que descartó");
            System.out.println("cartas por mayor valor gana.");
            System.out.println("La ronda termina también si todos los");
            System.out.println("jugadores menos uno son eliminados de la");
            System.out.println("ronda, en ese caso, el jugador que siga en");
            System.out.println("juego gana.");
            System.out.println("El ganador recibe una ficha de afecto.");
            System.out.println("Baraja las 16 cartas y comienza una nueva");
            System.out.println("ronda siguiendo las normas de preparación.");
            System.out.println("El ganador de la última ronda comienza,");
            System.out.println("pues la princesa hablará muy bien de él");
            System.out.println("durante el desayuno.");
            System.out.println("ganando el juego");
            System.out.println("Un jugador es declarado ganador tras");
            System.out.println("conseguir un número determinado de fichas");
            System.out.println("de afecto, según el número de jugadores.");
            System.out.println("•");
            System.out.println("2 jugadores");
            System.out.println("7 fichas");
            System.out.println("•");
            System.out.println("3 jugadores 5 fichas");
            System.out.println("•");
            System.out.println("4 jugadores");
            System.out.println("4 fichas");
            System.out.println("personajes");
            System.out.println("Los sucesos de este juego tienen lugar");
            System.out.println("entre “Courtier” y “Dominare”, otros dos");
            System.out.println("juegos de la línea Tempest. Esta es una");
            System.out.println("pequeña descripción de los personajes."); 
            System.out.println("8: pr incesa annette");
            System.out.println("Refrenada solo por la bisoñez");
            System.out.println("propia de su juventud, la Princesa");
            System.out.println("Annete es elegante, encantadora");
            System.out.println("y bella. Obviamente querrás que");
            System.out.println("la princesa lleve tu carta. Sin");
            System.out.println("embargo le avergüenza hablar de");
            System.out.println("sus intereses románticos y ante");
            System.out.println("cualquier dificultad arrojará tu");
            System.out.println("carta a la chimenea negando");
            System.out.println("su existencia.");
            System.out.println("Si descartas a la");
            System.out.println("Princesa, no importa");
            System.out.println("como o por que, ella ha arrojado tu carta a");
            System.out.println("la chimenea. Eres eliminado de la ronda.");
            System.out.println("7: condesa wilhelmina");
            System.out.println("Siempre al acecho de un hombre apuesto");
            System.out.println("o de un jugoso cotilleo, la edad y");
            System.out.println("el linaje de Wilhemina la convierte");
            System.out.println("en una de las amigas de Annete.");
            System.out.println("Pese a su gran influencia sobre la");
            System.out.println("princesa, tiende a esfumarse cuando");
            System.out.println("el Rey o el príncipe andan cerca.");
            System.out.println("A diferencia de otras cartas,");
            System.out.println("que sólo tienen efecto al ser");
            System.out.println("descartadas, el texto de la");
            System.out.println("Condesa se aplica mientras");
            System.out.println("está en tu mano y al ser");
            System.out.println("descartada no tiene efecto.");
            System.out.println("Si en algún momento tienes a la Condesa");
            System.out.println("y al Rey o al Príncipe en tu mano, estás");
            System.out.println("obligado a descartar a la condesa. No");
            System.out.println("tienes que revelar la otra carta de tu mano.");
            System.out.println("Por supuesto tú puedes descartar a la");
            System.out.println("Condesa incluso si no tienes a un miembro");
            System.out.println("de la familia real en tu mano. A la condesa");
            System.out.println("le encanta provocar intrigas...");
            System.out.println("6: rey arnaud iv");
            System.out.println("El indiscutido gobernante de");
            System.out.println("Tempest... de momento. Su papel en");
            System.out.println("el arresto de la reina Marianna");
            System.out.println("ha hecho que la relación con");
            System.out.println("su hija se haya enfriado.");
            System.out.println("Confía en pronto poder");
            System.out.println("ganarse su confianza.");
            System.out.println("Al descartar al rey");
            System.out.println("Arnaud IV, intercambia");
            System.out.println("la carta en tu mano por");
            System.out.println("la que tenga otro jugador");
            System.out.println("de tu elección. No puedes");
            System.out.println("cambiarla con un jugador");
            System.out.println("ya eliminado en la ronda");
            System.out.println("ni con uno protegido por la doncella. Si");
            System.out.println("todos los jugadores están protegidos por la");
            System.out.println("doncella la carta no tiene efecto.");
            System.out.println("5: pr incipe arnaud");
            System.out.println("Un tanto metomentodo. El");
            System.out.println("príncipe Arnaud no ha quedado");
            System.out.println("tan entristecido por el arresto");
            System.out.println("de su madre como uno");
            System.out.println("podría suponer. Puesto que");
            System.out.println("muchas mujeres se disputan");
            System.out.println("su atención, confía en que");
            System.out.println("haciendo de celestino ayudará");
            System.out.println("a su hermana a encontrar la");
            System.out.println("paz de los placeres banales.");
            System.out.println("Al descartar al príncipe");
            System.out.println("Arnaud, escoge un jugador");
            System.out.println("que todavía esté en la ronda");
            System.out.println("(incluido tú) Ese jugador descarta su");
            System.out.println("mano (sin aplicar el efecto) y roba una");
            System.out.println("nueva carta. Si el mazo se termina ese");
            System.out.println("jugador robará la carta que fue eliminada al");
            System.out.println("principio de la ronda");
            System.out.println("Si los demás jugadores están protegidos");
            System.out.println("por la doncella, debes elegirte a ti mismo.");
            System.out.println("4: la doncella susannah");
            System.out.println("Pocos confiarían a una doncella");
            System.out.println("una carta importante. Menos");
            System.out.println("aún comprenden la astucia de");
            System.out.println("Susannah, o su habilidad para");
            System.out.println("fingir ser una torpe doncella. Q ue");
            System.out.println("él confidente y fiel siervo de la");
            System.out.println("reina no fuera detenido tras su");
            System.out.println("arresto es buena prueba de su");
            System.out.println("inteligencia.");
            System.out.println("Al descartar a la doncella,");
            System.out.println("te haces inmune a los");
            System.out.println("efectos de las cartas de los");
            System.out.println("demás jugadores hasta que");
            System.out.println("comience tu siguiente turno. Si todos los");
            System.out.println("jugadores salvo el actual están protegidos");
            System.out.println("por Susannah, ese jugador deberá elegirse a");
            System.out.println("si mismo si le es posible.");
            System.out.println("3: baron talus");
            System.out.println("Heredero de una casa de alta alcurnia");
            System.out.println("cercana a la familia real, el");
            System.out.println("Barón Talus posee un porte");
            System.out.println("sereno y calmo que esconde a");
            System.out.println("un hombre acostumbrado a ser");
            System.out.println("obedecido. Sus sugerencias han");
            System.out.println("de ser tratadas como si vinieran");
            System.out.println("del mismísimo rey.");
            System.out.println("Al ser descartado elije a un");
            System.out.println("jugador que permanezca en");
            System.out.println("la ronda. Tú y ese jugador");
            System.out.println("comparáis en secreto");
            System.out.println("vuestras manos. Aquel con");
            System.out.println("una carta más baja es eliminado de la");
            System.out.println("ronda. En caso de empate no ocurre nada.");
            System.out.println("Si los demás jugadores están protegidos");
            System.out.println("por la doncella la carta no tiene efecto.");
            System.out.println("2: tomás el clér igo");
            System.out.println("Abierto, honesto e inspirador,");
            System.out.println("Tomás el clérigo siempre buscar");
            System.out.println("cualquier oportunidad para hacer");
            System.out.println("buenas acciones. Tras el arresto");
            System.out.println("de la reina, es habitual verlo");
            System.out.println("en palacio en papel de");
            System.out.println("confesor, consejero y amigo.");
            System.out.println("Al descartar al clérigo");
            System.out.println("puedes mirar la mano");
            System.out.println("de otro jugador. No la");
            System.out.println("muestres a los demás");
            System.out.println("jugadores.");
            System.out.println("1: odette la guardia");
            System.out.println("Encargada de velar por la seguridad");
            System.out.println("de la familia real, Odette cumple");
            System.out.println("sus ordenes con persistentencia y");
            System.out.println("diligentemente.... todo a pesar");
            System.out.println("de que se dice que su mentor");
            System.out.println("murió ahogado al huir del");
            System.out.println("arresto por su complicidad en la");
            System.out.println("traición de la reina.");
            System.out.println("Al descartar a la guardia,");
            System.out.println("elige un jugador y nombra una");
            System.out.println("carta (que no sea la Guardia) Si");
            System.out.println("ese jugador tiene esa carta, es");
            System.out.println("eliminado de la ronda. Si los");
            System.out.println("demás jugadores están protegidos por la");
            System.out.println("doncella la carta no tiene efecto.");
            System.out.println();
            System.out.println();
            System.out.println();
			main(args);
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
			else if(i<16 && i>=13)
			{
			System.out.print("Cartas fuera del maso:"+arrayDeck[iDeck]+"\t\t");		
            }
			else
			{
			System.out.println(arrayDeck[iDeck]);
			}
			arrayDeck[iDeck]=null;
			}

    } 
	  
      
		
	}
	