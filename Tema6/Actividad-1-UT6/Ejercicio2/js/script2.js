const element = document.getElementById("boton");
element.addEventListener("click", Funcion);

function Funcion(){
    document.getElementById("demo").innerHTML = "Pulsaste sobre el botón";
}