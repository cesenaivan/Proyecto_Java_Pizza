package pizzeria.lafamiglia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import pizzeria.lafamiglia.UsuarioRepository;

@RestController
public class UserController {
    //List<Usuario> Listausuarioprueba;

    @Autowired
    UsuarioRepository ur;

    /*public UserController() {
        
    }*/
@GetMapping ("/api/Usuario")
public List<Usuario> getApp(){
    return ur.findAll();
}
@PostMapping ("/api/Usuario")
public Usuario cru(@RequestBody Usuario nwu){
    return ur.saveAndFlush(nwu);
}
}
