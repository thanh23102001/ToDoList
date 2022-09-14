package com.example.todolist.repositories;
import com.example.todolist.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
