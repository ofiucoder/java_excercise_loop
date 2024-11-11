# java_excercise_loop


```mermaid

flowchart TD
    
    A(((Inicio))) -->|Console Scanner| B(Ingrese numero entero)
    B --> C[For 1 to 10]
    C -->|Display titulo tabla| D[Tabla de Multiplicar de entero]

    C -->|Display entero * ciclo = result|E {{Realiza Operacion}}
    C -->|Valida salida| F{Ciclo > 10}
    F -->|Salida| G(((Fin)))
    F ..>|siguiente|C


```
