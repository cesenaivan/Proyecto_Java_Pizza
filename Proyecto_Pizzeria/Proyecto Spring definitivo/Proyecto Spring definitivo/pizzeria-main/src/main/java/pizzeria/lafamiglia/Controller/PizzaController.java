package pizzeria.lafamiglia.Controller;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import pizzeria.lafamiglia.*;

@RestController
// @CrossOrigin(origins = "*")

public class PizzaController {
    ArrayList<Pizza> pizzas;

    public PizzaController() {
        pizzas = new ArrayList<Pizza>();
        // Añado valores por defecto
        Pizza margarita = new Pizza("Margarita Vegetal", false, false, false, 8, "Pizza unica",
                new String[] { "Salsa tomate", "Espinacas", "Mozzarela" },
                "https://i.postimg.cc/4xj4xmKS/margarita.jpg");

        Pizza carbonara = new Pizza("Pizza Carbonara", true, true, false, 6, "Realmente Exquisita",
                new String[] { "Salsa Carbonara", "Bacon", "Huevo" },
                "https://i.postimg.cc/DyVcLc9v/carbonara.jpg%22");

        Pizza pepperoni = new Pizza("Pizza Pepperoni", false, false, false, 3, "Realmente Exquisita",
                new String[] { "Mozzarella", "Tomate", "Pepperoni" },
                "https://i.postimg.cc/y81YbwML/pepperoni.jpg%22");

        Pizza suprema = new Pizza("Pizza Suprema", false, false, true, 12, "Realmente Exquisita",
                new String[] { "Pollo", "Mozzarella", "Cebolla", "Salsa barbacoa" },
                "https://i.postimg.cc/dtWktfCt/pollo.jpg%22");

        Pizza tonno = new Pizza("Pizza Tonno", false, false, false, 12, "Realmente Exquisita",
                new String[] { "Cebolla", "Atún", "Salsa de Tomate", "Mozzarella", "Orégano"
                },
                "https://i.postimg.cc/MHp6CWd0/atun.jpg%22");

        Pizza hawaiana = new Pizza("Hawaiana", false, false, false, 3, "Pizza Hawaiana",
                new String[] { "Cebolla", "Atún", "Salsa de Tomate", "Mozzarella", "Orégano"
                }, "https://i.postimg.cc/J498qcV5/pizza.jpg%22");

        pizzas.add(margarita);
        pizzas.add(carbonara);
        pizzas.add(pepperoni);
        pizzas.add(suprema);
        pizzas.add(tonno);
        pizzas.add(hawaiana);

    }

    @GetMapping("/api/pizzas")
    public ArrayList<Pizza> calling() {

        return pizzas;
    }

    @PostMapping("/api/pizzas")
    public int insert(@RequestBody Pizza newPizza) {
        int res = -1;
        try {
            pizzas.add(newPizza);
            res = 1;
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    @DeleteMapping("/api/pizzas")
    public int delete(@RequestParam int id) {
        int res = -1;
        try {
            pizzas.removeIf(d -> (d.getId() == id));
            res = 1;
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    @PutMapping("/api/pizzas")
    public int updateUser(@RequestBody Pizza id) {
        // delete user with id = idUser

        int i = 0;
        while (i < this.pizzas.size()) {
            if (this.pizzas.get(i).getId() == id.getId()) {
                // he encontrado el idx "i" del elemento a modificar
                // -> sustituyo el elemento con el nuevo...
                this.pizzas.set(i, id);
                return 1;
            }
            i++;
        }
        return -1;
    }

}
