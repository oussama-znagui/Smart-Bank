package ma.znagui.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "request")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Request implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private int id;

    private String project;
    private String pro;
    private double amount;

    private int duration;
    private double mountly;
    private String email;
    private String phone;
    private String civility;
    private String fistName;
    private String lastName;
    private String cin;
    private LocalDate birthDay;
    private double incomes;
    private Boolean currentCredits;
    @Transient
    private List<Status> statuses;
//    @OneToMany(mappedBy = "request")
//    private List<RequestStatus> requestStatus;






}
