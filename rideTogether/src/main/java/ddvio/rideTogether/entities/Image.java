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
@Table(name = "images")
@Getter
@Setter
@NoArgsConstructor
public class Image extends AuditEntity<Integer> {

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "avatar")
    private List<UserProfile> userProfiles;
}