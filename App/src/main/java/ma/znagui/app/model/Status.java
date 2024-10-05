package ma.znagui.app.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    @ManyToMany(mappedBy = "request_status")
    private List<Request> requests;

    public Status() {

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
