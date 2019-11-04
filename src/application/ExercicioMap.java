package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Urna;

public class ExercicioMap {

	public static void main(String[] args) {

		String path = "c:\\temp\\urnas.txt";
		List<Urna> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] vet = line.split(",");
				list.add(new Urna(vet[0],Integer.parseInt(vet[1])));
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

		Map<String, Integer> arquivo = new HashMap<>();
	/*	list.add(new Urna("Joao",5));
		list.add(new Urna("Maria",10));
		list.add(new Urna("Jose",7));
		list.add(new Urna("Joao",8));
		*/
		for (Urna c: list) {
			if (!arquivo.containsKey(c.getNome())) {
				arquivo.put(c.getNome(),c.getQtde());
			}else {
				int novaQtde = arquivo.get(c.getNome()) + c.getQtde();
				arquivo.put(c.getNome(), novaQtde);
			}
		}
		
		for (String key: arquivo.keySet()) {
			System.out.println(key +": "+ arquivo.get(key));
		}
		
	}

}
