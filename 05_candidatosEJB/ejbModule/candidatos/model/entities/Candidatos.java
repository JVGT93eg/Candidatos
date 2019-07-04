package candidatos.model.entities;

public class Candidatos {
	
	private String provincia;
	private int candidato1;
	private int candidato2;
	private int candidato3;
	private int total;
	private double procentaje;
	

	public Candidatos() {
		
	}

	public Candidatos(String provincia, int candidato1, int candidato2, int candidato3) {
		super();
		this.provincia = provincia;
		this.candidato1 = candidato1;
		this.candidato2 = candidato2;
		this.candidato3 = candidato3;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCandidato1() {
		return candidato1;
	}

	public void setCandidato1(int candidato1) {
		this.candidato1 = candidato1;
	}

	public int getCandidato2() {
		return candidato2;
	}

	public void setCandidato2(int candidato2) {
		this.candidato2 = candidato2;
	}

	public int getCandidato3() {
		return candidato3;
	}

	public void setCandidato3(int candidato3) {
		this.candidato3 = candidato3;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public double getProcentaje() {
		return procentaje;
	}

	public void setProcentaje(double procentaje) {
		this.procentaje = procentaje;
	}
	

}
