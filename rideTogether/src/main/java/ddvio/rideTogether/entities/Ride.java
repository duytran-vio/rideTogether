package ddvio.rideTogether.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "rides")
@Getter
@Setter
@NoArgsConstructor
public class Ride extends AuditEntity<Integer> {

    @OneToOne
    @JoinColumn(name = "driver_req_id")
    private Request driverRequest;

    @OneToOne
    @JoinColumn(name = "buddy_req_id")
    private Request buddyRequest;

    @ManyToOne
    @JoinColumn(name = "status")
    private RideStatus status;

    @OneToMany(mappedBy = "ride")
    private List<Message> messages;
}