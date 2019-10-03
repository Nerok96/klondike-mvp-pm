# klondike-mvp-pm

Práctica realizada por Jorge Berdún.


### Comented

En la rama Comented se encuentra todos los comentarios de mejora del código encontrados en la práctica. En dichos comentarios explico brevementee qué cosidero un fallo y propongo una posible solucón.

Para localizar dichas propuestas de mejora rápidamente las he dejado marcadas como "TODO"s.

Si bien el tener comentarios innecesarios es una violación de las normas de un código limpio, en esta ocasión lo he planteado así para facilitar la búsqueda de mejoras y poder disponer te margen para explicar los porqeués de los posibles cambios y fallos detectados.

## Otras cuestiones

#### Falta de Test
En general, creo que el primer fallo que se le puede atribuir a esta rama del klondike es la falta de test unitarios del código.

Debido a la extensión del mismo, y la complejidad de algunas de las pruebas unitarias necesarias para testearlo, no se han incluido pruebas en ninguna de las dos ramas presentadas.

#### Arquitectura y patrones
Además, para resolver otros problemas de arquitectura que plantea esta versión del código de Irati, se podrían aplicar patrones, concretamente el patrón Fachada para evitar que las vistas conozcan a todos los controladores existentes. Sin embargo, al ser este uno de los motivos del TFM de Irati, entiendo que no tiene sentido presentar una versión replicando los cambios que ha hecho ella.
