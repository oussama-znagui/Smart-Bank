package ma.znagui.app.dao;

import ma.znagui.app.entities.Request;
import ma.znagui.app.entities.Status;

import java.util.List;

public interface RequestDao {
    public Request createRequest(Request request);
    public void addStatusToRequest(int requestID, int statusID);
    public List<Request> getRequests();
    public void updateRequestStatus(Request request, Status status);
}
