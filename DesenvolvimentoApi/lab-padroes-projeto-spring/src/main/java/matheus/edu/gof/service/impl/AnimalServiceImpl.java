package matheus.edu.gof.service.impl;

import matheus.edu.gof.model.Animal;
import matheus.edu.gof.model.AnimalRepository;
import matheus.edu.gof.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public Iterable<Animal> buscarTodos() {
        return animalRepository.findAll();
    }

    @Override
    public Animal buscarPorId(Long id) {
        Optional<Animal> animalById = animalRepository.findById(id);
        return animalById.get();
    }

    @Override
    public void inserir(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public void atualizar(Long id, Animal animal) {
        Optional<Animal> animalExists = animalRepository.findById(id);
        if(animalExists.isPresent())
            animalRepository.save(animal);
    }

    @Override
    public void deletar(Long id) {
        animalRepository.deleteById(id);
    }
}
