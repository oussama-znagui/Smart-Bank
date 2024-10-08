package ma.znagui.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    @OneToMany(mappedBy = "status")
    private Set<RequestStatus> requestStatus;

    public void setId(int id) {
        this.id = id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setRequestStatus(Set<RequestStatus> requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }
    public Set<RequestStatus> getRequestStatus() {
        return requestStatus;
    }
}
