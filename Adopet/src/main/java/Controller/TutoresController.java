package Controller;

import Entity.Tutores;
import Service.TutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/tutores")
public class TutoresController {
    @Autowired
    TutoresService tutoresService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tutores cadastrarTutores(@RequestBody Tutores tutores){
        return tutoresService.save(tutores);
    }

}
