package repository;
import model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository for interacting with Workout entity database
 */
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    /**
     * custom query method for returning all workouts given user id
     */
    List<Workout> findByUserId(Long userId);
}
