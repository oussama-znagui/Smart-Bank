package ma.znagui.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestStatus implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="request_id", nullable=false)
    private Request request;

    @ManyToOne
    @JoinColumn(name="status_id", nullable=false)
    private Status status;


    private LocalDateTime date;

    public void setId(int id) {
        this.id = id;
    }
    public void setRequest(Request request) {
        this.request = request;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    public int getId() {
        return id;
    }
    public Request getRequest() {
        return request;
    }
    public Status getStatus() {
        return status;
    }
    public LocalDateTime getDate() {
        return date;
    }

}
