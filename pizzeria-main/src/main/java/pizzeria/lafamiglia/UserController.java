package pizzeria.lafamiglia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
/*@DeleteMapping("/api/Usuario/{id}")
public void deleteUser(@PathVariable Long id) {
    ur.deleteById(id);
}

@PutMapping("/api/Usuario/{id}")
public Usuario updateUser(@PathVariable Long id, @RequestBody Usuario updatedUser) {
    Usuario user = ur.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con id: " + id));
    user.setNombre(updatedUser.getNombre());
    user.setApellido(updatedUser.getApellido());
    user.setEmail(updatedUser.getEmail());
    // Agrega aquí las demás propiedades que quieras actualizar
    return ur.save(user);
}
*/
/*@Controller
public class MiControlador {
  @PostMapping("/guardar-datos")
  public String guardarDatos(@RequestParam("Nombre") String nombre,
                             @RequestParam("Email") String email,
                             @RequestParam("pass1") String pass1,
                             @RequestParam("Direccion") String Direccion) {
    // Aquí puedes hacer lo que necesites con los datos recibidos, como guardarlos en una base de datos o mostrarlos en una vista.
    return "vista-de-exito";
  }
}*/

}
