package pl.mazur.pawel.documentsmasterbe.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
@CrossOrigin // TODO move to config and remove
public class ApplicationDetailsController {

    @GetMapping("/footer")
    public String getFooterDetails(){
        return "Environment: Dev | Build Date: 2023-01-01 | Application Version: 1.2.1";
    }
}
