package manno;

import java.text.SimpleDateFormat; // Biblioteca responsável pela formatação da Data ou horário
import java.util.GregorianCalendar;
import java.util.TimeZone; // Biblioteca responsável por captar o horário local de determinada região

public class DesafioAlpha {

	public static void main(String[] args) {

	SimpleDateFormat brasilia = new SimpleDateFormat ("HH:mm:ss"); 
	brasilia.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
	System.out.println("Horário em Brasília: " + brasilia.format(GregorianCalendar.getInstance().getTime()));
		
	SimpleDateFormat london = new SimpleDateFormat ("HH:mm:ss");
	london.setTimeZone(TimeZone.getTimeZone("Europe/London"));
	System.out.println("Horário em Londres: " + london.format(GregorianCalendar.getInstance().getTime()));
	}
}