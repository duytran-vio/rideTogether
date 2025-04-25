package ddvio.rideTogether.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ride_status")
@Getter
@Setter
@NoArgsConstructor
public class RideStatus extends AuditEntity<Integer> {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "status")
    private List<Request> requests;

    @OneToMany(mappedBy = "status")
    private List<Ride> rides;
}