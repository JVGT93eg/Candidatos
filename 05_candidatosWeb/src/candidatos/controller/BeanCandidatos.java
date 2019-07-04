package candidatos.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import candidatos.model.ManagerCandidatos;
import candidatos.model.entities.Candidatos;

@Named
@SessionScoped
public class BeanCandidatos implements Serializable{

	private static final long serialVersionUID= 1L;
	
	private String provincia;
	private int candidato1;
	private int candidato2;
	private int candidato3;
	private List<Candidatos> candidatos; 
	private int total;
	private double porcentaje;
	private double cand1, cand2, cand3, totalvotos, totalP;
	@EJB
	private ManagerCandidatos managerCandidatos;
	
	public void actionAgregarCandidatos() {
		candidatos = managerCandidatos.registrarCandidaos(provincia, candidato1, candidato2, candidato3);
	}
	
	public void actionNuevaLista() {
		candidatos= managerCandidatos.Nuevo(candidatos);
		
		cand1 = managerCandidatos.totaCan1(candidatos);
		cand2=managerCandidatos.totaCan2(candidatos);
		cand3= managerCandidatos.totaCan3(candidatos);
		totalvotos= managerCandidatos.totalVotos(candidatos);
		totalP=managerCandidatos.totaP(candidatos);
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

	public List<Candidatos> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidatos> candidatos) {
		this.candidatos = candidatos;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getCand1() {
		return cand1;
	}

	public void setCand1(double cand1) {
		this.cand1 = cand1;
	}

	public double getCand2() {
		return cand2;
	}

	public void setCand2(double cand2) {
		this.cand2 = cand2;
	}

	public double getCand3() {
		return cand3;
	}

	public void setCand3(double cand3) {
		this.cand3 = cand3;
	}

	public double getTotalvotos() {
		return totalvotos;
	}

	public void setTotalvotos(double totalvotos) {
		this.totalvotos = totalvotos;
	}

	public double getTotalP() {
		return totalP;
	}

	public void setTotalP(double totalP) {
		this.totalP = totalP;
	}
	
	
}
