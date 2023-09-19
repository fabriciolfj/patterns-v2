# patterns-v2

## proxy
- serve para esconder a criação real do objeto
- abstrair alguma regra de segurança para acessar o objeto real

## decorator
- agrega mais funcionalidades a um componente, sem mudar sua estrutura/funcionalidade original
- podemos fazer através de agragações

## adapter
- converter a interface de uma classe em outra interface que os clientes esperam
- não é ideal para classes muito diferentes (desafio e maior)
- para casos onde a composição ou herança não são possíveis.