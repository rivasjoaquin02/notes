
# Variables aleatorias

> [!Note]  
> Es una **[variable | funcion]** aleatoria cuando a cada punto muestral se le asigna un numero 
> $$X: S \to R$$
> $$S \to X(S)$$
> - **discreta**: contables en numeros naturales
> 	- Número de bolas blancas en una urna. 
> 	- Número de alumnos pertenecientes a un grupo. 
> 	- Número de personas que llegan a una cola en un intervalo de tiempo T
> - **continua**: $\to \infty$
> 	- La altura de una persona. 
> 	- El tiempo que tarda en transmitir cierta información. 
> 	- La edad de una persona


> [!example]- Urna de Bolas 2.0
> Consideremos una urna que contiene 5 bolas: 3 blancas y 2 negras. 
Si realizamos el experimento de extraer una muestra de tamaño 2, de una en una sin reemplazamiento, la cantidad de bolas blancas que contiene cualquiera de las muestras extraídas es una variable aleatoria.
> 
> Definamos la variable aleatoria:
> **X**: Número de bolas blancas en la muestra. 
> **X**: 0,1,2 (posibles valores que toma X) 
> 
> $N(S) = 5·4 = 20$$S = \{BB, BB, BN, BN, BB, BB, BN, BN, BB, BB, BN, BN, NB, NB, NB, NN, NB, NB, NB, NN\}$
> $P(X = 0) = 2/20 = 0.1$ 
> $P(X = 1) = 12/20 = 0.6$ hay exactamente una bola blanca 
> $P(X = 2) = 6/20 = 0.3$ 
> 
> $P(X \gt 0) = P(X \ge 1)$ hay al menos una bola blanca
> 
> $P(X = 0) + P(X = 1) + P(X = 2) = 0.1 + 0.6 + 0.3 = 1$

> [!example]- Moneda lanzada 2 veces
> 
Al lanzar una moneda 2 veces, el espacio muestral es: 
S = \{CC, CE, EC, EE\}. 
> 
> Definición de la variable aleatoria: 
> **X**: número de caras que aparecen.
> 
> Podemos asociar un valor numérico para X a cada punto muestral, como se muestra en la tabla: 
> 
> | Punto muestral | CC | CE | EC | EE |
> | ---- | ---- | ---- | ---- | ---- |
> | X | 2 | 1 | 1 | 0 |
>
> Otras variables aleatorias podrian ser
> - el cuadrado del número de "caras"
> - el número de "caras" menos el número de “escudos"


## Funcion de probabilidad

> Probabilidad en un Punto

> [!Note] Es la Correspondencia entre el valor de una variable aleatoria y su valor de probabilidad
> $$X \to P(X = x)$$
> Cuando la probabilidad toma un valor real
> (si fuese un intervalo entonces seria una func de distribucion)

- Lanzamiento de un dado legal. 
- $p(x) = 1/6$ igual para $x = 1, 2, 3, 4, 5, 6$
- $p(x) = P(X = 1) = 1/6$ ó $P(X = 3) = 1/6$


> [!Faq] Propiedades:
> - $0 \le p(X) \le 1$
> - $\sum p(x) = 1$


> [!example]- Posibles funciones de probabilidad del ej1
> 
> | X | 0 | 1 | 2 |
> | ---- | ---- | ---- | ---- |
> | p(x) | 0.1 | 0.6 | 0.3 |
> 
> $p(X > 0) = 0.6 + 0.3 = 0.9$
> $p(0 <= X <= 1) = 0.1 + 0.6 = 0.7$
> $P(X < 1) = 0.1$
> $P(X > 2) = 0$

## Funcion de densidad

La funcion de probabilidad en una continua se llama **funcion de densidad** y en vez de ser $p(x)$ es $f(x)$ para todo x real


> [!Faq] Propiedades:
> - $f(x) \ge 0$: para toda x
> - $\int_{-\infty}^{\infty} f(x) dx =1$

## Función de distribución

> probabilidad en un intervalo

Si la funcion de probabilidad toma un **intervalo**
$$F_X(t) = P(X \le t)$$

**discreta**:     $F_x(t) = P(X \le t) = \sum_{x\le t}p(x)$
**continua**:   $F_x(t) = P(X \le t) = \int_{-\infty}^tf(x)dx$

> [!Faq] Propiedades
> 1. funcion no decreciente
> 2. $F_X(-\infty) = 0$
> 3. $F_X(+\infty) = 1$
> 4. * $P(x \gt t) = 1 - P(x \le t) = 1 - F_x(t)$
> 5. $P(a \lt x \le b) = F_x(b) - F_x(a)$
> 6. $P(X) = F_x(X) - F_x(X-1)$


## Características numéricas de una v.a

### Valor Esperado o promedio: 

El valor caracteristico que representa al conjunto de las variables aleatorias

- **discreta:**    $E(X) = \mu = \sum_{x \in R} [x * p(x)]$
- **continua:**   $E(X) = \mu = \int_{-\infty}^{\infty} [x * f(x)]dx$


> [!Note] Propiedades:   (no import)
> $E(c) = c$
> $E(cX) = cE(X)$
> $E(X+Y) = E(X) + E(Y)$
> $E(X*Y) = E(X) * E(Y)$ si X,Y son indep


### Varianza: 

Medida de Dispersion de los valores de la v.a alrededor de la media $\mu$

Cuando el conjunto es muy homogenio se espera que el valor sea un elemento del centro de ese conjunto y la variabilidad sea muy pequeña
$$V(X) = E[X - E(X)]^2 = E(X^2) - (E(X))^2$$
**discreta**: $V(X) = σ^2 = \sum_{x \in R} x^2 p(x) - (E(X))^2$
**continua**: $V(X) = σ^2 = \int_{-\infty}^{\infty} x^2 p(x)dx - (E(X))^2$

$σ$ es la desviacion estandar y obviamente es: $$σ = \sqrt{V(X)}$$

> [!Note] Propiedades:   (no import)
> $V(c) = 0$
> $V(cX) = c^2V(X)$
> $V(X+Y) = V(X) + V(Y)$ si X,Y son indep


> [!example]- (E, V, σ) en el ej1: 
> 
> | X | 0 | 1 | 2 |
> | ---- | ---- | ---- | ---- |
> | p(x) | 0.1 | 0.6 | 0.3 |
>
> valor esperado: $E(X) = (0*0.1) + (1*0.6) + (2*0.3) = 1.2$
> varianza:
>	$V(X) = \sum x^2 p(x) - (E(X))^2$
>	$V(X) = (0^2*0.1) + (1^2*0.6) + (2^2*0.3) - (1.2)^2 = 0.36$
> desviacion tipica: 
>	$σ = \sqrt{V(X)}$
>	$σ = \sqrt{0.36} = 0.6$


