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
[class missed]


### Abstract Factory

Criação de famílias de objetos relacionados ou dependentes por meio de uma única interface e sem que a classe concreta seja especificada.

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

## ESTRUTURAIS

### Decorator

Adicionar funcionalidades a aplicação sem mexer no que já existe.  
     Features OBRIGATORIAMENTE opcionais :D

Quando concateno mais de uma classe vai se tornando uma lista encadeada  
Curso curso = new Estagio(new Tcc(new CursoGraduacao('engenharia'))))

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

### Composite

Quando preciso comport um objeto para gerar um objeto.  

Corpo humano -> Sistema gastrointestinal, Sistema neuronal, Sistema mecanico  
Cada sistema é composto por orgãos

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

### Padrão Proxy

Objetivo: econimizar recurso.  
Carrega objetos sob demanada.

- Proxy Dados: Dados carregam a medida que são necessários.
- Proxy de Segurança: dados não carregam por falta de acesso

### Padrão Flyweight

Objetivo: econimizar recurso.  
Não utilizar objetos iguais repetidos.

## COMPORTAMENTAIS

### Chain of Responsabilities

Cadeia de Responsabilidades - permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.  
Implementa-se checagens sequenciais (ex - autenticação de 3 fatores).

**Caso de uso**: Acesso a um banco de dados  
Endereço de IP liberado > usuário autenticado > usuário com permissão > base de dados possui a tabela buscada

### Iteration

Padrão que permite percorrer elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc.)  
O foco é fazer a travessia dos elementos de uma estrutura de dados complexas sequencialmente, tais como uma árvore.  

![Iterator pattern](iterator.png)
img from [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/iterator)

**Caso de uso**: Sistema de gerenciamento de uma oficina mecanica  
Possui objeto complexo - ClienteX  
´´´
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
´´´

### Command (ou Action)

Objetivo: separar as funções do sistema em classes diferentes;  
Uma classe gerencia as tarefas, cada tarefa está em uma classe única, que implementa uma interface genérica *Tarefa*.  
A classe que gerencia não tem tarefas, apenas recebe uma injetada.

```Livro: Anti-Padrões```

**Caso de uso:** Entrega de uma compra seguindo o fluxo  
PedidoConfirmado > PacoteSeparado > PacoteEnviado > PacoteEmTransporte > PacoteEntregue

DepartamentoGestao = Marca o estado do pedido

### Observer

Útil quando um objeto precisa ser atualizado quando outro muda.  
Exemplo principal - notificações!

**Caso de uso**: Medido de usina hidroeletrica alerta centra quando pressao em uma seção da usina está muito acima do esperado;

### Mediator

**Caso de uso:** Cliente solicita algo da empresa.  
Pode ser uma Dúvida Técnica ou Dúvida Financeira;
Pode ser uma Melhoria Técnica ou Melhoria Financeira;

### Memento

Base: Padrão State  

### Interpreter

No padrao Interpreter é somente para fazer mudança na classe Aluno, e classe Escola, do nosso "jeito" 
O restante das classes não é para fazer alterações

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