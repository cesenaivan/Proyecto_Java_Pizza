window.onload = uri => {
    const form = document.getElementById("form");
    form.addEventListener("submit", (event) => {
        event.preventDefault(); // evitar la recarga de la página

        const formData = new FormData(form);
        const json = {};

        for (const [key, value] of formData.entries()) {
            json[key] = value;
        }

        console.log(JSON.stringify(json));

        fetch('http://localhost:5000/api/Usuario', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(json)
        })
            .then(response => response.json())
            .then(data => console.log(data))
            .catch(error => console.error(error));
    });
};

/*
// Selecciona el formulario y agrega un evento para escuchar la acción submit
const form = document.querySelector('#form');
form.addEventListener('submit', function(event) {
  event.preventDefault(); // Evita que el formulario se envíe automáticamente

  // Obtiene los valores de los campos de entrada
  const nombre = document.querySelector('#nombre').value;
  const email = document.querySelector('#email').value;
  const pass1 = document.querySelector('#pass1').value;
  const direccion = document.querySelector('#dir').value;

  // Crea un objeto JSON con los valores de los campos de entrada
  const usuario = {
    "nombre": nombre,
    "email": email,
    "contraseña": pass1,
    "direccion": direccion
  };
  const usuarioJSON = JSON.stringify(usuario);
  console.log(usuarioJSON);
   // Muestra el objeto JSON en la consola
});*/
