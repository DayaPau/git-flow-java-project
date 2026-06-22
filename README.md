# Git Flow Java Project

## Descripción del proyecto

Este proyecto corresponde a un ejercicio práctico de versionamiento utilizando **Git Flow** en un proyecto básico desarrollado en Java. El objetivo principal fue aplicar el uso de ramas, commits, Pull Requests y fusiones para organizar el desarrollo de nuevas funcionalidades y la preparación de una versión final.

Durante la práctica se trabajó con las ramas principales `main` y `develop`, además de ramas temporales de tipo `feature` y `release`.

## Objetivo general

Aplicar Git Flow en un proyecto Java para gestionar ramas, funcionalidades y versiones mediante GitHub y GitHub Codespaces.

## Tecnologías utilizadas

* Java
* Git
* GitHub
* GitHub Codespaces

## Estructura del proyecto

```text
git-flow-java-project/
│
├── Main.java
├── Saludo.java
├── Despedida.java
├── historial-git-flow.txt
├── .gitignore
└── README.md
```

## Funcionalidades implementadas

### 1. Proyecto Java base

Se creó un proyecto Java básico con una clase `Saludo`, encargada de generar un saludo inicial.

Archivo `Saludo.java` inicial:

```java
public class Saludo {
    public String generarSaludo(String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}
```

### 2. Despedida personalizada

Se implementó una nueva funcionalidad mediante la rama:

```text
feature/despedida-personalizada
```

En esta funcionalidad se agregó la clase `Despedida.java`, que permite generar una despedida personalizada.

```java
public class Despedida {
    public String generarDespedida(String nombre) {
        return "¡Adiós, " + nombre + "!";
    }
}
```

Luego, esta funcionalidad fue integrada a la rama `develop` mediante un Pull Request.

### 3. Preparación de versión v1.1.0

Se creó una rama de lanzamiento:

```text
release/v1.1.0
```

En esta rama se agregó un logotipo ASCII al inicio del programa:

```java
System.out.println("***************");
System.out.println("* JAVA PROJECT *");
System.out.println("***************");
```

La rama `release/v1.1.0` fue fusionada tanto en `main` como en `develop`, con el objetivo de mantener sincronizadas las ramas principales del flujo de trabajo.

### 4. Saludo multilingüe

Se creó la rama:

```text
feature/saludo-multilingue
```

En esta funcionalidad se modificó la clase `Saludo.java` para soportar saludos en varios idiomas: español, inglés y francés.

```java
public class Saludo {
    public String generarSaludo(String nombre, String idioma) {
        switch (idioma.toLowerCase()) {
            case "es":
                return "¡Hola, " + nombre + "!";
            case "en":
                return "Hello, " + nombre + "!";
            case "fr":
                return "Bonjour, " + nombre + "!";
            default:
                return "¡Hola, " + nombre + "!";
        }
    }
}
```

Esta funcionalidad también fue integrada a `develop` mediante un Pull Request.

## Código principal

El archivo `Main.java` ejecuta el programa mostrando el logotipo, los saludos en diferentes idiomas y la despedida personalizada.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));

        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}
```

## Ejecución del proyecto

Para compilar el proyecto, se debe ejecutar el siguiente comando:

```bash
javac Main.java Saludo.java Despedida.java
```

Para ejecutar el programa:

```bash
java Main
```

## Salida esperada

```text
***************
* JAVA PROJECT *
***************
Hello, Mundo!
¡Hola, Mundo!
Bonjour, Mundo!
¡Adiós, Mundo!
```

## Flujo de ramas utilizado

Durante el desarrollo se utilizó el siguiente flujo de ramas:

```text
main
develop
feature/despedida-personalizada
release/v1.1.0
feature/saludo-multilingue
```

### Ramas principales

* `main`: contiene la versión estable del proyecto.
* `develop`: contiene los cambios integrados durante el desarrollo.

### Ramas temporales

* `feature/despedida-personalizada`: utilizada para desarrollar la funcionalidad de despedida personalizada.
* `release/v1.1.0`: utilizada para preparar la versión 1.1.0 del proyecto.
* `feature/saludo-multilingue`: utilizada para implementar el saludo en varios idiomas.

## Evidencia del historial Git

Para generar la evidencia del historial de ramas, commits y fusiones, se ejecutó el siguiente comando:

```bash
git log --oneline --graph --decorate --all
```

La salida de este comando fue guardada en el archivo:

```text
historial-git-flow.txt
```

Este archivo sirve como evidencia del uso de Git Flow durante el desarrollo del proyecto.

## Importancia de la gestión de configuración

La gestión de configuración es importante porque permite controlar los cambios realizados en un proyecto de software de forma ordenada. Gracias al uso de ramas, commits y Pull Requests, el equipo puede trabajar en nuevas funcionalidades sin afectar directamente la versión principal del sistema.

Además, Git Flow facilita la organización del desarrollo, ya que permite separar el trabajo en progreso, las nuevas funcionalidades y las versiones listas para producción. Esto ayuda a mantener un historial claro del proyecto y mejora la colaboración entre los integrantes del equipo.

## Integrantes

* Integrante 1: Vanessa Torres
* Integrante 2: Dayana Vallejos

## Conclusión

En esta práctica se aplicó Git Flow para organizar el desarrollo de un proyecto Java. Se crearon ramas para nuevas funcionalidades, una rama de lanzamiento para preparar una versión y se realizaron Pull Requests para integrar los cambios en las ramas correspondientes.

El ejercicio permitió comprender la importancia de trabajar con un flujo de versionamiento ordenado, especialmente en proyectos donde participan varios desarrolladores.
