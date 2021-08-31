package ir.maktab56.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("homeWork12");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}
