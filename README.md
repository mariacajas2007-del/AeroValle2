# AeroValle - Herencia

## Descripción

AeroValle es un proyecto desarrollado en Java para practicar los conceptos de herencia y polimorfismo en Programación Orientada a Objetos.

El sistema utiliza una clase base llamada `Empleado` y diferentes subclases que representan distintos tipos de empleados de AeroValle.

En este ejercicio se agregó la clase `Supervisor`, la cual hereda de `Empleado` y calcula su salario tomando en cuenta un bono adicional por cada equipo que supervisa.

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Visual Studio Code
- Git
- GitHub

## Clase Supervisor

La clase `Supervisor` extiende de la clase `Empleado`.

Esta clase contiene el atributo:

- `equiposSupervisados`: almacena la cantidad de equipos que tiene a su cargo el supervisor.

El constructor utiliza `super(...)` para inicializar los atributos heredados:

- nombre
- id
- salarioBase

## Cálculo del salario

La clase `Supervisor` sobrescribe el método `calcularSalario()`.

El salario se calcula utilizando el salario base del empleado y agregando un bono de Q500 por cada equipo supervisado.

La fórmula utilizada es:

Salario = salario base + (equipos supervisados * Q500)

## Herencia

La relación principal utilizada en el proyecto es:

Empleado
|
|-- Piloto
|-- TecnicoMantenimiento
|-- Supervisor

Esto permite almacenar diferentes tipos de empleados dentro de un arreglo `Empleado[]` y utilizar el método `calcularSalario()` correspondiente a cada objeto.

## Conceptos aplicados

- Clases y objetos
- Herencia
- Uso de `extends`
- Uso de `super`
- Encapsulamiento
- Sobrescritura de métodos
- Polimorfismo
- Arreglos de objetos

## Ejecución

1. Descargar o clonar el repositorio.
2. Abrir la carpeta del proyecto en Visual Studio Code.
3. Compilar las clases Java.
4. Ejecutar la clase que contiene el método `main`.
5. El programa mostrará la información de los empleados y sus salarios calculados.

## Autora

María Cajas
