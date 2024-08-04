package com.course.hsa.service;

import com.course.hsa.controller.dto.TaskDto;
import com.course.hsa.domain.Task;
import com.course.hsa.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public void addTask(TaskDto taskDto) {
        var task = map(taskDto);
        taskRepository.save(task);
    }

    public List<TaskDto> getTasks() {
        return taskRepository.findAll().stream().map(this::map).toList();
    }

    private Task map(TaskDto taskDto) {
        var entity = new Task();
        entity.setName(taskDto.getName());
        entity.setUser(taskDto.getUser());
        return entity;
    }


    private TaskDto map(Task task) {
        return new TaskDto(task.getName(), task.getUser());
    }

}
