package edu.escuelaing.ieti.lab1.microservicio.service;


import edu.escuelaing.ieti.lab1.microservicio.data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskHashMap implements TaskService {
    private final HashMap<String,Task> taskHash= new HashMap<>();
    @Override
    public Task create(Task task) {
        return taskHash.put(task.getId(), task);
    }

    @Override
    public Task findById(String id) {
        return taskHash.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>(taskHash.values());
    }

    @Override
    public Boolean  deleteById(String id) {
        taskHash.remove(id);
        Boolean delete = !taskHash.containsKey(id);
        return delete;
    }

    @Override
    public Task update(Task task, String id) {
        return taskHash.put(id, task);
    }
}
