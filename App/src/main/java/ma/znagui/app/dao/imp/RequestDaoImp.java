package ma.znagui.app.dao.imp;

import jakarta.persistence.EntityManager;
import ma.znagui.app.dao.RequestDao;
import ma.znagui.app.model.Request;
import ma.znagui.app.model.Status;

import java.util.List;

public class RequestDaoImp implements RequestDao {
    private EntityManager em;


    public Request createRequest(Request request) {
        em.persist(request);
        return request;
    }

    public void addStatusToRequest(int requestID, int statusID) {
        Request request = em.find(Request.class, requestID);
        Status status = em.find(Status.class, statusID);
        request.getStatuses().add(status);
        


    }

    public List<Request> getRequests() {
        return List.of();
    }

    public void updateRequestStatus(Request request, Status status) {

    }
}
