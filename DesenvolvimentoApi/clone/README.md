- @Component
- @Bean
- @Configuration
- @Scope("prototype")

@Component -> Define que pode ser injetado com @AutoWired
@Bean -> Define como deve ser injetado com @AutoWired
@Configuration -> Define que terá @Bean para configurar

@Value -> Pega valores do properties

```
@Value('nome:Default');
String nome;

```

@Entity -> usado para banco de dados (quando usado, a classe precisa conter um @Id para poder se tornar um Entity)

```java
    @Entity
    @Table(name = "tab_user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private Integer id;
        @Column(length = 50, nullable = false)
        private String name;
        @Column(length = 20, nullable = false)
        private String username;
        @Column(length = 100, nullable = false)
        private String password;
    }
``` 