package matheus.edu.service.impl;

import matheus.edu.controller.TutorController;
import matheus.edu.domain.model.Animal;
import matheus.edu.domain.model.Tutor;
import matheus.edu.domain.repository.AnimalRepository;
import matheus.edu.domain.repository.TutorRepository;
import matheus.edu.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;
    private final TutorRepository tutorRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository, TutorRepository tutorRepository) {
        this.animalRepository = animalRepository;
        this.tutorRepository = tutorRepository;
    }

    @Override
    public Animal findByid(Long id) {
        return animalRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Animal create(Animal animalToCreate) {
        if(animalToCreate.getId() != null && animalRepository.existsById(animalToCreate.getId())){
            throw new IllegalArgumentException("Esse ID de animal já existe");
        }
        if (animalToCreate.getTutor() == null || animalToCreate.getTutor().getId() == null) {
            throw new IllegalArgumentException("O tutor é obrigatório");
        }

        Tutor tutor = tutorRepository.findById(animalToCreate.getTutor().getId())
                .orElseThrow(() -> new NoSuchElementException("Tutor não encontrado"));

        animalToCreate.setTutor(tutor);
        return animalRepository.save(animalToCreate);
    }
}
