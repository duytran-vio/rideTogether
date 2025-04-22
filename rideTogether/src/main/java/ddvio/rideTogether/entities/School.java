package ddvio.rideTogether.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "schools")
@Getter
@Setter
@NoArgsConstructor
public class School extends AuditEntity<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "short_name")
    private String shortName;

    @OneToMany(mappedBy = "school")
    private List<UserProfile> userProfiles;
}