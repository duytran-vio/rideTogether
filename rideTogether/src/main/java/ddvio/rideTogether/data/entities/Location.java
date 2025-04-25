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
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
public class Location extends AuditEntity<Integer> {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "startLocation")
    private List<Request> requests;
}