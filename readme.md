# Padrões de Projeto

## CRIAÇÃO

### Singleton

private static Portao uniqueInstance = new Portao();

public static Portao getInstance() {
    return uniqueInstance;
}

### Factory Method

> Reflexão computacional
Cria interface com os metodos
Cria classes que puxam da interface
Cria factory que recebe "a interface" e retorna a classe específica correta

### Builder

Recomendado para construção de objetos complexos;
També recomendado quando se trata da construção de representações múltiplas de uma mesma classe
[class missed]


### Abstract Factory

Criação de famílias de objetos relacionados ou dependentes por meio de uma única interface e sem que a classe concreta seja especificada.

### Prototype

Instancear um objeto a partir de outro
como base para outro objeto
Crio um objeto default (com as propriedades preenchidas) e clono ele.
> É necessário também clonar sub-objetos para *garantir que não apontem para o mesmo sub-objeto*
Aluno {
Nome = "alguem",
Endereco = new Endereco {
      rua = "rua1"
   }
}

## ESTRUTURAIS

### Decorator
Adicionar funcionalidades a aplicação sem mexer no que já existe.
     Features OBRIGATORIAMENTE opcionais :D
Quando concateno mais de uma classe vai se tornando uma lista encadeada
Curso curso = new Estagio(new Tcc(new CursoGraduacao('engenharia'))))

### Bridge

Possui duas hierarquias diferentes no codigo, onde apenas as duas superclasses se conectam.
Permite então que todas as subclasses se "conectem".
[PaiA] ---> [PaiB]
|		|
|-Filho1A   |-Fiho1B
|-Filho2A	|-Fiho2B

tipo1 = ingressos
meia estudante | meia idoso | meia infantil | inteira
tipo2 = envento
show de musica | teatro | stand-up | cinema | museu

### Composite

Quando preciso comport um objeto para gerar um objeto
Corpo humano -> Sistema gastrointestinal, Sistema neuronal, Sistema mecanico
cada sistema é composto por orgãos

### Adaptor

Converte duas classes para que possam ser conectadas.  
Ex: Chamo classe celsius passando valor em Fahreiheit  
Ex: Aplicação funciona em dolar mas permite entrada em real  
Ex: Converter Nota em Conceito


