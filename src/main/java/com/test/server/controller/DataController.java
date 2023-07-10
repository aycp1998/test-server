package com.test.server.controller;

import com.test.server.dto.DataDTO;
import com.test.server.response.payload.GenericMessage;
import com.test.server.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public ResponseEntity<GenericMessage> getAllData() {
        return new ResponseEntity<>(dataService.getAllData(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericMessage> getDataById(@PathVariable Long id) {
        return new ResponseEntity<>(dataService.getDataById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericMessage> createData(@RequestBody DataDTO dataDTO) {
        return new ResponseEntity<>(dataService.createData(dataDTO), HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<GenericMessage> updateData(@RequestBody DataDTO dataDTO) {
        return new ResponseEntity<>(dataService.updateData(dataDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericMessage> deleteDataById(@PathVariable Long id) {
        return new ResponseEntity<>(dataService.deleteDataById(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<GenericMessage> deleteAllData() {
        return new ResponseEntity<>(dataService.deleteAllData(), HttpStatus.NO_CONTENT);
    }

}
