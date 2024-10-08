package ma.znagui.app.dao.imp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import ma.znagui.app.dao.RequestDao;
import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.RequestStatus;
import ma.znagui.app.entities.Status;
import ma.znagui.app.config.EntityManagerFactorySingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;



public class RequestDaoImp implements RequestDao {
    EntityManagerFactory emf = EntityManagerFactorySingleton.getEmf();



    public Request createRequest(Request request) {
    EntityManager entityManager = emf.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(request);
            transaction.commit();
            entityManager.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

        return request;
    }

    public void addStatusToRequest(int requestID, int statusID) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Request request = entityManager.find(Request.class, requestID);
            Status status = entityManager.find(Status.class, statusID);
            RequestStatus requestStatus = new RequestStatus();
            requestStatus.setStatus(status);
            requestStatus.setRequest(request);
            LocalDateTime now = LocalDateTime.now();

            requestStatus.setDate(now);
            entityManager.persist(requestStatus);
            transaction.commit();
            entityManager.close();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }




    }

    public List<Request> getRequests() {
        EntityManager entityManager = emf.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            List requests = entityManager.createQuery("SELECT r FROM Request r JOIN FETCH r.requestStatus rs JOIN rs.status s").getResultList();
            transaction.commit();
            entityManager.close();
            return requests;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void updateRequestStatus(Request request, Status status) {

    }
}
