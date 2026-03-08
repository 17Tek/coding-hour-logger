package com.hamdi.codinghourlogger.service;

import com.hamdi.codinghourlogger.model.CodingSession;
import com.hamdi.codinghourlogger.repository.CodingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CodingSessionService
{

        private final CodingSessionRepository repository;

        @Autowired
        public CodingSessionService(CodingSessionRepository repository) {
            this.repository = repository;  // Spring passes it in here
        }

    public List<CodingSession> getAllSessions(){
        return repository.findAll();
    }

    public CodingSession createSession(CodingSession session){ //This takes in a coding session object(The one the controller received from the JSON
            return repository.save(session); // This tells the JPA to insert the session into the database
    }
}
