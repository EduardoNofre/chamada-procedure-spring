package br.com.atributoaddpris.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
	
	public static String formataDateAtual() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		return LocalDateTime.now().format(formatter);
		
	}
}
