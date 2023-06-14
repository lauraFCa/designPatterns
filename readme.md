# Padrões de Projeto

## CRIAÇÃO

### Singleton

Uma única instancia do objeto, ao longo de todo o projeto.

```
private static Portao uniqueInstance = new Portao();

public static Portao getInstance() {
    return uniqueInstance;
}
```

### Factory Method

> Reflexão computacional

Cria interface com os metodos  
Cria classes que puxam da interface  
Cria factory que recebe "a interface" e retorna a classe específica correta  

### Builder

Recomendado para construção de objetos complexos;  
També recomendado quando se trata da construção de representações múltiplas de uma mesma classe  

**Caso de uso**: Uma empresa de construção que oferta diversos tipos de construão, como Prédios, Casas, Hotéis, Apartamentos, entre outros.
Uma construção envolve muitos parametros como tipo da construção, se possui piscina ou não, se será feito o projeto elétrico, hidráulio, ou não - dentre outras variáveis.

### Abstract Factory

Criação de famílias de objetos relacionados ou dependentes por meio de uma única interface e sem que a classe concreta seja especificada.

**Caso de uso:** Criação de um filme que possui vários parametros, sendo dois deles a Produção e o Roteiro.  
Foram criadas interfaces e métodos para a criação/definição do roteiro (roteiristas responsáveis, quantidade de páginas, tempo do filme, etc) e da produção (membros, empresas terceirizadas, locação de espaços, etc).

### Prototype

Instancear um objeto a partir de outro como base para outro objeto.  
Crio um objeto default (com as propriedades preenchidas) e clono ele.  

> É necessário também clonar sub-objetos para *garantir que não apontem para o mesmo sub-objeto*

```
Aluno {
Nome = "alguem",
Endereco = new Endereco {
      rua = "rua1"
   }
}
```

**Caso de uso**: Categorização de canetas, que possuem parametros e podem ser de diferentes marcas (que possuem código e lote).

## ESTRUTURAIS

### Decorator

Adicionar funcionalidades a aplicação sem mexer no que já existe.  
     Features OBRIGATORIAMENTE opcionais :D

Quando concateno mais de uma classe vai se tornando uma lista encadeada  
Curso curso = new Estagio(new Tcc(new CursoGraduacao('engenharia'))))

**Caso de Uso**: Empresa com diferentes planos de ceular, e pacotes adicionais.  
Pode ter planos Controle, Pré-pago, etc.  
Esses planos podem, ou não, ter adicionais como chamada internacional, whatsapp ilimitado e internet (5g).


### Bridge

Possui duas hierarquias diferentes no codigo, onde apenas as duas superclasses se conectam.  
Permite então que todas as subclasses se "conectem".  
```
[PaiA] ---> [PaiB]  
|           |  
|-Filho1A   |-Fiho1B  
|-Filho2A   |-Fiho2B
```

**tipo1** = ingressos  
meia estudante | meia idoso | meia infantil | inteira  
**tipo2** = envento  
show de musica | teatro | stand-up | cinema | museu

**Caso de Uso**: Tipos diferentes de ingresso para tipos diferentes de eventos.  
*Eventos*: Musica (festivais/shows), Teatro, Cinema, etc.  
*Ingressos*: Meia entrada, Inteira, Premium, etc.


### Composite

Quando preciso comport um objeto para gerar um objeto.  

Corpo humano -> Sistema gastrointestinal, Sistema neuronal, Sistema mecanico  
Cada sistema é composto por orgãos

**Caso de Uso**: Solicitação de Exames de partes / sistemas / órgãos do corpo humano.  
*Sistema*: Respiratório, Digestivo, Circulatório, etc.  
*Órgãos*: Apendice, Pulmão, Cérebro, etc.


### Adaptor

Converte duas classes para que possam ser conectadas.  
Ex1: Chamo classe celsius passando valor em Fahreiheit  
Ex2: Aplicação funciona em dolar mas permite entrada em real  
Ex3: Converter Nota em Conceito

> Utiliza IFs e ELSEs  

Cenários de teste:
- Ida correta
- Ida errada
- Volta correta
- Volta errada

**Caso de Uso**: Sistema de processamento de imagens que precisa delas em RGB mas pode receber em Hexadecimal.  
Trabalha apenas as cores: Vermelho, Azul, Amarelo, Branco, Preto e Verde


### Façade (Fachada)

Esconder implementações tendo apenas um ponto de acesso.  
O ponto principal com as agregações necessárias é o Facede.

Ex: 
- Aluno - pode formar?
- AlunoFacade - verifica se ele pode formar, tem a agregação com todas as outras classes
- Outras classes (biblioteca, financeiro, etc) - verificam se o aluno tem pendencia na area delas

Liberação de um paciente do hospital:
- Pendencias na lanchonete?
- Passou na farmácia?
- Exames enviados ao paciente?
- Médico deu a liberação?
- Enfermeiro disponivel para liberação?

**Caso de Uso**: Liberação de um paciente do hospital:
- Exames enviados ao paciente?
- Médico deu a liberação (alta)?
- Acompanhante presente para liberação?
- Enfermeiro disponivel para liberação?


### Padrão Proxy

Objetivo: econimizar recurso.  
Carrega objetos sob demanada.

- Proxy Dados: Dados carregam a medida que são necessários.
- Proxy de Segurança: dados não carregam por falta de acesso

**Caso de Uso**: Acesso aos dados de pacientes em um hospital.


### Padrão Flyweight

Objetivo: econimizar recurso.  
Não utilizar objetos iguais repetidos.

**Caso de Uso**: edu.Venda de remédios em uam farmácia, que geralmente vende sempre o mesmo tipo de medicamento.  
Ex: Analgésico, Fitoterápico, Anti-inflamatorio

> Neste caso, cada venda se refere apenas a um remédio.

## COMPORTAMENTAIS

### Chain of Responsabilities

Cadeia de Responsabilidades - permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.  
Implementa-se checagens sequenciais (ex - autenticação de 3 fatores).

**Caso de uso**: Acesso a um banco de dados  
Endereço de IP liberado > usuário autenticado > usuário com permissão > base de dados possui a tabela buscada

_Not done_

### Iteration

Padrão que permite percorrer elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc.)  
O foco é fazer a travessia dos elementos de uma estrutura de dados complexas sequencialmente, tais como uma árvore.  

![Iterator pattern](https://refactoring.guru/images/patterns/diagrams/iterator/problem2.png?id=f9c1a746c787320291c85fdc2a314192)  
img from [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/iterator)

**Caso de uso**: Sistema de gerenciamento de uma concessionaria.    
Possui objeto complexo - Cliente contém multiplos veiculos e cada veiculo pode ter várias revisões.

```
ClienteX {
    DadosCliente {
        nome, 
        cpf
        telefone,
        email
    },
    Veiculo {
        marca,
        modelo,
        ano,
        Revisoes [
            {
                data,
                preco,
                kilometragem,
                itens-revisados = Dict<string, bool> {
                    "motor": false,
                    "oleo": true,
                    "balanceamento": true,
                }
            }
        ]
    }
}
```

### Command (ou Action)

Objetivo: separar as funções do sistema em classes diferentes;  
Uma classe gerencia as tarefas, cada tarefa está em uma classe única, que implementa uma interface genérica *Tarefa*.  
A classe que gerencia não tem tarefas, apenas recebe uma injetada.

```Livro: Anti-Padrões```

**Caso de uso:** Entrega de uma compra seguindo o fluxo  
````
Enviado, ✔
EmTransporte, ✔
Recebido, ✔ 
Cancelado, 
Devolvido 
````

Administradora = Marca o estado do pacote (pedido)


### Observer

Útil quando um objeto precisa ser atualizado quando outro muda.  
Exemplo principal - notificações!

**Caso de uso**: Medidor de usina hidroeletrica alerta central quando pressao em uma seção da usina está muito acima do esperado;

Central = conecta ao medidor
Medidor = emite alerta para a central


### Mediator

**Caso de uso:** Cliente solicita algo da empresa.  
Solicitação de Ajuda, Solicitação de Desconto, etc...
Departamento = Financeiro

### Memento

Base: Padrão State  

**Caso de Uso**: Estados de um pedido de compra online.  
Pedido Confirmado > Pedido enviado > Pedido entregue  
Podendo haver também: Pedido Cancelado, Pedido Extraviado, Pedido devolvido;


### Interpreter

No padrao Interpreter é somente para fazer mudança na classe Aluno, e classe Escola, do nosso "jeito" 
O restante das classes não é para fazer alterações

**Caso de uso:** Desconto de um produto em uma loja.  
Poderia também ser aplicada alguma taxa em um produto, soma de múltiplos produtos, etc.

### Template Method

Cria super-classe com tudo, e o que for específico passa pra sub-classes.  
Criar literalmente um template de algo;

**Caso de uso:** Executar requisições via API  
Template é de GET e POST. O conteúdo do request e a URL muda de acordo com o uso da sub-classe.

### Visitor

**Caso de uso:** Setor de gestão de empresa que lida com tipos diferentes de entidades: Boleto, Ordem de servço, Contrato 

### Strategy

**Caso de uso:** Execução de querys no banco.  
Recebo string conteudo da query - Table, WHERE, VALUE
