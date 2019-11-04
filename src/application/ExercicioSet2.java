package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;
import entities.Curso;


public class ExercicioSet2 {

	public static void main(String[] args) {
		// Exercício proposto Set

		Curso a = new Curso();
		Curso b = new Curso();
		//Curso c = new Curso();
		//Aluno aluno = new Aluno();
		//aluno.setNumero(1);
		//a.setDesc("Curso A");
		//a.addAluno(aluno);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students for course A: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a1 = sc.nextInt();
			Aluno aluno = new Aluno(a1);
			a.addAlunos(aluno);
		}
		
		System.out.print("How many students for course B: ");
	    n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int b1 = sc.nextInt();
			Aluno aluno = new Aluno(b1);
			b.addAlunos(aluno);
		}
		
/*		System.out.print("How many students for course C: ");
	    n = sc.nextInt();
		for (int i=0; i<n; i++) {
			id = sc.nextInt();
			c.add(id);
		}
*/		
		Set<Integer> total = new HashSet<>();
		for (Aluno x: a.getAlunos()) {
		total.add(x.getNumero());
		}
		for (Aluno x: b.getAlunos()) {
			total.add(x.getNumero());
			}
		System.out.println("Total students: "+ total.size());		
		
		sc.close();
	
	}

}
