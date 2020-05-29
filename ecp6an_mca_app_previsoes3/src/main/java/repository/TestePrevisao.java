package repository;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Previsao;
import model.Semana;

public class TestePrevisao {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setDiaDaSemana("Sabado");
		manager.persist(s);
		Previsao p = new Previsao();
		
		p.setTemperaturaMin(15.0);
		p.setTemperaturaMax(28.0);
		p.setUmidadeRelAr(75.0);
		p.setLocalDate(LocalDate.now());
		p.setDescricao("Sabado previsto temperatura Max de 28 C e Min de 15 C, umidade do ar em 55%.");
		p.setLatitude(40.627094);
		p.setLongitude(-73.947355);
		p.setSemana(s);
		manager.persist(p);
		transaction.commit();
		JPAUtil.close();
	}
}
