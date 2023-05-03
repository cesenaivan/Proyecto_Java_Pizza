window.onload = uri1 => {
    const form = document.querySelector('form');

form.addEventListener('submit', async (event) => {
  event.preventDefault();

  const formData = new FormData(form);
  const data = Object.fromEntries(formData.entries());

  try {
    const response = await fetch('/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(data)
    });

    if (response.ok) {
      // El inicio de sesión fue exitoso, redirigir al usuario a su perfil
      window.location.href = '/perfil';
    } else {
      // El inicio de sesión falló, mostrar un mensaje de error al usuario
      const error = await response.json();
      alert(error.message);
    }
  } catch (error) {
    console.error(error);
    alert('Ocurrió un error al iniciar sesión, inténtalo de nuevo más tarde');
  }
});
};