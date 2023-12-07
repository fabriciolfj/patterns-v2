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
- atua em vários contextes simultaneamente
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