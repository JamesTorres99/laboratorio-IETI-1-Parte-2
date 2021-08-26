package edu.escuelaing.ieti.lab1.microservicio.service;

import edu.escuelaing.ieti.lab1.microservicio.data.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    void deleteById( String id );

    Task update( Task task, String id );
}
