Kata Clasificar Revistas
=======================

Dado un año, queremos destacar aquellas revistas que tengan mayor puntuación (factor de impacto). Para ello necesitamos ser capaces de mostrar las revistas de ese año ordenadas por factor de impacto. En el caso de que dos revistas tengan la misma factor de impacto le asignremos la  misma posición y las ordenaremos alfabéticamente.

Caso1.- Ordenar Revistas
------------------------

Dadas las siguientes revistas de 2010 y su factor de impacto: Revista A factor de impacto: 8.9 Revista B factor de impacto: 2.0 y Revista C factor de impacto: 4.4

El resultado debe ser:

| Posición | Revista | Puntuación |
| -------- | ------- | ---------- |
| 1        | A       | 8.9        |
| 2        | C       | 4.4        |
| 3        | B       | 2.0        |

Caso2.- Ordenar Revistas con el mismo factor de impacto
-------------------------------------------------------

Dadas las siguientes revistas de 2009 y su factor de impacto: Revista A factor de impacto: 2.0 Revista B factor de impacto: 3.0 y Revista C factor de impacto: 3.0

El resultado debe ser:

| Posición | Revista | Puntuación |
| -------- | ------- | ---------- |
| 1        | B       | 3.0        |
| 1        | C       | 3.0        |
| 3        | A       | 2.0        |

Caso3.- Ordenar Revistas eliminando aquellas que son trimestrales
-----------------------------------------------------------------

Dadas las siguientes revistas de 2009 y su factor de impacto: Revista A factor de impacto: 2.0 Revista B factor de impacto: 1.0 y Revista C factor de impacto: 3.0 La revista A es trimestral

El resultado debe ser:

| Posición | Revista | Puntuación |
| -------- | ------- | ---------- |
| 1        | C       | 3.0        |
| 2        | B       | 1.0        |
