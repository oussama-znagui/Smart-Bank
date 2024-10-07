package ma.znagui.app.dao.imp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import ma.znagui.app.dao.RequestDao;
import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.Status;
import ma.znagui.app.config.EntityManagerFactorySingleton;

import java.util.List;

import static ma.znagui.app.config.EntityManagerFactorySingleton.getEntityManagerFactory;

public class RequestDaoImp implements RequestDao {
    EntityManager entityManager = getEntityManagerFactory().createEntityManager();



    public Request createRequest(Request request) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(request);
        transaction.commit();

        return request;
    }

    public void addStatusToRequest(int requestID, int statusID) {
//        Request request = em.find(Request.class, requestID);
//        Status status = em.find(Status.class, statusID);
//        request.getStatuses().add(status);
        


    }

    public List<Request> getRequests() {
        return List.of();
    }

    public void updateRequestStatus(Request request, Status status) {

    }
}
