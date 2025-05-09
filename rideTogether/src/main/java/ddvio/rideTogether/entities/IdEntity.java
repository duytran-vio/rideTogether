package ddvio.rideTogether.entities;

import java.io.Serializable;

import org.springframework.data.domain.Persistable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class IdEntity<P extends Serializable> implements Persistable<P> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private P id;

    @Transient
    @Override
    public boolean isNew () {
        return null == getId();
    }
}
