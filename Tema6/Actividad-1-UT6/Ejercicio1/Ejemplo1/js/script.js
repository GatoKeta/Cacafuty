/*
PARTE A
Prueba el ejercicio primero utilizando este trozo de código
Luego coméntalo, descomenta el trozo de código de abajo 
y pruébalo de nuevo
*/
/*
const button = document.querySelector("button"); /*selecciona el elemento "button" del HTML y lo guarda en la constante llamada button*/

button.onclick = function () { /*Se asigna una función al evento onclick del botón, cada vez que se de click al boton pasara lo que sigue a continuacion de las llaves.*/
    alert("Hello!"); /*mostrara el mensaje "Hello! en una ventana*/
}
*/*/
/******************************************/

/*
PARTE B
¿Qué diferencia encuentras entre este código (PARTE B)
y el de la PARTE de arriba (PARTE A)?
*/

document.addEventListener("DOMContentLoaded", function() { 
    
const button = document.querySelector("button"); /*selecciona el primer elemento <button> que aparece en el 
documento HTML y lo asigna a la constante button. */ 
button.onclick = function () { /*Se asigna una función al evento onclick del botón, cada vez que se de click al boton pasara lo que sigue a continuacion de las llaves.*/
    alert("Hello!"); /*muestra el mensaje: "Hello!" al pulsar el boton*/
}

});










