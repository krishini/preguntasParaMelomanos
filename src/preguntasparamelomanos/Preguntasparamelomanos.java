package preguntasparamelomanos;

import javax.swing.*;

class Preguntasparamelomanos {

	public static void main(String[] args) {
		String floyd, crimson, bungle, sabbath, hermetica, kennedys, flema;
		int total;
		total = 0;
		
		//PRESENTACION
		JOptionPane.showMessageDialog(null, "Cual fue el primer disco de cada una de las siguientes bandas?","Juego de preguntas para melómanos",
										JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/BMO.gif")));
		
		//PINKN FLOYD
		floyd = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\nA - The Wall\nB - The Dark side of the moon\nC - The Piper at the gates of the Dawn\nD - The Final Cut\n\nEscribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Pink Floyd",
				JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(Preguntasparamelomanos.class.getResource("/img/sydbarr.jpeg")), null, null));
		
		if(floyd.equalsIgnoreCase("c")) {
			JOptionPane.showMessageDialog(null, "Respuesta correcta!!!\n\nSyd Barrett esta muy feliz");
			total++;
			} 
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta\nEl primer disco de Floyd es The Piper at the gates of the Dawn y salió en 1967");
		}
		
		//KING CRIMSON
		crimson = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Discipline\n"+
				"B - In the court of the Crimson King\n"+
				"C - Red\n"+
				"D - Starless and Bible Black\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"King Crimson",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/kingcrimson.jpeg")), null, null));
		
		if (crimson.equalsIgnoreCase("b")) {
			JOptionPane.showMessageDialog(null, "Bien!");
			total++;
			}
		else {
			JOptionPane.showMessageDialog(null, "Noooo...\nLa respuesta era In the Court of the Crimson King (1969)");
		}
		
		//MR BUNGLE
		bungle = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Disco Volante\n"+
				"B - California\n"+
				"C - Mr Bungle\n"+
				"D - The Raging Wrath of the easter Bunny\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Mr Bungle",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/mrbungle.jpeg")), null, null));
		
		if (bungle.equalsIgnoreCase("d")) {
			JOptionPane.showMessageDialog(null, "Exacto!\nMike Patton esta orgulloso");
			total++;}
		else {
			JOptionPane.showMessageDialog(null, "Incorrecto. El primer disco de Mr Bungle fue The Raging Wrath Of The Easter Bunny y salió en 1986");
		}	
		
		//BLACK SABBATH
		sabbath = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Paranoid\n"+
				"B - Masters of reality\n"+
				"C - Sabotage\n"+
				"D - Black Sabbath\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Black Sabbath",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/blacksab.jpeg")), null, null));
		
		if (sabbath.equalsIgnoreCase("d")) {
			JOptionPane.showMessageDialog(null, "Cooooorrecto!");
			total++;}
		else {
			JOptionPane.showMessageDialog(null, "Esta no era tan dificil:\nBlack Sabbath - Black Sabbath (1970)");
		}
		
		//HERMETICA
		hermetica = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Victimas del vaciamiento\n"+
				"B - Hermética\n"+
				"C - Acido argentino\n"+
				"D - En Vivo 1993\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Hermetica",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/iorio.jpeg")), null, null));
		
		if (hermetica.equalsIgnoreCase("b")) {
			JOptionPane.showMessageDialog(null, "Muy bien!!");
			total++;}
		else {
			JOptionPane.showMessageDialog(null, "No.\nEl primer disco se llamó \"Hermética\" (1989)");
		}
		
		//DEAD KENNEDYS
		kennedys = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Bedtime for Democracy\n"+
				"B - Plastic Surgery Disasters\n"+
				"C - Fresh Fruit for Rotting Vegetables\n"+
				"D - Kill the poor\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Dead Kennedys",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/deadk.jpeg")), null, null));
		
		if (kennedys.equalsIgnoreCase("c")) {
			JOptionPane.showMessageDialog(null, "Excelente ! !");
			total++;}
		else {
			JOptionPane.showMessageDialog(null, "Error, era: \"Fresh Fruit for Rotting Vegetables\" (1980)");
		}
		
		//FLEMA
		flema = (String)(JOptionPane.showInputDialog(null, "Opciones de ayuda:\n\n"+
				"A - Corriendo con Satan\n"+
				"B - Caretofobia\n"+
				"C - Y aun yo te recuerdo\n"+
				"D - Resaka\n\n"+
				"Escribi A, B, C o D para ingresar la opción que consideras correcta", 
				"Flema",JOptionPane.DEFAULT_OPTION, new ImageIcon(Preguntasparamelomanos.class.getResource("/img/ricki.jpeg")), null, null));
		
		if (flema.equalsIgnoreCase("a")) {
			JOptionPane.showMessageDialog(null, "Te felicito, he quedado sorprendida");
			total++;}
		else {
			JOptionPane.showMessageDialog(null, "Corriendo con Satan era la respuesta correcta.\nUn disco que salió en 1989");
		}
		
		//CONTEO DE TOTALES
		if (total >= 5) {
			JOptionPane.showMessageDialog(null, "Tuviste un total de "+total+" respuestas correctas\nSi no hiciste trampa buscando en internet estoy perpleja. Recomendame música","Felicitaciones!!!!!!!!!!!!!!!!",
					JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/waynesworldchampion.gif")));
		}
		else if (total>=3) {
			JOptionPane.showMessageDialog(null, "Tuviste un total de "+total+" respuestas correctas\nDavid Bowie desde el mas alla piensa que aun tenes mucha música por escuchar","Ups",
					JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/Bowiedicequetefaltamusica.gif")));
		}
		else {
			if(total == 2) {JOptionPane.showMessageDialog(null, "Tuviste "+total+" respuestas correctas\nMike Patton esta algo descepcionado","Poco aceptable",
					JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/pattontriste.jpeg")));}
			else if (total == 1) {JOptionPane.showMessageDialog(null, "Tuviste solo"+total+" respuesta correcta\nMike Patton esta algo descepcionado","Ouch",
					JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/pattontriste.jpeg")));}
			else {JOptionPane.showMessageDialog(null, "Tuviste "+total+" respuestas correctas\nMike Patton esta algo descepcionado","Buuuuuuuuu",
					JOptionPane.DEFAULT_OPTION,new ImageIcon(Preguntasparamelomanos.class.getResource("/img/pattontriste.jpeg")));}
			}
						
}
}