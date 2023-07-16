package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate  dataHoje = LocalDate.now();
		
		System.out.println(dataHoje);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		
		System.out.println(dataHoje.format(formatador));

	}

}
