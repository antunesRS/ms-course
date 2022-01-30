package com.antunesRS.hrworker.resources;

import com.antunesRS.hrworker.entities.Worker;
import com.antunesRS.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> workers = workerRepository.findAll();
        return ResponseEntity.ok(workers);

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Worker findById(@PathVariable Long id){
        Worker worker = workerRepository.findById(id).get();
        return worker;

    }
}
