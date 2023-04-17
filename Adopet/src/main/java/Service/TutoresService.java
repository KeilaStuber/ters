package Service;

import Entity.Tutores;
import Repository.TutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutoresService {
    @Autowired
    TutoresRepository tutoresRepository;

    public Tutores save(Tutores tutores){
        return this.tutoresRepository.save(tutores);
    }
}
