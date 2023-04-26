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

public class CafeController {
    ArrayList<Cafe> cafes;

    public CafeController() {
        cafes = new ArrayList<Cafe>();
        Cafe capuccino = new Cafe("Capuccino", 2.40,
                "Ideal para los amantes del café italiano",
                "https://i.postimg.cc/9FThk5jT/capuccino.jpg");
        Cafe latteMachiatto = new Cafe("LatteMachiatto", 3,
                "Latte Machiatto",
                "https://i.postimg.cc/T2Kmp48Z/machiato.jpg");
        Cafe chococino = new Cafe("Chococino", 4.30,
                "Cafe con sabor intenso a chocolate",
                "https://i.postimg.cc/3wWrnzZh/chococino.jpg");

        cafes.add(capuccino);
        cafes.add(latteMachiatto);
        cafes.add(chococino);
    }

    @GetMapping("/api/cafes")
    public ArrayList<Cafe> calling() {

        return cafes;
    }

    @PostMapping("/api/cafes")
    public int insert(@RequestBody Cafe newCafe) {
        int res = -1;
        try {
            cafes.add(newCafe);
            res = 1;
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    @DeleteMapping("/api/cafes")
    public int delete(@RequestParam int id) {
        int res = -1;
        try {
            cafes.removeIf(d -> (d.getId() == id));
            res = 1;
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    @PutMapping("/api/cafes")
    public int updateUser(@RequestBody Cafe id) {
        // delete user with id = idUser

        int i = 0;
        while (i < this.cafes.size()) {
            if (this.cafes.get(i).getId() == id.getId()) {
                // he encontrado el idx "i" del elemento a modificar
                // -> sustituyo el elemento con el nuevo...
                this.cafes.set(i, id);
                return 1;
            }
            i++;
        }
        return -1;
    }

}
