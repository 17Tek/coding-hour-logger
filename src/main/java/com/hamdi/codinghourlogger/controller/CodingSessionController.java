package com.hamdi.codinghourlogger.controller;

import com.hamdi.codinghourlogger.model.CodingSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class Controller
{

    @Autowired
    Serv
    @GetMapping
    public List<CodingSession> getAllSessions() {
        return List.of(new CodingSession());
    }
}
