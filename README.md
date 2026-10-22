# Sistema de Gestión de Parcelas — Grupo 6

## 1. Descripción del proyecto

El proyecto **Sistema de Gestión de Parcelas** se desarrolla como parte del taller grupal de la asignatura Programación 3 (Programación Orientada a Objetos Avanzada). Su propósito inicial es implementar una clase Java para representar parcelas agrícolas, calcular su superficie en metros cuadrados y verificar su funcionamiento mediante pruebas unitarias.

El proyecto utiliza Java, Maven, JUnit, Git y GitHub para la implementación, validación y gestión colaborativa del código fuente.

## 2. Integrantes y roles

| Integrante | Rol |
|---|---|
| Salazar | Líder del grupo e integración del proyecto |
| Castillo | Desarrollo y revisión de código |
| Chonillo | Documentación del proyecto |
| Ávalos | Elaboración y validación de pruebas |
| Washington | Integración y verificación final |

*Los roles deben corresponder a las responsabilidades asumidas por cada integrante.*

## 3. Tecnologías y versiones del entorno de desarrollo

| Integrante | Java JDK | Git para Windows | IntelliJ IDEA |
|---|---|---|---|
| Salazar | Java 21 (LTS) | 2.55.0.windows.3 | 2026.2.3 |
| Castillo | Java 21 (LTS) | 2.55.0.windows.3 | 2026.2.3 |
| Chonillo | Java 21 (LTS) | 2.55.0.windows.3 | 2026.2.3 |
| Ávalos | Java 21 (LTS) | 2.55.0.windows.3 | 2026.2.3 |
| Washington | Java 21 (LTS) | 2.55.0.windows.3 | 2026.2.3 |

### Herramientas complementarias

| Herramienta | Versión de referencia |
|---|---|
| Apache Maven | Maven 3 integrado en IntelliJ IDEA |
| JUnit Jupiter | JUnit 5, según la dependencia configurada en `pom.xml` |
| Sistema operativo | Windows 10/11 de 64 bits |
| Plataforma de repositorio | GitHub |
| Rama principal | `main` |

**Nota sobre las versiones:** Java 21 es una versión LTS adecuada para este proyecto. Las versiones indicadas para los integrantes son referencias de configuración y deben verificarse en cada computadora antes de entregar el documento. La versión de JUnit debe coincidir con la declarada en `pom.xml`.

## 4. Estructura del proyecto

```text
finca-grupo6/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── ec/edu/uagraria/finca/
    │           └── Parcela.java
    └── test/
        └── java/
            └── ec/edu/uagraria/finca/
                ├── ParcelaTest.java
                ├── ParcelaSalazarTest.java
                ├── ParcelaCastilloTest.java
                ├── ParcelaChonilloTest.java
                ├── ParcelaAvalosTest.java
                └── ParcelaWashingtonTest.java
```

## 5. Funcionalidad implementada

La clase `Parcela` representa una parcela agrícola mediante su código identificador y su superficie expresada en hectáreas.

Sus principales características son:

- Almacena el código de identificación de la parcela.
- Registra la superficie en hectáreas.
- Valida que la superficie sea mayor que cero.
- Calcula el área equivalente en metros cuadrados mediante el método `areaEnMetrosCuadrados()`.

La conversión utilizada es:

**1 hectárea = 10 000 metros cuadrados.**

Por ejemplo, una parcela de 2,5 hectáreas equivale a 25 000 metros cuadrados.

## 6. Pruebas unitarias

El proyecto contiene clases de prueba para verificar el cálculo de superficies con diferentes valores de entrada, así como la validación de superficies no positivas.

Las pruebas se encuentran en el directorio:

`src/test/java/ec/edu/uagraria/finca/`

### Ejecución desde IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que Maven cargue las dependencias.
3. Abrir la ventana **Maven**.
4. Desplegar **Lifecycle**.
5. Ejecutar la tarea `test`.
6. Comprobar que la compilación termine con `BUILD SUCCESS` y que no existan fallos.

También se realizó una verificación del proyecto mediante la clonación del repositorio en una carpeta independiente, ejecutando nuevamente las pruebas.

## 7. Control de versiones y colaboración

Git se utiliza para registrar los cambios del proyecto, mientras que GitHub permite alojar el repositorio remoto y compartir el código.

**Repositorio del proyecto:**

https://github.com/ethanismaelsalazarvega-collab/finca-grupo6

### Comandos principales

Consultar el estado del repositorio:

```bash
git status
```

Agregar cambios:

```bash
git add .
```

Crear un commit descriptivo:

```bash
git commit -m "Describe el cambio realizado"
```

Sincronizar los cambios remotos:

```bash
git pull --rebase
```

Publicar los cambios:

```bash
git push
```

Consultar el historial:

```bash
git log --oneline
```

## 8. Verificación del proyecto

Se comprobó que el repositorio estuviera sincronizado con la rama principal `main`. Además, se clonó el proyecto en una carpeta nueva llamada `finca-grupo6-verificacion` y se verificó la presencia de las clases de prueba.

La ejecución de la fase `test` de Maven finalizó con `BUILD SUCCESS` tanto en el proyecto original como en la copia clonada.

El historial de Git permite consultar los commits registrados. Para demostrar la participación individual, los autores de los commits deben corresponder a las personas que realizaron efectivamente esos cambios.

## 9. Conclusión

El desarrollo del taller permitió aplicar conceptos de programación orientada a objetos con Java, organizar un proyecto mediante Maven y validar su comportamiento con pruebas unitarias. El uso de Git y GitHub facilitó el control de versiones, la publicación del código y la verificación del proyecto desde una copia clonada.

La ejecución satisfactoria de las pruebas en ambas ubicaciones confirmó que el proyecto publicado puede recuperarse y verificarse mediante el entorno de desarrollo configurado.

## 10. Enlace al repositorio

**GitHub:** https://github.com/ethanismaelsalazarvega-collab/finca-grupo6
