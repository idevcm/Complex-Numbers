1. English manual
2. Manual en español

# Complex numbers operations

This program creates 2 complex numbers from 4 real numbers entered by the user and performs a series of operations with
them.

This program demonstrates my knowledge in the following competencies:

- Use of objects
- Use of exceptions
- Use of interfaces

The user is asked to enter four numbers, one by one, with the following structure \d{2},\d{3} (e.g. 12,123), not
allowing data insertions with ".". As two valid numbers are entered, an object of type "Complex" is created, with which
the following operations are performed: addition, subtraction, multiplication, division and calculation of the absolute
value of each of the numbers.

![image](https://github.com/idevcm/data-file-acces/assets/110684532/1d6eae99-16df-40e9-b961-5d63746198f6)

Once the operations have been performed, a third complex number is created from the absolute value of the first two
complex numbers generated, and a fourth number is created using the "Cloneable" interface.

![image](https://github.com/idevcm/data-file-acces/assets/110684532/758d5284-d865-4085-b9c3-a76aa57179bf)

Finally, an ordered list of the complex numbers generated is shown from smallest to largest.

# Repository content

This repository has a Maven project, so it can be imported directly from any IDE that supports this type of projects.

# Requirements

To run the program, you must have the Java JVM installed or have the latest versions of it. To check if you have it
installed or updated, open the terminal of your PC and type the following command:

```
java -version
```

In case the command is not recognized or the version of your JVM is lower than 20, it means that we do not have the JVM
installed on our pc or we have an outdated one, to fix this follow the link below:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

# Execution

The entry point to the application is in the appMain class. Once the program is executed, it will ask us to enter a
number with the following structure \d{2},\d{3} (e.g. 12,123). If we do not follow this structure, it will ask us to
re-enter the number without losing the data already entered.

![image](https://github.com/idevcm/data-file-acces/assets/110684532/bfeb836d-3134-44f2-b251-fb3ed6599aed)

----------------------------------------------------------------------------------------------

# Operaciones con números complejos

Este programa, crea 2 números complejos a partir de 4 números reales introducidos por el usuario y realiza una serie
de operaciones con los mismos.

Dicho programa muestra mi conocimiento en las siguientes competencias:

- Uso de objetos
- Uso de excepciones
- Uso de interfaces

Se pide al usuario que introduzca una serie de números con la siguiente estructura \d{2},\d{3} (Ej. 12,123),
no permitiendo inserciones de datos con ".". A medida que se introducen dos números válidos, se crea un objeto de tipo
"Complejo", con los cuales se realizan las siguientes operaciones: suma, resta, multiplicación, división y cálculo
del valor absoluto de cada uno de los números complejos.

![image](https://github.com/idevcm/data-file-acces/assets/110684532/1d6eae99-16df-40e9-b961-5d63746198f6)

Una vez realizadas las operaciones, se crea un tercer número complejo a partir del valor absoluto de los primeros dos
números complejos generados y un cuarto número gracias a la interfaz "Cloneable".

![image](https://github.com/idevcm/data-file-acces/assets/110684532/758d5284-d865-4085-b9c3-a76aa57179bf)

Por último, se muestra un listado ordenado de los números complejos generados de menor a mayor.

## Contenido del repositorio

Este repositorio cuenta con un proyecto Maven, por lo que se puede importar directamente desde cualquier IDE que soporte
este tipo de proyectos.

## Requisitos

Para ejecutar el programa, debes tener instalado la JVM de java o disponer de sus últimas versiones, para comprobar si
lo tienes instalado o actualizado, abre la terminal de tu pc y escribe el siguiente comando:

```
java -version
```

En el caso de que no reconozca el comando o la versión de tu JVM sea inferior a la 18, quiere decir que no tenemos la
JVM instalada en nuestro pc o que bien disponemos de una desactualizada, para arreglar esto siga el siguiente enlace:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

## Ejecución

El punto de entrada a la aplicación se encuentra en la clase appMain. Una vez ejecutado el programa, nos pedirá que
introduzcamos un número con la siguiente estructura \d{2},\d{3} (Ej. 12,123). En caso que no sigamos dicha estructura,
nos pedirá que volvamos a introducir el número sin perder los datos ya introducidos.

![image](https://github.com/idevcm/data-file-acces/assets/110684532/bfeb836d-3134-44f2-b251-fb3ed6599aed)