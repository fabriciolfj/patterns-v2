# patterns-v2

## proxy
- serve para esconder a criação real do objeto
- abstrair alguma regra de segurança para acessar o objeto real

## decorator
- agrega mais funcionalidades a um componente, sem mudar sua estrutura/funcionalidade original
- podemos fazer através de agragações

## adapter
- converter a interface de uma classe em outra interface que os clientes esperam
- maneira simples de compreender é:
  - crie uma classe que implemente a interface alvo
  - crie uma instancia do objeto participante na adaptação
  - nos métodos da interface, chama os métodos os atributo (objecto dito no item acima)
- não é ideal para classes muito diferentes (desafio e maior)
- para casos onde a composição ou herança não são possíveis.

## facade
- cria-se uma interface simplificada para o cliente, quando esta executa várias etapas para o processo
- diferente do adapter, que tenta mudar a interface para o cliente sentir a diferença
- muitos falam desse padrão, como padrão composite patter ou orchestrator patter.

## flyweights
- atua em vários contextos simultaneamente
- ideal quando precisamos de um grande número de objetos semelhantes, que são únicos em apenas alguns parâmetros
- este padrão podemos separar em dois estados:
  - intrínseco -> está dentro do padrão, ele cria as instâncias, pode ser compartilhada entre objetos semelhantes, seus dados são imutáveis
  - extrínsecos -> o cliente cria as instâncias e as armazena, varia de acordo com o contexto

## composite pattern
- padrão utíl para representear hierarquias de objetos
- onde um objeto é uma composição de um ou mais objetos semelhantes
- semelhante a estrutura de uma arvore

## bridge
- quando temos uma herança e uma implementação, conectamos ambas através de uma ponte
- é um padrão estrutural que visa separar a abstração (interface) de sua implementação, permitindo que elas possam variar independentemente

## visitor
- permite adicionar novas operações a uma hierarquia de classes, sem modificar as  originais.
- no máximo somente adicionamos um método a mesma, para que permita visitor.
- obs: para cada nova operação, cria uma nova subclasse de visitante.

## observer pattern
- também conhecido como publish-subscriber
- quando ocorre a mudança em um objeto, outros objetos interessados são notificados.

## strategy (policy)
- permite definir uma familha de algoritmos, colocá-los em classes separadas e torna-los intercambiáveis

## template method
- uma classe com comportamento padrão, aonde as classes filhas podem substituir partes desse comportamento

## command pattern
- quando temos operações de fazer e desfazer
- temos alguns participantes nesse patter, como:
  - receive -> que executa o processamento
  - command -> que executa parte do receive
  - invocador -> aonde estão os comandos
  - cliente -> que cria os comandos e insere no invocador, executando-o

## iterator
- uma jeito universal de percorrer um conjunto de objetos armazenados (coleção), sem se preocupar com a forma como foram gravados
- possue alguns operadores:
  -  current
  - hasNext
  - next
  - first

## memento
- guardar o estado anterior de um objeto, sem interferir no encapsulamento.
- Os participantes do padrão Memento são:
  - Originator: objeto que tem seu estado guardado. Possui métodos para salvar e restaurar seu estado.
  - Memento: objeto que armazena o estado interno do Originator.
  - Caretaker: objeto responsável por gerenciar e armazenar os mementos.
- O funcionamento básico é:
  - O originator se responsabiliza por produzir instâncias Memento contendo snapshots de seu estado interno.
  - O caretaker recebe e armazena os mementos, geralmente em uma pilha (stack), sem conhecer seus detalhes.
  - Para recuperar um estado, o caretaker retorna o memento desejado para o originator.


## state
- O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando o seu estado interno muda.
- Ele funciona definindo estado separados para um objeto, encapsulados em classes diferentes, e fazendo o objeto delegar o trabalho para o objeto estado que corresponde ao seu estado atual.
- Os participantes do padrão State são:
  - Context: Classe base que possui uma instância do Estado Concreto que define o estado atual do Context.
  - State: Interface que declara os métodos que os Estados Concretos devem implementar.
  - ConcreteState: Classes que implementam a interface State para cada estado.
- O fluxo é:
  - O Context delega as requisições do cliente para o Estado Concreto.
  - O objeto Estado Concreto realiza o trabalho de acordo com seu estado atual.
  - O Context pode alternar o Estado Concreto atual quando o estado interno muda.
- Vantagens:
  - Localiza o comportamento específico do estado em classes separadas
  - Facilita a adição de novos estados
  - Evita condicionais para o estado na classe Context

## mediator
- um objeto não se comunica ou se liga a outro, ele usa o mediator para isso
- mediator fica no meio de uma comunicação entre um objeto e outro
- seria uma interface para vários objetos


## chain of responsability
- cria-se uma cadeia de manipuladores, onde cada um manipula uma parte específica da solicitação
- o que não conseguir manipular, passa para frente


## abstract factory
- O padrão Abstract Factory fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

## factory method
- O padrão Factory Method fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

## Diferenca entre factory method vs abstract factory
```
Propósito: O Factory Method é usado para criar objetos de uma classe específica, enquanto o Abstract Factory é usado para criar famílias de objetos relacionados.
Número de métodos fábrica: O Factory Method tem um único método fábrica, enquanto o Abstract Factory pode ter vários métodos fábrica.
Hierarquia de classes: No Factory Method, a hierarquia de classes é composta por uma classe abstrata (ou interface) e várias classes concretas que a implementam. No Abstract Factory, temos uma interface para a fábrica abstrata e várias implementações concretas dessa interface.
Flexibilidade: O Abstract Factory é mais flexível, pois permite adicionar novos tipos de produtos (objetos) sem modificar o código existente, desde que sejam implementadas novas classes concretas de fábrica. No Factory Method, se você quiser adicionar um novo tipo de produto, precisará modificar a hierarquia de classes existente.
Complexidade: O Abstract Factory é mais complexo de implementar do que o Factory Method, pois envolve mais interfaces e classes.
Em resumo, o Factory Method é usado quando você precisa criar objetos de uma classe específica, enquanto o Abstract Factory é usado quando você precisa criar famílias de objetos relacionados. O Factory Method é mais simples, enquanto o Abstract Factory é mais flexível e complexo.
```
