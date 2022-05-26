package ro.nicolaemariusghergu.easylearn.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.nicolaemariusghergu.easylearn.books.model.entities.Status;

@Transactional
@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
}
