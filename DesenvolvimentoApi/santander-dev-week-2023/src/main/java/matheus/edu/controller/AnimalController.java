package matheus.edu.controller;

import matheus.edu.domain.model.Animal;
import matheus.edu.service.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("animais")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> findById(@PathVariable Long id){
        Animal animal = animalService.findByid(id);
        return ResponseEntity.ok(animal);
    }

    @PostMapping
    public ResponseEntity<Animal> create(@RequestBody Animal animalToCreate){
        Animal animalCreated = animalService.create(animalToCreate);
        //Para retornar o caminho de busca por id do novo animal criado
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(animalCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(animalCreated);
    }
}
