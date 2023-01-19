package pl.mazur.pawel.documentsmasterbe.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mazur.pawel.documentsmasterbe.service.DocumentService;

@RestController
@RequestMapping("/document")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;
    @PostMapping("/save")
    public void save(){
    }
    @GetMapping("findOne")
    public void findOne(){
    }
    @GetMapping("findAll")
    public void findAll(){
    }

    @GetMapping("delete")
    public void delete(){
    }
}
