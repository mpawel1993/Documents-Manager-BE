package pl.mazur.pawel.documentsmasterbe.utils;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TimeMachine {

    public Instant getActualTime(){
        return Instant.now();
    }
}
