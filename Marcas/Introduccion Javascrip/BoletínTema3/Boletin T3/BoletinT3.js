//#region Ejercicio 1 
function numero_aleatorio() {
    var numeroAleatorio = Math.random() * 100;
    window.alert("Número aleatorio: " + numeroAleatorio);
}
//#endregion

//#region Ejercicio 2
function suma2numeros() {
    var numero1 = prompt("Escribe un numero: ");
    var numero2 = prompt("Escribe un numero: ");
    var suma = parseFloat(numero1) + parseFloat(numero2);
    window.alert("La suma es: " + suma);
}
//#endregion

//#region Ejercicio 3
function areacirculo() {
    var radio = prompt("Introduce el radio de tu circulo: ");
    var area = parseFloat(radio) * parseFloat(radio) * Math.PI;//Math.pow(radio,exponente)
    window.alert("El area del circulo es: " + area.toFixed(2));
}
//#endregion

//#region  Ejercicio 4
function parimpar() {
    var numero = prompt("Introduce un numero: ");
    if (numero % 2 == 0) {
        window.alert("El numero es par");
    } else {
        window.alert("El numero es impar");
    }
}
//#endregion

//#region Ejercicio 5
function aleatorio2() {
    var num = Math.random() * 5;
    var numero = Math.ceil(num);
    if (numero == 1) {
        window.alert("UNO");
    } else if (numero == 2) {
        window.alert("DOS");
    } else if (numero == 3) {
        window.alert("TRES");
    } else if (numero == 4) {
        window.alert("CUATRO");
    } else if (numero == 5) {
        window.alert("CINCO");
    } else {
        window.alert("ERROR");
    }
}
//#endregion

//#region Ejercicio 6
function multiplos() {
    var numero1 = prompt("Introduce un numero: ");
    var numero2 = prompt("Introduce un numero: ");
    num1 = parseInt(numero1);
    num2 = parseInt(numero2);
    if (num1 % num2 == 0 || num2 % num1 == 0) {
        window.alert("Son multiplos");
    } else {
        window.alert("No son multiplos");
    }
}
//#endregion

//#region Ejercicio 7
function precio_entrada() {
    var edades = prompt("Introduce tu edad: ");
    var edad = parseInt(edades);
    var precio;
    if (edad <= 8) {
        precio = 0;
    } else if (edad >= 9 && edad <= 16) {
        precio = 5;
    } else if (edad >= 17 && edad <= 25) {
        precio = 8;
    } else if (edad >= 26 && edad <= 55) {
        precio = 10;
    } else if (edad >= 56 && edad <= 65) {
        precio = 5;
    } else {
        precio = 0;
    }
    window.alert("El precio es: " + precio + "€");
}
//#endregion

//#region Ejercicio 8
function mascotas() {
    var mascota = prompt("Cual es tu mascota: ");
    var opcion;
    if (mascota == "huron" || mascota == "gato") {
        opcion = 1;
    } else if (mascota == "perro") {
        opcion = 2;
    } else if (mascota == "loro") {
        opcion = 3;
    } else {
        opcion = 4;
    }
    switch (opcion) {
        case 1:
            window.alert("Tiene que pagar 1€ por su mascota");
            break;
        case 2:
            window.alert("Tiene que pagar 1,5€ por su mascota");
            break;
        case 3:
            window.alert("Tiene que pagar 2€ por su mascota");
            break;
        default:
            window.alert("Mascota no permitida");
            break;
    }
}
//#endregion

//#region Ejercicio 9
function bingo(){
    do {
        var viejo = prompt("Introduce tu edad: ");
        var edad = parseInt(viejo);
    } while (edad<75 || edad>80);
    var premio = edad * 0.05;
    window.alert("Su premio es de :" + premio + "€");
}
//#endregion

//#region  Ejercicio 10
function factorial1(){
    var numero = prompt("Introduce un numero: ");
    var num = parseInt(numero);
    var acu = 1;
    for(var i = 1; i <= num; i++){
        acu = acu *i;
    }
    window.alert("El factoial de "+ num + " es: " + acu) 
}
function factorial2(){
    var numero = prompt("Introduce un numero: ");
    var num = parseInt(numero);
    var acu = 1;
    var i = 1;
    do{
        acu = acu * i;
        i++;
    } while (i <= num);
    window.alert("El factoial de "+ num + " es: " + acu);
}
//#endregion

//#region Ejercicio 11
function suma_de_numeros1(){
    var numero = prompt("Cuantos numeros va a introducir: ");
    var num = parseInt(numero);
    var acu = 0;
    for (var i = 0; i <= num; i++){
        var numero = prompt("Introduce un numero: ");
        var num = parseInt(numero);
        acu = acu + num;
    }
    window.alert("La suma de los numeros es: " + acu) 
}

function suma_de_numeros2(){
    var numero = prompt("Cuantos numeros va a introducir: ");
    var num = parseInt(numero);
    var acu = 0;
    var i = 0;
    do{
        var numero1 = prompt("Introduce un numero: ");
        var num1 = parseInt(numero1);
        acu = acu + num1;
        i++;
    }while (i < num)
    window.alert("La suma de los numeros es: " + acu) 
}
//#endregion

//#region Ejercicio 12
function paises(){
    var pais = [];
    var i;
    do {
        pais.push(prompt("¿Qué país quieres visitar?"));
        i++;
    } while (pais[i] != "");
    window.alert(pais);
}
//#endregion

//#region Ejercicio 13 / 14
function nombres(){
    var nombre = new Array("Diego", "Carlos", "Hugo", "David", "Pablo","Alberto");
    var letra = prompt("Dime una letra: ");
    var acu = 0;
    var nombresLetra = [];
    for (let i = 0; i < nombre.length; i++){
        if(letra.toUpperCase() == nombre[i].charAt(0)){
            acu = acu +1;
            nombresLetra.push(nombre[i]);
        }
    }
    window.alert(acu + " " + nombresLetra);
}
//#endregion

//#region Ejercicio 15 
function fibonacci(){
    var fin = 10000;
    var numero1 = 0;
    var numero2 = 1;
    var suma = 0;
    window.alert(numero2);
    while (suma < fin) {
        let siguienteNumero = numero1 + numero2;
        numero1 = numero2;
        numero2 = siguienteNumero;
        suma = numero1 + numero2; 
        window.alert(suma);
    }
}
//#endregion

