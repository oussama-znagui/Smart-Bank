package ma.znagui.app.dao.imp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import ma.znagui.app.dao.RequestDao;
import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.RequestStatus;
import ma.znagui.app.entities.Status;
import ma.znagui.app.config.EntityManagerFactorySingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
            System.out.println("fromm dao " + request);
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
        List<Request> requests = new ArrayList<>();
        EntityTransaction transaction = entityManager.getTransaction();

        try {

            transaction.begin();
            System.out.println("ma requeeeeeeeete");
            TypedQuery<Request> query = entityManager.createQuery("SELECT r FROM Request r", Request.class);

            requests = query.getResultList();

            for (Request req : requests) {

                System.out.println(req);




            }
            transaction.commit();
            entityManager.close();

        }catch (Exception e) {
            if(transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException(" requests found" + e.getMessage());
        }finally {

            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }



        }

        return requests;



    }

    public List<RequestStatus> getRequestStatusByID(int requestID) {
        EntityManager em = emf.createEntityManager();
        List<RequestStatus> requestStatuses = new ArrayList<>();
        EntityTransaction transaction = em.getTransaction();
        try{

            transaction.begin();
            TypedQuery<RequestStatus> query = em.createQuery("SELECT rs FROM RequestStatus rs JOIN FETCH rs.status WHERE rs.request.id = " + requestID, RequestStatus.class);
            requestStatuses = query.getResultList();
            System.out.println(requestStatuses);
            transaction.commit();
        }catch (Exception e) {

            if(transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();

        }finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return requestStatuses;

    }

    public void updateRequestStatus(Request request, Status status) {

    }
}
