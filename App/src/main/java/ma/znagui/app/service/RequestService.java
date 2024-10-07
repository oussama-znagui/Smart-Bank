package ma.znagui.app.service;

import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.Status;

import java.util.List;

public interface RequestService {
    public Request createRequest(Request request);
    public void addStatusToRequest(int requestID, int statusID);
    public List<Request> getRequests();
    public void updateRequestStatus(Request request, Status status);
    public boolean checkCreditValues(Request request);
}
