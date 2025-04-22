package ddvio.rideTogether.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@NoArgsConstructor
public class UserProfile extends AuditEntity<Integer> {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "avatar_id")
    private Image avatar;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @Column(name = "ride_number")
    private Integer rideNumber;

    @Column(name = "distance")
    private Integer distance;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "rate_num")
    private Integer rateNum;
}