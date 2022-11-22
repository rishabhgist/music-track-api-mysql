package com.jap.music.controller;

import com.jap.music.domain.Track;
import com.jap.music.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class TrackController {
    private TrackService trackService;
    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
    @GetMapping("/track")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(trackService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/track/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        return new ResponseEntity<>(trackService.getById(id), HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<?> save(@RequestBody Track track){
        return new ResponseEntity<>(trackService.save(track), HttpStatus.CREATED);
    }
}
