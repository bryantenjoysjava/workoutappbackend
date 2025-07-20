package repository;
import model.SetDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for interacting with SetDetail entity database
 */

public interface SetDetailRepository extends JpaRepository<SetDetail, Long> {
}
