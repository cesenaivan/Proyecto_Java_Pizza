// Seleccionamos todos los elementos con la clase "btn-light"
const mesas = document.querySelectorAll('.btn-light');

// Inicializamos un seleccionmesas para contar el número de mesas ocupadas.
let seleccionmesas = 0;

// Recorrer la lista de mesas para cuando cliquen se activen.
for (let i = 0; i < mesas.length; i++) {
  mesas[i].addEventListener('click', function() {

    // El maximo de mesas ocupadas es dos.
    if (seleccionmesas < 2 && mesas[i].innerHTML == "No Reservado") {
      // Cambiamos la clase de la mesa a "btn-danger" para indicar que esta ocupada
      mesas[i].classList.toggle("btn-danger");
      // Cambiamos la clase de la mesa a "btn-light" para indicar que esta disponible.
      mesas[i].classList.toggle("btn-light");
      // Cambiamos el texto dentro de la mesa a "Mesa Ocupada"
      mesas[i].innerHTML = "Mesa Ocupada";
      // Incrementamos el seleccionmesas.
      seleccionmesas++;

    // Si la mesa ya esta ocupada 
    } else if (mesas[i].innerHTML == "Mesa Ocupada") {
      // Cambiamos la clase de la mesa a "btn-light" para indicar que está disponible
      mesas[i].classList.toggle("btn-light");
      // Cambiamos la clase de la mesa a "btn-danger" para indicar que está ocupada
      mesas[i].classList.toggle("btn-danger");
      // Cambiar el texto dentro de la mesa a "No Reservado"
      mesas[i].innerHTML = "No Reservado";
      // Restamos el seleccionmesas a las mesas ocupadas.
      seleccionmesas--;
    }
  });
}
