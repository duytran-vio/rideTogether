package ddvio.rideTogether.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "requests")
@Getter
@Setter
@NoArgsConstructor
public class Request extends AuditEntity<Integer> {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "startLoc")
    private Location startLocation;

    @Column(name = "toLoc")
    private String toLocation;

    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Column(name = "latest_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date latestStartTime;

    @ManyToOne
    @JoinColumn(name = "status")
    private RideStatus status;

    @OneToOne(mappedBy = "driverRequest")
    private Ride driverRide;

    @OneToOne(mappedBy = "buddyRequest")
    private Ride buddyRide;
}