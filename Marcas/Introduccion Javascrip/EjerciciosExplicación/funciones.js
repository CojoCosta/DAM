//FUNCIONES
function saludar() {
    //VARIABLES let//var (MEJOR USAR SIEMPRE "LET")
    //let nombre = 0; //NO PUEDE HABER DOS IGUALES
    //var nombre2 = 12; //PUEDE REPETIRSE EL NOMBRE DE LA VARIABLE Y PUEDE LLEVAR A ERROR
    let nombre=prompt("Write your name: ");
    document.write("Hellow "+nombre+" welcome to javascript's world");
}