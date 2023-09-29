# PRACTICA 1 DE LENGUAJES DE MARCADO DE 1º DAW

## EL LENGUAJE DE MARCADO DE TEXTO MARKDOWN

**Markdown** es un *lenguaje de marcado* que permite la aplicación de *__formato__* a un texto empleando una serie de caracteres especiales.

La sintáxis es sencilla, básicamente se trata de insertar ciertos caracteres especiales al principio de cada línea, o antes y después de cada elemento al que queramos dar formato.

Así, podemos entre otras cosas:

## Poner un texto en cursiva, negrita o ambas

Para la cursiva, se utilizaa un asterisco * antes y después del texto. Para la negrita dos asteriscos **, y para ambas un asterisco y dos guiones bajos.

```
*Cursiva*
**Negrita**
*__Cursiva y negrita__*
````


## Añadir encabezados

Los encabezados se crean añadiendo almohadillas # al principio de cada línea. Cuántos más añadamos, más pequeño será el encabezado. Podemos incluir hasta 6 almohadillas, que sería el encabezado más pequeño.
```
# Encabezado 1
## Encabezado 2
### Encabezado 3
#### Encabezado 4
##### Encabezado 5
###### Encabezado 6
```

## Inclusión de bloques de código

Podemos añadir trozos de código que no son interpretados, sino que se muestran literalmente como han sido escritos. Con este ejemplo, Markdown no interpreta que las 4 almohadillas sean un encabezado. 

Se crean añadiendo una línea con tres o cuatro tildes invertidas al principio y al final del bloque. 

````
```
Esto es un bloque de código.
```
````

## Crear listas ordenadas y desornadas

Al igual que en HTML, se pueden crear crear listas ordenadas, añadiendo nñumeros ordenados y punto antes de un elemento, o desordenados, añadiendo asteriscos o guiones.

1. Lista1 
2. Lista2
3. Lista3
    1. Lista3_1
    2. Lista3_2
    3. Lista3_3  
* Lista1
* Lista2
* Lista3
* Lista4

## Enlaces a URL, ficheros e imágenes

Markdown permite crear enlaces online o enlaces por referencia a archivos locales, como ficheros o imágenes.

Para ello se usa el formato:
```
[Texto del enlace](ruta local)
````
La ruta local puede ser a otro archivo markdown con extensión .md, o un enlace a una imagen, que se mostraría en el documento.

Para insertar una imagen, el formato es similar, sólo que en lugar del texto del enlace, se inserta un texto alternativo en caso de la imagen no pudiera ser cargada correctamente.

```
![Texto alternativo](ruta local)
````
Vemos varios ejemplos: 

[Búsqueda de Markdown en Google](https://www.google.com/search?q=markdown)

[Enlaces a otro fichero](./markdown_enlazado.md/)

![Logo Markdown.](./markdown.png/)

## Insertar tablas

Las tablas se suelen utilizar para presentar información de forma clara y concisa, y para que un documento sea más fácil de leer y comprender, sobre todo si muestra mucha información.

Para dibujarlas, se utiliza el tubo o barra vertical | y un guión para hacer lineas de encabezado. Se pueden usar : en la linea de encabeza para alinear el texto de cada columna. A la izquierda, a la derecha, y si se ponen : a los dos lados, el texto de la columna estará centrado.

| Nombre       | Apellido      | Edad    |
| :------------|--------------:|:-------:|
| Juan         | Sánchez       | 25      |
| Diego        | Fernández     | 40      |
| Fernando     | Ruíz          | 18      |
