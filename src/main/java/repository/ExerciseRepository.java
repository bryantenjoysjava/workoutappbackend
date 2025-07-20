package repository;
import model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for interacting with Exercise entity database
 */
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
}
