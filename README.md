Atividade 1 (diagnóstica)
ATIVIDADE AULA 14/05/2025

RESPOSTAS

1 - Dada uma Classe Pai com métodos private A, public B e protected C e uma Filha, quais
métodos podem ser utilizados pela filha?

r: somente o método public B e protected C, desde que o método c seja acessado dentro da classe pai.

2 - Dada uma Classe Pai com métodos public B que emite a seguinte mensagem “Eu sou o
método B do Pai” e uma Filha que sobrescreve o método B com a seguinte mensagem “Eu
sou o método B da Filha”. Ao instanciar a classe Filha e realizar a chamada do método
B, qual mensagem será exibida?

r: Eu sou o método B da filha.

3 - Dada uma Classe Pai com métodos private E que emite uma mensagem e uma Filha com a implementação do método E com outra mensagem. Podemos dizer que a classe filha sobrescreveu o método E, porquê?

r: porque ela implementando o método E, significa que a classe onde está esse método E ou o próprio método E, irá se comportar seguindo as instruções de quem fez a implementação, nesse caso a classe filha.

4 - Dada uma Classe Pai com métodos public B com 2 parâmetros, um int e um String,
considere os seguintes métodos e indique qual realiza uma sobrecarga.
a. public B com 2 parâmetros, um int e um String
b. public b com 2 parâmetros, um int e um String
c. public Bê com 2 parâmetros, um String e um int
d. public B com 2 parâmetros, um String e um Int

r: letra b, o método public b causou uma sobrecarga pois têm o mesmo nome e mesma ordem dos parâmetros int e String, o que torna métodos semelhantes.

5 - Dada uma interface com método public A, private B e protected C e uma classe D que
implementa a interface indique quais desses métodos são obrigatórios de serem
implementados na classe D.

r:  o método public A, pois será lido em qualquer classe e em qualquer lugar e o método private B, pois dentro da própria classe D, um método privado pode ser lido sem a necessidade de uso do método getter.

6 - Após responder as perguntas, implemente as soluções para verificar se a sua resposta está correta.
