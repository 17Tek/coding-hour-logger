package com.hamdi.codinghourlogger.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CodingSessionRepository extends JpaRepository<CodingSession, Long>
{
    //Find sessions after a certain time
    List<CodingSession> findCodingSessionByHoursSpentCodingGreaterThan(double hoursSpentCoding);

    List<CodingSession> findByProjectWorkedOnIgnoreCase(String projectWorkedOn);

    List<CodingSession> findByDateBetween(LocalDateTime date, LocalDateTime date2);
}
