package matheus.edu.gof.controller;

import matheus.edu.gof.model.Animal;
import matheus.edu.gof.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animais")
public class AnimalRestController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<Iterable<Animal>> buscarTodos() {
        return ResponseEntity.ok(animalService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(animalService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Animal> inserir(@RequestBody Animal animal){
        animalService.inserir(animal);
        return ResponseEntity.ok(animal);
    }

    @PutMapping
    public ResponseEntity<Animal> alterar(@PathVariable Long id, @RequestBody Animal animal){
        animalService.atualizar(id, animal);
        return ResponseEntity.ok(animal);
    }

    @DeleteMapping
    public ResponseEntity<String> remover(@PathVariable Long id){
        animalService.deletar(id);
        return ResponseEntity.ok("ok");
    }
}
