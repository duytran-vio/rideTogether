package ddvio.rideTogether.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "message")
@Getter
@Setter
@NoArgsConstructor
public class Message extends AuditEntity<Integer> {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ride_id")
    private Ride ride;

    @Column(name = "content")
    private Integer content;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}