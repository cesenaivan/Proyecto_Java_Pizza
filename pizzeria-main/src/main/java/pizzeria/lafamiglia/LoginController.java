package pizzeria.lafamiglia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import pizzeria.lafamiglia.UsuarioRepository;

@RestController
public class LoginController {
    //List<Usuario> Listausuarioprueba;

    @Autowired
    UsuarioRepository ur1;

    /*public UserController() {
        
    }*/
@GetMapping ("/api/login")
public List<Usuario> getApp(){
    return ur1.findAll();
}
/*@PostMapping ("/api/login")
public Usuario cru(@RequestBody Usuario nwu1){
    return ur1.saveAndFlush(nwu1);
}*/

@PostMapping("/api/login")
public ResponseEntity<?> login(@RequestBody UsuarioLogin usuarioLogin) {
    // Buscamos el usuario con el email proporcionado
    Optional<Usuario> usuarioOptional = ur1.findById(usuarioLogin.getEmail());

    if (usuarioOptional.isPresent()) {
        Usuario usuario = usuarioOptional.get();

        // Comprobamos si la contraseña es correcta
        if (usuario.getPass1().equals(usuarioLogin.getPassword())) {
            return ResponseEntity.ok(usuario); // Devolvemos el usuario
        } else {
            return ResponseEntity.badRequest().body("Contraseña incorrecta");
        }
    } else {
        return ResponseEntity.badRequest().body("No se encontró un usuario con ese email");
    }
}
/*@DeleteMapping("/api/Usuario/{id}")
public void deleteUser(@PathVariable Long id) {
    ur.deleteById(id);
}
/* 
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