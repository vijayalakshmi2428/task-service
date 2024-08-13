package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	List<Task> findByProjectId(Long projectId);
}
