package pizzeria.lafamiglia;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class LafamigliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LafamigliaApplication.class, args);
	}

	@RestController
	@EnableWebMvc
	public class PizzasController {

		@GetMapping("/api/pizzas")
		@CrossOrigin(origins = "http://localhost:3000")
		public ArrayList<Pizzas> getPizzas() {
			ArrayList<Pizzas> pizzas = new ArrayList<Pizzas>();
			Pizzas margarita = new Pizzas("Pizza Margarita", false, true, false, 6, "Pizza exquista",
					new String[] { "Mozzarela", "Tomate", "Espinacas" }, "https://i.postimg.cc/4xj4xmKS/margarita.jpg");

			Pizzas carbonara = new Pizzas("Pizza Carbonara", true, true, false, 6, "Realmente Exquisita",
					new String[] { "Salsa Carbonara", "Bacon", "Huevo" },
					"https://i.postimg.cc/DyVcLc9v/carbonara.jpg");

			Pizzas pepperoni = new Pizzas("Pizza Pepperoni", false, false, false, 3, "Realmente Exquisita",
					new String[] { "Mozzarella", "Tomate", "Pepperoni" },
					"https://i.postimg.cc/y81YbwML/pepperoni.jpg");

			Pizzas suprema = new Pizzas("Pizza Suprema", false, false, true, 12, "Realmente Exquisita",
					new String[] { "Pollo", "Mozzarella", "Cebolla", "Salsa barbacoa" },
					"https://i.postimg.cc/dtWktfCt/pollo.jpg");

			
			
			  Pizzas tonno = new Pizzas("Pizza Tonno", false,false,false, 12, "Realmente Exquisita",
			  new String[] { "Cebolla", "Atún", "Salsa de Tomate", "Mozzarella", "Orégano"
			  },
			  "https://i.postimg.cc/MHp6CWd0/atun.jpg");
			  
			  Pizzas hawaiana = new Pizzas("Hawaiana",false,false,false, 3, "Pizza Hawaiana",
			  new String[] { "Cebolla", "Atún", "Salsa de Tomate", "Mozzarella", "Orégano"
			  },"https://i.postimg.cc/J498qcV5/pizza.jpg");
			 
			 pizzas.add(margarita);
			 pizzas.add(carbonara);
			 pizzas.add(pepperoni);
			 pizzas.add(suprema);
			 pizzas.add(tonno);
			 pizzas.add(hawaiana);
			 return pizzas;
			 
		}

	}

	@EnableWebMvc
	@RestController
	public class PostresController {
		@GetMapping("/api/postres")
		@CrossOrigin(origins = "http://localhost:3000")
		public ArrayList<Postre> getPostre() {
			ArrayList<Postre> postres = new ArrayList<Postre>();
			Postre tiramisu = new Postre("Tarta de Tiramisu", 3.40,

					"Especialidad de la Casa",
					"https://i.postimg.cc/CKbdTBB1/tiramisu.jpg");
			Postre BrownieDeChocolate = new Postre("Brownie de Chocolate", 2.30,
					"Saborea el intenso sabor a Chocolate",
					"https://i.postimg.cc/zD7bGgdH/brownie.jpg");
			Postre Pannacota = new Postre("Pannacota", 2,
					"Un postre delicioso para degustar",
					"https://i.postimg.cc/CxXfVpcv/pannacota.jpg");
			Postre TartaIchigo = new Postre("Tarta Ichigo", 6,
					"Un bizococho de Nata y Fresas",
					"https://i.postimg.cc/8z0LP6zm/ichigo.jpg");

			postres.add(tiramisu);
			postres.add(BrownieDeChocolate);
			postres.add(Pannacota);
			postres.add(TartaIchigo);
			return postres;
		}
	}

	@EnableWebMvc
	@RestController
	public class CafeController {
		@GetMapping("/api/cafes")
		@CrossOrigin(origins = "http://localhost:3000")
		public ArrayList<Cafe> getCafes() {
			ArrayList<Cafe> cafes = new ArrayList<>();
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

			return cafes;
		}
	}

	@EnableWebMvc
	@RestController
	public class IntoleranciaController {
		@GetMapping("/api/alergenos")
		@CrossOrigin(origins = "http://localhost:8080")
		public ArrayList<Intolerancia> getIntolerancias() {
			ArrayList<Intolerancia> intolerancias = new ArrayList<>();

			Intolerancia trigo = new Intolerancia("Trigo", "https://i.postimg.cc/Px4P0V3P/wheat-amber-50x50.png");
			Intolerancia huevo = new Intolerancia("Huevo", "https://i.postimg.cc/PJQz3MZ4/eggs-amber-50x50.png");
			Intolerancia leche = new Intolerancia("Leche", "https://i.postimg.cc/XqP70Rw7/milk-amber-50x50.png");
			Intolerancia frutosSecos = new Intolerancia("FrutosSecos",
					"https://i.postimg.cc/vZbHwtnn/peanut-amber-50x50.png");
			intolerancias.add(trigo);
			intolerancias.add(huevo);
			intolerancias.add(leche);
			intolerancias.add(frutosSecos);
			return intolerancias;
		}
	}
}
