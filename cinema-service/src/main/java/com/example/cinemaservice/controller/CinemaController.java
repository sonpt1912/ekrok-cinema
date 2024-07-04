package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.Cinema;
import com.example.cinemaservice.service.CinemaService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
@EnableWrapResponse
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @PostMapping("/create-cinema")
    public ResponseEntity createCinema(@RequestBody Cinema cinema, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-cinema")
    public ResponseEntity updateCinema(@RequestBody Cinema cinema, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/get-cinema-by-condition")
    public ResponseEntity getAllByCondition(@RequestBody Cinema cinema, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
