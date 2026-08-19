# Taller 2

## Descripción
Este repositorio contiene el desarrollo del segundo taller de lógica de programación, realizado en Java. En él se trabajan conceptos fundamentales como la declaración, inicialización y reasignación de variables, el uso de diferentes tipos de datos, estructuras condicionales y la entrada de datos proporcionada por el usuario. 

## Equipo de trabajo 
* **Integrante 1:** Emanuel Zuluaga Jaramillo
* **Integrante 2:** Surisaddai Pulgarin Torres

## Tecnologías y herramientas usadas 
* **Lenguaje Principal:** Java 
* **Control de Versiones:** Git & GitHub
* **Entorno de Desarrollo:** Visual Studio Code 

## Descripción del programa
El programa empieza con una bienvenida antes de dar las opciones para elegir, después de dar la bienvenida se presenta las opciones: 
 - Solución ecuación 1
 - Solución ecuación 2
 - Salida
Si elige la opción de salida el programa termina con una despedida, sino se elige la ecuación 1 o la ecuación 2 el programa le pide los datos de x y de z para poder resolver las ecuaciones, una vez resuelta la ecuación se le pregunta al usuario que, si desea volver a repetir alguna ecuación o no, si elige no, el programa ha una despedida y termina, sino vuelve a solicitar datos, y sigue con el bucle hasta que se desee terminarlo.

## Validación de datos

El programa utiliza métodos auxiliares para solicitar los datos ingresados por el usuario y validar que tengan el tipo de dato esperado.

El método `pedirNumero()` recibe la entrada como texto mediante `nextLine()` y posteriormente intenta convertirla a un número `double` utilizando `Double.parseDouble()`. Si el usuario ingresa un valor que no puede convertirse a número, se utiliza `try-catch` para controlar la excepción y solicitar nuevamente el dato.

El método `pedirOpcion()` funciona de manera similar, pero convierte la entrada a un número entero mediante `Integer.parseInt()`, ya que las opciones del menú corresponden a valores enteros.

Estos métodos utilizan un ciclo `while(true)` para repetir la solicitud hasta que el usuario proporcione un dato válido.

## ¿Qué es el do-while?
El `do-while` es un ciclo en java con una estructura de control similar al ciclo `while`, pero con una diferencia importante: el bloque de código se ejecuta al menos una vez, y luego se repite mientras una condición sea verdadera.

## ¿Qué es el try-catch?
Es una estructura de control que permite manejar excepciones en tiempo de ejecución, evitando que el programa termine abruptamente cuando ocurre un error. Las detecta y permite mostrar porque salió el error.


## Fuentes
[¿Qué es el do-while?](https://javautodidacta.es/bucles-do-while-y-while-en-java/)
[¿Cómo funciona el do-while?](https://jesus-castro89.github.io/algoritmia/do-while.html)
[¿Qué es el try-catch?](https://keepcoding.io/blog/que-es-el-bloque-try-catch-en-java/)
