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
