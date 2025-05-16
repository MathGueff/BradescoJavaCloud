package matheus.edu.gof.service;

import matheus.edu.gof.model.Animal;

public interface AnimalService {
    Iterable<Animal> buscarTodos();

    Animal buscarPorId(Long id);

    void inserir(Animal animal);

    void atualizar(Long id, Animal animal);

    void deletar(Long id);
}
