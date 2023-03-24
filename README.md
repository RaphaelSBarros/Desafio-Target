# Desafio-Target
Questionário relacionado à vaga de estágio


1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

RESPOSTA: SOMA = 91



2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

    Código contido no Arquivo JAVA - Questao2



3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, ___ 9

b) 2, 4, 8, 16, 32, 64, ____ 128

c) 0, 1, 4, 9, 16, 25, 36, ____ 49

d) 4, 16, 36, 64, ____ 100

e) 1, 1, 2, 3, 5, 8, ____ 13

f) 2,10, 12, 16, 17, 18, 19, ____ 200



4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

RESPOSTA: O carro e o caminhão estão à mesma distância de Ribeirão Preto ao se cruzarem, eles se encontram a 60,9 km de Ribeirão Preto.

Resolução:
  Para determinar o local em que o carro e o caminhão se cruzam podemos colocar o ponto de referência em Ribeirão Preto, então, a equação horária do carro é: x_1=v_1.t

Como o caminhão sai de um local 100 km distante do ponto de referência e se aproxima dele, sua equação horária é: x_2=100km-v_2.t

Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um deles, podemos calcular o tempo de viagem sem os obstáculos: tSO = 100km/80km/h = 1,25h

Porém, como perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem para o caminhão será de 1,25h+0,17h=1,42h. Sua velocidade média é: v2 = 100km/1,42h = 70,6km/h

Nas equações horárias podemos limpar o tempo e igualar ambas para achar o ponto em que o carro e o caminhão se cruzam:
t = x1/v1
t = x2-100km/-v2
x1 = x2 => x/v1 = x-100km/-v2
-v2*x = v1*x - v1*100km
x = v1*100km/v1+v2 = 110kmh*100km/110kmh + 70,6kmh}
x = 60,9km

Essa é a distância da cidade de Ribeirão Preto em que o carro e o caminhão se cruzam, ambos estão à mesma distância.


5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

    Código contido no Arquivo JAVA - Questao5
