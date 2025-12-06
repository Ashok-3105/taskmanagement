package com.tasks.task_management_api.repository;
import com.tasks.task_management_api.model.Task;
import com.tasks.task_management_api.model.TaskPriority;
import com.tasks.task_management_api.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Find tasks by status
    List<Task> findByStatus(TaskStatus status);

    // Find tasks by priority
    List<Task> findByPriority(TaskPriority priority);

    // Find tasks by title containing keyword (case-insensitive)
    List<Task> findByTitleContainingIgnoreCase(String keyword);

    // Find tasks by status and priority
    List<Task> findByStatusAndPriority(TaskStatus status, TaskPriority priority);
}

