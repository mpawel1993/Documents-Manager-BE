package pl.mazur.pawel.documentsmasterbe.service;

import org.springframework.stereotype.Service;

@Service
public class ApplicationDetailsService {

    public String generateApplicationDetails() {
        return "Environment: Dev | Build Date: 2023-01-01 | Application Version: 1.2.1";
    }
}
