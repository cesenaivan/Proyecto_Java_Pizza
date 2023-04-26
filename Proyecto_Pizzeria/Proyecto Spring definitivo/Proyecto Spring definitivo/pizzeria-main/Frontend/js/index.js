// DEFINIMOS DE DONDE SACAREMOS LOS DATOS.
const pizzas =
  "http://localhost:8080/api/pizzas";
const postres =
  "http://localhost:8080/api/postres";
const cafes =
  "http://localhost:8080/api/cafes";
const containerflex = document.getElementById("prueba");
//Definimos los incrementos fuera para poder usarlos de forma global.

const contador = document.getElementById("incremento");
let incremento = 0;
// Cargamos las Pizzas
fetch(pizzas)
  .then((response) => response.json())
  .then((data) => {
    for (let i = 0; i < data.length; i++) {
      const containerflex = document.getElementById("prueba");
      const card = document.createElement("div");
      card.className = "card col-md-3";
      const imagen = document.createElement("img");
      imagen.className = "card-img-top";
      imagen.src = data[i].img;
      imagen.setAttribute("alt",data[i].name);
      card.appendChild(imagen);
      
      // Creamos el cuerpo de la card
      const cardbody = document.createElement("div");
      cardbody.className = "card-body";
      // Creamos los elementos para el nombre
      const name = document.createElement("h5");
      name.className = "card-title";
      name.innerHTML = data[i].name;
      name.style.cssText = "color: red; font-size: 25px;font-weight:bold;";
      // Creamos los elementos para la descripcion
      const descripcion = document.createElement("p");
      descripcion.className = "card-text";
      descripcion.innerHTML = data[i].descripcion;
      descripcion.style.cssText = "color:lightgreen;font-weight:bold;font-size:20px;";
      const hr2 = document.createElement("hr");
      hr2.className = "card-text";
      hr2.style.cssText = "border-top: 8px dotted orange;";

      // Creamos el apartado de ingredientes
      const ingredientes = document.createElement("p");
      ingredientes.className = "card-text";
      ingredientes.innerHTML = "Ingredientes: " + data[i].ingredientes;
      ingredientes.style.cssText = "font-weight:bold;font-size:20px;";
      // Creamos el precio
      const precio = document.createElement("p");
      precio.className = "card-text";
      precio.innerHTML = "Precio: " + data[i].precio + "€";
      precio.style.cssText =
        "color:white;border-solid:2px; border-color:white;font-weight:bold;font-size:20px; ";
      //Creamos el button
      const boton = document.createElement("button");
      boton.innerHTML = "Añadir al Carrito";
      boton.className = "añadirpizzas";
      boton.id = data[i].id;
      // Appenchild para adaptar las card.
      cardbody.appendChild(name);
      cardbody.appendChild(descripcion);
      cardbody.appendChild(hr2);
      cardbody.appendChild(ingredientes);
      cardbody.appendChild(precio);
      cardbody.appendChild(boton);
      containerflex.appendChild(card);
      card.appendChild(cardbody);
      console.log(data[i]);
      }
     

      const botones = document.querySelectorAll(".añadirpizzas");
      botones.forEach((boton) => {
        boton.addEventListener("click", () => {
          incremento = incremento+ 1;
          contador.innerHTML = incremento;
        });
      })
    })

// Mostrar los postres.
const nombrepostres = document.getElementById("nombrepostres");
fetch(postres)
  .then((res) => res.json())
  .then((data) => {
    for (let i = 0; i < data.length; i++) {
      // Creamos las imagenes
      const imagenpostres = document.createElement("img");
      imagenpostres.className = "imagenpostres";
      imagenpostres.src = data[i].img;
      imagenpostres.setAttribute("alt",data[i].name);
      imagenpostres.setAttribute("title",data[i].name);
      nombrepostres.appendChild(imagenpostres);
      // Creamos el nombre y el precio
      const desserts = document.createElement("p");
      desserts.className = "listadopostres";
      desserts.innerHTML = data[i].name + " " + data[i].precio + "€";
      // Creamos la descripcion
      const despostres = document.createElement("p");
      despostres.className = "listadopostrescursiva";
      despostres.innerHTML =  data[i].descripcion;

      //Creamos el boton de añadir al carrito
      const carritito = document.createElement("button");
      carritito.innerHTML = "Añadir al Carrito";
      carritito.className = "botonpostres";
carritito.id = data[i].id;
      // Hacemos los appendchild
      desserts.appendChild(despostres);
      const linea = document.createElement("hr");
      nombrepostres.appendChild(desserts);
      nombrepostres.appendChild(carritito);
      nombrepostres.appendChild(linea);
     
    }
    const botonespostre = document.querySelectorAll(".botonpostres");
    botonespostre.forEach((carritito) => {
      carritito.addEventListener("click", () => {
        incremento = incremento + 1;
        contador.innerHTML = incremento;
      })
    });
     })


// Mostrar Los cafés
const divcafes = document.getElementById("cafes");
fetch(cafes)
  .then((res) => res.json())
  .then((data) => {
    for (let i = 0; i < data.length; i++) {
      // Mostramos la imagen
      const imagenpostres = document.createElement("img");
      imagenpostres.className = "imagenpostres";
      imagenpostres.src = data[i].img;

    // setAttribute alt a la Imagen. 
      imagenpostres.setAttribute("alt",data[i].name);
      imagenpostres.setAttribute("title",data[i].name);
      divcafes.appendChild(imagenpostres);
      // Mostramos los nombres y precios de los cafés.
      const desserts = document.createElement("p");
      desserts.className = "listadopostres";
      desserts.innerHTML = data[i].name + " " + data[i].precio + "€";
      // Mostramos el Elemento de la descripcion
      const despostres = document.createElement("p");
      despostres.className = "listadopostrescursiva";
      despostres.innerHTML = " ( " + data[i].descripcion + " ) ";
    
      // Mostramos la linea HR.
      const linea = document.createElement("hr");
      // HACEMOS LOS AppendCHILD
      divcafes.appendChild(desserts);
      desserts.appendChild(despostres);
      divcafes.appendChild(linea);
  }
   });


// Hacer aparecer los Cafes y ocultar los pasteles
function mostrarcafes() {
  const titulo = document.getElementById("tituloquecambia");
  const divcafes = document.getElementById("cafes");
  const pasteles = document.getElementById("nombrepostres");
  pasteles.style.display = "none";
  divcafes.style.display = "block";
  titulo.innerHTML = "Ver Cafes";
}

// Hacer lo mismo pero mostrando los pasteles.
function mostrarpostres() {
  const titulo = document.getElementById("tituloquecambia");
  const divcafes = document.getElementById("cafes");
  const pasteles = document.getElementById("nombrepostres");
  pasteles.style.display = "block";
  divcafes.style.display = "none";
  titulo.innerHTML = "Ver Postres";
}


