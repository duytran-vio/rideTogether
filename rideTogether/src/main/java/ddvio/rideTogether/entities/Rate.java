package ddvio.rideTogether.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rate")
@Getter
@Setter
@NoArgsConstructor
public class Rate extends AuditEntity<Integer> {

    @Column(name = "rate")
    private Integer rate;

    @Column(name = "feedback")
    private String feedback;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}