package ward;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Sol {

	public static void main(String[] args) {
		
  clinic c=new clinic();
c.setHospitleid(2);
c.setHospitlename("def");

EntityManagerFactory emf =Persistence.createEntityManagerFactory("hospitle");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
et.begin();
em.persist(c);
et.commit();






	}

}
