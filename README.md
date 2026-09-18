# Big O y Estructuras de Datos — Java

Proyecto de aprendizaje práctico sobre **notación Big O**, **estructuras de datos**, **algoritmos de ordenación**, **algoritmos de búsqueda** y problemas clásicos de **LeetCode** — todo implementado en Java.

## Descripción general

Cada archivo es un demo independiente con su propio método `main()`, diseñado para entender cómo funcionan estos conceptos por debajo. Los comentarios incluyen análisis de Big O, trade-offs y casos de uso prácticos.

## Contenido

### Estructuras de Datos

| Estructura | Archivo | Descripción |
|------------|---------|-------------|
| Array dinámico | `DynamicArraysStructure.java` | Array redimensionable desde cero (grow/shrink 1.5x) |
| LinkedList | `LinkedListsStructure.java` | Teoría, estructura de nodos y uso de `java.util.LinkedList` |
| ArrayList vs LinkedList | `ArrayListVsLinkedLists.java` | Benchmark de rendimiento con 1M de elementos |
| Stack | `StackStructure.java` | Demo LIFO + validación de paréntesis + inversión de strings |
| Queue | `QueueStructure.java` | Demo FIFO con `LinkedList` como soporte |
| PriorityQueue | `PriorityQueueStructure.java` | Ordenamiento min-heap y max-heap |

### Algoritmos de Ordenación

| Algoritmo | Archivo | Complejidad temporal | Notas |
|-----------|---------|---------------------|-------|
| Recursión | `Recursion.java` | — | 8 ejemplos recursivos (factorial, palíndromo, etc.) |
| Bubble Sort | `BubbleSort.java` | O(n²) | Simple pero lento en grandes volúmenes |
| Selection Sort | `SelectionSort.java` | O(n²) | Dos implementaciones (detallada + limpia) |
| Insertion Sort | `InsertionSort.java` | O(n²) mejor O(n) | Menos pasos que Bubble Sort |
| Merge Sort | `MergeSort.java` | O(n log n) | Divide y vencerás, O(n) de espacio |

### Algoritmos de Búsqueda

| Algoritmo | Archivo | Complejidad temporal | Notas |
|-----------|---------|---------------------|-------|
| Búsqueda lineal | `LinearSearch.java` | O(n) | No requiere ordenamiento |
| Búsqueda binaria | `BinarySearch.java` | O(log n) | Requiere array ordenado |
| Interpolation Search | `InterpolationSearch.java` | O(log(log(n))) promedio | Ideal para distribuciones uniformes |

### Ejercicios

| Ejercicio | Archivo | Descripción |
|-----------|---------|-------------|
| Queue con 2 Stacks | `MyQueue.java` | Clásico LeetCode #232 |
| Sistema de cola de impresión | `PrintQueueSystem.java` | Aplicación real de FIFO |
| Linked List personalizada | `MyLinkedList.java` | Lista enlazada simple desde cero |
| Merge Sort en Linked List | `SortListMerge.java` | LeetCode #148 |

### Problemas de LeetCode

| Problema | Archivo | Enfoque |
|----------|---------|---------|
| Two Sum (#1) | `TwoSum.java` | Fuerza bruta O(n²) |
| Reverse Integer (#7) | `ReverseInteger.java` | Inversión con Stack |
| Remove Nth Node (#19) | `RemoveNthNode.java` | Técnica de dos pasadas |

## Estructura del proyecto

```
src/
├── DataStructures/
├── SortAlgorithms/
├── SearchAlgorithms/
├── ExercisesDataStructures/
│   └── LinkedListsExercises/
└── LeetCode/
```

## Requisitos

- **Java 17+** (usa text blocks y características modernas)
- Sin dependencias externas — solo `java.util.*`

## Cómo ejecutar

Cada archivo es autocontenido. Ejecuta cualquier archivo directamente desde tu IDE o por terminal:

```bash
javac src/SortAlgorithms/MergeSort.java && java -cp src SortAlgorithms.MergeSort
```

## Licencia

Proyecto de aprendizaje personal. Úsalo libremente para tu estudio.
