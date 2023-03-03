package aula2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class CarrinhoService implements CommandLineRunner {
    @Autowired
    public CarrinhoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CarrinhoService.class, args);
    }

    @Override
    public void run(String... args) {
        Carrinho produto1 = new Carrinho(1, "Nutella", 5, 36);
        repository.save(produto1);

        Carrinho produto2 = new Carrinho(2, "iPhone 12s", 10, 4000);
        repository.save(produto2);

        Carrinho produto3 = new Carrinho(3, "Toblerone", 5, 25);
        repository.save(produto3);

        Carrinho produto4 = new Carrinho(4, "RTX 3070 TI", 2, 4600);
        repository.save(produto4);

        repository.findAll().forEach(it -> System.out.println(it.toString()));
    }
}