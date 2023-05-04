package pizzeria.lafamiglia;

import jakarta.persistence.Entity;
//import javax.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
// @Table(name = "usuarios")
public class Usuario {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String pass1;
    @Getter
    @Setter
    private String direccion;
    
    
    
    }

