package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ExercicioSet {

	public static void main(String[] args) {
		// Exercício proposto Set

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students for course A: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			id = sc.nextInt();
			a.add(id);
		}
		
		System.out.print("How many students for course B: ");
	    n = sc.nextInt();
		for (int i=0; i<n; i++) {
			id = sc.nextInt();
			b.add(id);
		}
		
		System.out.print("How many students for course C: ");
	    n = sc.nextInt();
		for (int i=0; i<n; i++) {
			id = sc.nextInt();
			c.add(id);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: "+ total.size());		
		
		sc.close();
	}

}
