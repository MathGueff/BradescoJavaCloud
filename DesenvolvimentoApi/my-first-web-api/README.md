## API REST em Java

A anotação @RestController indica que essa classe é um controller do Spring que retorna diretamente dados (geralmente em JSON) nas respostas HTTP.

Se um método for um GET, utilizamos @GetMapping("{rota}")
Como @GetMapping("usuarios")

* GetMapping
* PostMapping
* PutMapping
* DeleteMapping

````java
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<Usuario> getUsers() {
        return repository.listAll();
    }

    @GetMapping("/usuarios/{username}")
    public Usuario getByUserName(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
}
````