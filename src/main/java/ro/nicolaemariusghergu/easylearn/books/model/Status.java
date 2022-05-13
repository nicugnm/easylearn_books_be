package ro.nicolaemariusghergu.easylearn.books.model;

import lombok.*;
import org.hibernate.Hibernate;
import ro.nicolaemariusghergu.easylearn.books.dao.AbstractEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "status")
@AttributeOverride(name = "id", column = @Column(name = "status_id"))
public class Status extends AbstractEntity {

    @Column(name = "status_type")
    private String statusType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Status status = (Status) o;
        return id != null && Objects.equals(id, status.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
