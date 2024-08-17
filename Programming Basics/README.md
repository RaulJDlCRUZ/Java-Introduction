# Conceptos básicos de programación
TODOS los lenguajes de programación emplean constructores, ya sea léxicos (delimitadores/signos de puntuación, operadores, palabras reservadas...) o sintácticos (comentarios, expresiones y declaraciones).

## Conceptos generales
Un programa es un conjunto de **sentencias**, y una sentencia es una declaración matemática o lógica, o una frase o conjunto de frases informativas. Existen distintos tipos de sentencias:

- Especificación o **declaración**: No implican una operación matemática o lógica (son descriptivas), pero son operativas, implican actividad en el ordenador.

    > x = 2

- **Ejecutables**: Implican una operación matemática o lógica (son las instrucciones).

    > x > 1 ?

- **Comentario**: Informativos, ignorados por el ordenador.

    > //


Las sentencias están formadas por distintos elementos: datos (números, letras...), instrucciones (aritméticas, de control...) y operadores (sumas, restas, incrementos...).

## Tipos de datos
Un programa puede verse como una función (o una sucesión de funciones) aplicada a varios datos, entonces, dependiendo del tratamiento que se haga a estos, los lenguajes de programación pueden clasificarse como fuerte tipado (ej: Java) o blando tipado (ej: Python).

A grandes rasgos, existen **dos tipos de datos**: primitivos y definidos por el usuario.

### Primitivos
#### Numéricos

<div align="center">

|Nombre|_Bits_ usados|Valor mínimo|Valor máximo|
|---:|:----------------:|:-----------:|:-----------:|
|`byte`|8|-128|127|
|`short`|16|-32768|32767|
|`int`|32|-2147483648|2147483647|
|`long`|64|$< -9.22 \times 10^{18}$|$>9.22 \times 10^{18}$|

Tipos de enteros en Java

</div>

---

<div align="center">

|Nombre|_Bits_ usados|Valor mínimo|Valor máximo|
|---:|:----------------:|:-----------:|:-----------:|
|`float`|32|$\simeq 1.4\times10^{-45}$|$\simeq 3.4\times10^{38}$|
|`double`|64|$\simeq 4.9\times10^{-324}$|$\simeq 1.7\times10^{308}$|

Tipos de reales en Java

</div>

#### No-Numéricos

<div align="center">

|Conjunto|_Bits_ usados|Número de caracteres|
|---:|:----------------:|:-----------|
|UNICODE|16|65536|
|ASCII|7|128|

Tipos de carácter (`char`)

</div>

- Los caracteres están en orden alfabético y el número de código aumenta en el mismo orden alfabético
- Un literal (valor fijo o _fixed_) de un tipo de carácter se denota con comillas simples, como, por ejemplo, `'A'`, `'B'`
- Es **diferente** de una cadena (`string`)

> `char c = 'a'` $\rightarrow$ `++c` $\rightarrow$ `c = 'b'`

---

<div align="center">

|Nombre|_Bits_ usados|Valores (2)|
|---:|:----------------:|:-----------|
|`boolean`|1|Verdadero (`true`) o Falso (`false`)|

Tipos de datos lógicos

</div>

### Variables y constantes

Una **variable** es el nombre que asignamos para una posición (posiciones) de memoria usada para almacenar un valor de cierto tipo de datos. Las variables deben declararse (definirse) antes de usarse. 

- La sintaxis de la **declaración** de una variable en Java es:

    ```java
    tipo_dato nombre_variable;
    ```

- Se pueden declarar **varias** variables en una misma sentencia:

    ```java
    int total, cuenta, suma;
    ```
- Las variables pueden inicializarse (darles un valor inicial) en la propia declaración:

    ```java
    int total = 0, cuenta = 20;
    float precioUnitario = 49.32;
    ```

Por otro lado, una **constante** es una entidad similar a una variable, pero con la diferencia de que tras su asignación el valor que contiene **no se puede cambiar** en el programa.

- Sintaxis:

    ```java
    final tipo_de_dato  nombre_de_la_variable;
    ```

- Un ejemplo sería:

    ```java
    final double e=2.718281828;
    ```

- **Identificadores** en Java: pueden construirse con letras, dígitos, el carácter de subrayado (_), y el signo de dólar ($). _Nunca empezarán por un dígito_, pero sí pueden tener cualquier longitud.
    - Java distingue entre letras mayúsculas y minúsculas, lo que significa que si se declara una variable llamada `Data`, será diferente de otra llamada `data`.

---
**Ejercicio**

Para convertir de grados Celsius a grados Kelvin hay que sumarle 273,15 unidades a los grados Celsius. ¿Cómo se declararían las variables y constantes en Java si quisiésemos transformar 10 grados celsius a Kelvin?

```java
double grados_celsius = 10.0;
final double diferencia_grados_kelvin = 273.15;
double solucion = grados_celsius + diferencia_grados_kelvin;
```

#### Alcance

Es la Zona/bloque del programa en el que está definida. 

- Un programa se organiza en bloques
- En Java el bloque se representa con `{}`
- En Java el alcance de una variable es el **bloque** en el que está definida
- Si se intenta utilizar la variable fuera del bloque en el que ha sido declarada, se produce un **error** de variable no declarada

### Conversión de tipos

Tipos de conversiones:
- De ensanchamiento o promoción

    |Origen|Destino|
    |-----:|:------|
    |`byte`|`short, int, long, float, double`|
    |`short`|`int, long, float, double`|
    |`char`|`int, long, float, double`|
    |`int`|`long, float, double`|
    |`float`|`double`|
    |`double`|---|
    |`long`|`double`|

- De estrechamiento o contracción

    |Origen|Destino|
    |-----:|:------|
    |`byte`|`char`|
    |`short`|`byte, char`|
    |`char`|`byte, short`|
    |`int`|`byte, short, char`|
    |`long`|`byte, short, char, int`|
    |`float`|`byte, short, char, int, long`|
    |`double`|`byte, short, char, int, long, float`|

Los `boolean` no se pueden convertir a ningún otro tipo y viceversa.

Ahora sabemos que existen conversiones de promoción o estrechamiento, ¿pero cómo se realizan este tipo de conversiones? Tres mecanismos:

- **Conversión por asignación**. Se realiza cuando un valor de un tipo determinado se asigna a una variable de otro tipo. Por ejemplo, si dinero es una variable de tipo `float` y euros es una variable de tipo `int`:

    ```java
    dinero = euros;
    ```

    Sólo se permiten conversiones de **ensanchamiento**.

- **Conversión por promoción aritmética**. Ocurre automáticamente cuando se realiza una operación aritmética como la suma o la división. Por ejemplo, si `resultado` es una variable de tipo `float`, suma es también una variable de tipo `float`, y contador es una variable de tipo `int`

    ```java
    resultado = suma / contador;
    ```

    La promoción aritmética es siempre de **ensanchamiento**.

- **Conversión con "moldes"** (_casting_). Se utiliza un mecanismo específico para realizar la transformación. El molde es la instrucción que produce la conversión de tipo.
Se pueden realizar conversiones de **contracción** y de **ensanchamiento**. En Java, el molde es un **operador** que se especifica como un nombre de tipo colocado entre _paréntesis_ a la izquierda del dato a convertir.

    ```java
    (Tipo) variable_a_convertir;
    ```

    Por ejemplo:

    ```java
    int euros;
    double dinero=30.2;
    euros = (int) dinero;
    ```

### Cadenas de texto '`strings`'

Conjuntos de caracteres alfanuméricos

> Como curiosidad, en Java, son objetos de clase 'String' del paquete "`java.lang`"

- Creación de una cadena, dos formas:

    ```java
    String cadena = new String("Esto es un ejemplo");
    String cadena = "Esto es un ejemplo";
    ```

- En Java los caracteres de una cadena están numerados:

    ```
    Esto es un ejemplo 	  Cadena
    012345678901234567    Numeración
    ```

- Funcionalidades que se pueden hacer con un String:

    ```java
    chain2=chain1; // Asignación de cadenas
    chain3=chain1+chain2; // Concatenación de cadenas
    length() 
    indexOf ('character')
    lastIndexOf('character')
    charAt(n)
    substring(n1, n2) // Búsqueda (y extracción?) de caracteres o subcadenas en una cadena
    toUpperCase()
    toLowerCase()
    equals(String) // Comparación de cadenas (son iguales?)
    equalsIgnoreCase(String)
    valueOf(n)
    ```

- Por ejemplo:

    ```java
    String cadena1 = "Example";
    int tam = cadena1.length();
    ```

## Instrucciones

Un programa se escribe en un lenguaje concreto y en él se van indicando las distintas acciones a través de determinadas instrucciones. Dichas instrucciones son generales, aunque su sintaxis específica depende del lenguaje.

- Para el tipo **de ramificación**: _Pulsar aquí para ver más detalles_.

### Asignaciones

Sirven para dotar de valor a las variables. En Java se usa `=`. Así, para asignar el valor `5.0` a una variable real llamada `total` haríamos:

    ```java
    total = 5.0;
    ```

    NO representa una igualdad, sino la colocación del valor determinado en la variable.

    > :warning: ¡ No es lo mismo `total == 5.0`  que `total = 5.0` !
    

### Instrucciones de E/S **`Streams`**

Un _stream_ es una secuencia ordenada de datos de longitud indeterminada. Es una abstracción de fuentes y destinos externos de datos que permiten leer y escribir de ellos independientemente del tipo exacto de fuente o destino.

    **No** hay sentencias de entrada y salida en el lenguaje Java. La entrada y salida se realiza usando bibliotecas de clases predefinidas. La mayoría de las operaciones de E/S están definidas en el paquete `java.io` de la API de Java.

<div align="center">

|_Stream_|Propósito|Dispositivo (_default_)|
|---:|:----------------:|:-----------|
|`System.in`|Leer|Teclado|
|`System.out`|Escribir|Pantalla|
|`System.err`|Salida de errores|Pantalla|

Streams de lectura y escritura estándar (paquete `java.lang`)

</div>

- Salida estándar:
    - `System.out.print();`
    - `System.out.println();`

<div align="center">

|Secuencia de escape|Significado|
|---:|:-----------|
|`\t`|Tabulador|
|`\n`|Línea nueva|
|`\'`|Comilla simple|
|`\"`|Comillas dobles|
|`\\`|Barra invertida|
|`\r`|Retorno de carro|
|`\\b`|_Backspace_|

Secuencias de escape (`\`)
</div>

---

<div align="center">

|Ejemplo `System.out.print`|Resultado|
|---:|:-----------|
|`System.out.print("\tHola");`|$\hspace{1cm}$ Hola|
|`System.out.print("\'Hola");`|'Hola'|
|`System.out.print("\"Hola");`|"Hola"|
|`System.out.print("\\Hola\\");`|\Hola\ |

Ejemplo de "Hola" con diferentes secuencias de escape

</div>

```java
class Example {
  // Example of the structure of a program in Java
  public static void main(String [] args) {

    // Variables definition
    double total = 0, sum;
    total = 10.0;
    sum = 5.0;

    // Operation
    total = total + sum;
    System.out.println("total:" + total);

  } /* End of method main */
} /* End of class Example */

```
<div align="center">
Ejemplo de la estructura de un programa en Java y el uso de comentarios
</div>

---

```java
class Writing {
    public static void main(String[] args) {
        int i, j;
        i = 1;
        j = 3;
        System.out.print("Without end of line");
        System.out.print("i :" + i);
        System.out.print("j :" + j);
        System.out.println();
        System.out.println("With end of line");
        System.out.println("i :" + i);
        System.out.println("j :" + j);
    } //End of method main
} //End of class
```

<pre>
Without end of line i: 1 j: 3
With end of line 
i: 1
j: 3
</pre>

<div align="center">
Ejemplo de ejecución. Diferencia entre secuencias de escape 1
</div>

<p>
</p>

#### Lectura con `Scanner`

> :information_source: A partir de la versión 1.5 de Java con la clase `Scanner` (En paquete `java.util`) y el método `printf()`

```java
useLocale(Locale local)

    Locale.US: EEUU
    Locale.ES: España

next() // Lee como cadena el primer “token” que encuentra
nextLine() // Lee como una cadena todos los caracteres (incluidos blancos) hasta fin de línea
nextInt() // Lee un int
nextDouble() // Lee un double
nextFloat() // Lee un float
```
<div align="center">
Métodos con el "escáner" de Java
</div>

<p>
</p>


```java
import java.util.*;

class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Insert a string: ");
        String cad1 = sc.nextLine();

        System.out.print("Insert a string without backspaces: ");
        String cad2 = sc.next();

        System.out.print("Insert a double: ");
        double d = sc.nextDouble();

        System.out.print("Insert an integer: ");
        int i = sc.nextInt();
 ...
```

<div align="center">
Ejemplo de E/S con Scanner
</div>

<p>
</p>

#### Escritura con `printf()`

    %[anchura][.precisión]especificador

- **Anchura**: número que nos da el número mínimo de caracteres a ser impresos. Si el valor a ser impreso es más corto que este número el resultado se rellena de blancos
- **Precisión**: _número_ máximo de caracteres a escribir en la salida. Para formatos en punto flotante, `'e'`, `'E'`, y `'f'` la precisión es el número de dígitos tras la coma (punto) decimal
- **Especificador**: 

<div align="center">

|Espcf.|Significado|Ejemplo|
|---:|:----------:|:-------|
|`d`|Entero decimal con signo|123|
|`e`|Notación científica (mantisa/exponente) usando el carácter _e_|1.234567e+2|
|`E`|Notación científica (mantisa/exponente) usando el carácter _E_|1.234567E+2|
|`f`|Reales en punto (coma) flotente|123.4567|
|`s`|`String`|Ejemplo|

Especificadores en Java 
</div>

El `%` se coloca en la posición donde queramos que se escriba el **argumento** con el formato indicado y al _final_ de `printf` se indican todos los argumentos a imprimir.


```java
    ...
        System.out.printf(Locale.US, 
            "\nThe inserted data String type are:"+ 
            "\ncad1: %s"+
            "\ncad1: %20s"+
            "\ncad2: %s"+
            "\ncad2: %10.5s\n",
            cad1, cad1, cad2, cad2);

        System.out.printf(Locale.US, 
            "\nThe inserted doubles are:"+ 
            "\ndouble: %7.4f"+
            "\ndouble: %7.3f"+
            "\ndouble: %7.2f\n", d,d,d);

        System.out.printf(Locale.US, 
            "\nThe inserted integers are:"+ 
            "\ninteger: %d"+
            "\ninteger: %5d", i,i);

    } //End of main method
} //End of Class IO
```

<div align="center">
Ejemplo de impresión con formato, continuación del ejemplo de "escáner"
</div>

<p>
</p>

<pre>
Insert a string: This is an example
Insert a string without backspaces: Example
Insert a double: 123.4567
Insert an integer: 123

The inserted data String type are:
cad1: This is an example
cad1:   This is an example
cad2: Example
cad2:      Examp

The inserted doubles are:
double: 123.4567
double: 123.457
double:  123.46

The inserted integers are:
integer: 123
integer:   123
</pre>

<div align="center">
Ejemplo de ejecución del código anterior
</div>



```java
class Example{
    public static void main(String [ ] args) {
        System.out.println ("He said:\" Get off \" ");
    } // End of method main
} // End of class Example
```

<pre>
He said: "Get off"
</pre>

<div align="center">
Otro ejemplo de instrucciones E/S
</div>

## Operaciones

A menudo, las sentencias de programación involucran **expresiones**: combinaciones de operadores y operandos usados para realizar un cálculo.

- Un operador es una entidad que representa una operación
    - Unarios 
    - Binarios
    - ...
- Un operando es una entidad que experimenta el efecto de un operador.

En los lenguajes de programación los operadores son **genéricamente** (semánticamente) los mismos y admiten una clasificación en función del tipo de operación que realizan.

### Operadores aritméticos y de asignación
Los operadores aritméticos son operadores binarios que aplican las operaciones aritméticas.

<div align="center">

|Operación|Operador|
|---:|:-------|
|Suma|`+`|
|Resta|`-`|
|Producto|`*`|
|División|`/`|
|Módulo (resto de división con caja)|`%`|

Operadores aritméticos
</div>

#### Orden de operadores aritméticos

    PARÉNTESIS > (* , / , %) > (+, -)

#### Combinación con asignación

<div align="center">

|Operador|Ejemplo|Equivalencia|
|---:|:------:|:---------------|
|`+=`|`a+=b`|`a=a+b`|
|`-=`|`a-=b`|`a=a-b`|
|`*=`|`a*=b`|`a=a*b`|
|`/=`|`a/=b`|`a=a/b`|
|`%=`|`a%=b`|`a=a%b`|

Combinación de operador aritmético y asignación
</div>

### Incrementos y decrementos

Estos operadores son **unarios** (monarios) que suman (incremento) o restan (decremento) una unidad a un operando entero o real.

<div align="center">

|Operación|Operador|
|---:|:-------|
|Incremento de una unidad|`++`|
|Decremento de una unidad|`--`|

Operadores unarios
</div>

```java
    counter++; // Equivale a: counter = counter+1;
    value--; //	Equivale a : value = value-1;
```

Estos operadores pueden usarse como **prefijos** o como **sufijos**.

- Cuando actúan sobre **una sola variable**, como en el ejemplo anterior, el resultado es el _mismo_.

    ```
    ++contador equivale a contador++
    --valor equivale a valor--
    ```
    
- Cuando estos operadores se usan en una **expresión**, el incremento o decremento se realiza _después (sufijo) o antes (prefijo) de usar el valor_ de la variable en la expresión.

    ```
    contador=5;

    a) valor=contador++; b) valor=++contador;

    System.out.println("valor: "+valor); 
    System.out.println("contador: "+contador); 
    ```

### Operadores relacionales

Expresan las diferentes relaciones entre dos entidades u operandos.

<div align="center">

|Relación|Sintaxis|
|---:|:-------|
|Igual a|`==`|
|No igual a|`!=`|
|Mayor que|`>`|
|Menor que|`<`|
|Mayor o igual que|`>=`|
|Menor o igual que|`<=`|

Tipos de operadores relacionales
</div>

### Operadores lógicos

Los operadores lógicos son utilizados por la **lógica proposicional** para admitir o rechazar proposiciones (_sentencias lógicas_, en nuestro caso _relaciones_). Implican una actuación sobre relaciones.

<div align="center">

|Significado|Operador|
|---:|:-------|
|"y" lógico (AND)|`&&`|
|"o" lógico (OR)|`\|\|`|
|"no" lógico (NOT)|`!`|
|"o" exclusivo (XOR)|`^`|

Tipos de operadores lógicos
</div>

> **Precedencia**: `!`  >  `^`  >  `&&`  >  `||`

#### Semántica - Tablas de verdad

La tabla de verdad de una sentencia es una tabla en la que se presentan todas las posibles interpretaciones de las variables proposicionales que constituyen la sentencia y el valor de verdad de la sentencia para cada interpretación.

<div align="center">

|X|Y|X $\wedge$ Y ( X && Y )|
|:-:|:-:|:--:|
|T|T|T|
|T|F|F|
|F|T|F|
|F|F|F|

|X|Y|X $\vee$ Y ( X \|\| Y )|
|:-:|:-:|:--:|
|T|T|T|
|T|F|T|
|F|T|T|
|F|F|F|

|X|Y|X $\veebar$ Y ( X ^ Y )|
|:-:|:-:|:--:|
|T|T|F|
|T|F|T|
|F|T|T|
|F|F|F|

|X| $¬$ X ( !X )|
|:-:|:--:|
|T|F|
|F|T|

Tablas de verdad
</div>