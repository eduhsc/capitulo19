package application;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgHashCode {

	public static void main(String[] args) {
		//Generics, Set, Map..
		List<Integer> lista = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		
		for (int i=0; i<=100000; i++) {
			lista.add(i);
		}
		
		Integer cont = 100000;
		int i = 0;
		Date inicio = new Date(System.currentTimeMillis());
		while (i < lista.size()) {
			System.out.println(lista.get(i));
			if (lista.get(i).hashCode() == cont.hashCode()) {
				Date fim = new Date(System.currentTimeMillis());
				System.out.println("Início - " + sdf.format(inicio));
				System.out.print("Fim - "+ sdf.format(fim));
				System.out.println();
				i = 100000;
				
			}
			i++;
		}
			
	}

}
