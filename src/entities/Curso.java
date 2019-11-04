package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Comparable<Curso>{

	private String desc;
	private List<Aluno> alunos = new ArrayList<>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		return true;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void addAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public int compareTo(Curso other) {
		return 0;
	}
}
