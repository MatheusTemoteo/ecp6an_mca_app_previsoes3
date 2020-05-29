package repository;

import javax.persistence.Persistence;

public class TesteTabelas {

		public static void main(String[] args) {
			Persistence.createEntityManagerFactory("usjtPU");
		}
}
