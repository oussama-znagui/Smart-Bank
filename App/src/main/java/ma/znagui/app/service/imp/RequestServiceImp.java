package ma.znagui.app.service.imp;

import ma.znagui.app.dao.RequestDao;
import ma.znagui.app.dao.imp.RequestDaoImp;
import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.RequestStatus;
import ma.znagui.app.entities.Status;
import ma.znagui.app.service.RequestService;

import java.util.ArrayList;
import java.util.List;

public class RequestServiceImp implements RequestService {
    private  RequestDao dao = new RequestDaoImp();
    public Request createRequest(Request request) {
        if (checkCreditValues(request)) {
            Request createdRequest = dao.createRequest(request);
            addStatusToRequest(createdRequest.getId(),3);
            return request;
        }

        return null;
    }

    public void addStatusToRequest(int requestID, int statusID) {
        dao.addStatusToRequest(requestID, statusID);

    }

    public List<Request> getRequests() {
try {
    List<Request> rqs =  dao.getRequests();
   rqs.forEach(rq -> {
       List<RequestStatus> rss = dao.getRequestStatusByID(rq.getId());

       List<Status> statuses = new ArrayList<>();
       rss.forEach(sr -> {


           statuses.add(sr.getStatus());
       });
       rq.setStatuses(statuses);

   });
    System.out.println("from serviiiiiice " + rqs);
    return rqs;

}catch (Exception e) {
    throw new RuntimeException(" requests found aaa" + dao.getRequests());
}

    }

    public void updateRequestStatus(Request request, Status status) {

    }

    public boolean checkCreditValues(Request request) {
        double amount = request.getAmount();
        int duration = request.getDuration();
        double monthly = request.getMountly();

        double a1 = amount * (0.1 / 12);
        double a2 = (1 + (0.1 / 12));
        double a2pow = 1 - Math.pow(a2, -duration);


        double mVal = a1 / a2pow;

      if (monthly == mVal) {

          return true;


      }else {
          return false;
      }

    }

    public List<RequestStatus> getRequestStatusByID(int requestID) {
        return dao.getRequestStatusByID(requestID);
    }
}
