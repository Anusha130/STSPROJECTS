package com.teluguhub.day1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teluguhub.day1.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
