package candidatos.model;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

import candidatos.model.entities.Candidatos;

@Stateless
@LocalBean
public class ManagerCandidatos {

	List<Candidatos> lista = new ArrayList<Candidatos>();
	List<Candidatos> nuevo = new ArrayList<Candidatos>();
	double total;
	double suma = 0;
	double porcentaje;
	double cand1, cand2, cand3, totalvotos, totalP;

	public List<Candidatos> registrarCandidaos(String provincia, int candidato1, int candidato2, int candidato3) {
		Candidatos candidato = new Candidatos();
		candidato.setProvincia(provincia);
		candidato.setCandidato1(candidato1);
		candidato.setCandidato2(candidato2);
		candidato.setCandidato3(candidato3);
		candidato.setTotal(candidato1 + candidato2 + candidato3);
		candidato.setProcentaje(0.0);

		lista.add(candidato);
		return lista;
	}

	public List<Candidatos> Nuevo(List<Candidatos> canditos) {

		for (Candidatos candidatos : canditos) {
			suma = candidatos.getTotal() + suma;
		}

		for (Candidatos candidatos : canditos) {

			if (candidatos.getProvincia().equals("Carchi")) {
				porcentaje = (candidatos.getTotal() * 100) / suma;
				candidatos.setProvincia(candidatos.getProvincia());
				candidatos.setCandidato1(candidatos.getCandidato1());
				candidatos.setCandidato2(candidatos.getCandidato2());
				candidatos.setCandidato3(candidatos.getCandidato3());
				candidatos.setTotal(candidatos.getTotal());
				candidatos.setProcentaje(porcentaje);
				nuevo.add(candidatos);

			}
			if (candidatos.getProvincia().equals("Imbabura")) {
				porcentaje = (candidatos.getTotal() * 100) / suma;
				candidatos.setProvincia(candidatos.getProvincia());
				candidatos.setCandidato1(candidatos.getCandidato1());
				candidatos.setCandidato2(candidatos.getCandidato2());
				candidatos.setCandidato3(candidatos.getCandidato3());
				candidatos.setTotal(candidatos.getTotal());
				candidatos.setProcentaje(porcentaje);
				nuevo.add(candidatos);

			}
			if (candidatos.getProvincia().equals("Pichincha")) {
				porcentaje = (candidatos.getTotal() * 100) / suma;
				candidatos.setProvincia(candidatos.getProvincia());
				candidatos.setCandidato1(candidatos.getCandidato1());
				candidatos.setCandidato2(candidatos.getCandidato2());
				candidatos.setCandidato3(candidatos.getCandidato3());
				candidatos.setTotal(candidatos.getTotal());
				candidatos.setProcentaje(porcentaje);
				nuevo.add(candidatos);
			}

		}
		return nuevo;
	}

	public double totaCan1(List<Candidatos> candidatos) {

		for (Candidatos candidatos2 : candidatos) {
			cand1 = candidatos2.getCandidato1() + cand1;
		}
		return cand1;
	}

	public double totaCan2(List<Candidatos> candidatos) {

		for (Candidatos candidatos2 : candidatos) {
			cand2 = candidatos2.getCandidato2() + cand2;
		}
		return cand2;
	}

	public double totaCan3(List<Candidatos> candidatos) {

		for (Candidatos candidatos2 : candidatos) {
			cand3 = candidatos2.getCandidato3() + cand3;
		}
		return cand3;
	}

	public double totaP(List<Candidatos> candidatos) {

		for (Candidatos candidatos2 : candidatos) {
			totalP = candidatos2.getProcentaje() + totalP;
		}
		return totalP;
	}

	public double totalVotos(List<Candidatos> candidatos) {

		for (Candidatos candidatos2 : candidatos) {
			totalvotos = candidatos2.getTotal() + totalvotos;
		}
		return totalvotos;
	}

}
