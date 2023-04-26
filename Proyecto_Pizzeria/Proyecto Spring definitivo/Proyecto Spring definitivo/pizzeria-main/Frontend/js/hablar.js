function hablar() {
    const synth = window.speechSynthesis;
    //El SpeechSynthesisUtterance()constructor de la SpeechSynthesisUtteranceinterfaz devuelve una nueva SpeechSynthesisUtteranceinstancia de objeto.
        const mensaje = new SpeechSynthesisUtterance();
        // Definimos el mensaje
        mensaje.lang = 'es-ES';
        mensaje.text = 'Hola, solamente se permite reservar 2 mesas por persona más informacion contactenos';
        // La pitchpropiedad de la SpeechSynthesisUtteranceinterfaz obtiene y establece el tono en el que se pronunciará el enunciado.
        mensaje.pitch = 0.7;
        // La ratepropiedad de la SpeechSynthesisUtteranceinterfaz obtiene y establece la velocidad a la que se pronunciará el enunciado.
        mensaje.rate = 0.9;    
        // El mensaje.
        synth.speak(mensaje);
    }
var meus2Noms = "Miguel Angel";
    // Donde hemos encontrado esta API , https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/rate