package ma.znagui.app.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactorySingleton {
    private static EntityManagerFactory emf;


    private EntityManagerFactorySingleton() {

    }

    static {
        if (emf == null) {

            emf = Persistence.createEntityManagerFactory("bankPU");
        }

    }


    public static void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
            emf = null;
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
