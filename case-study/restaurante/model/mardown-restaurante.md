# Diagrama UML - Sistema de Gestão de Restaurantes

## Classe `Pessoa` (Abstrata)

Classe base para representar indivíduos no sistema.

### Atributos:

- `- nome: String`

---

## Classe `Cliente`

Representa o cliente do restaurante.

### Herança:

- `extends Pessoa`

### Associações:

- Um `Cliente` pode ter um ou mais `Pedidos` (1 para N)

---

## Classe `Funcionario`

Representa o funcionário do restaurante.

### Herança:

- `extends Pessoa`

### Atributos:

- `- cargo: String`

### Associações:

- Um `Funcionario` pode atender um ou mais `Pedidos` (1 para N)

---

## Classe `Restaurante`

Representa o estabelecimento.

### Atributos:

- `- nome: String`
- `- endereco: String`
- `- nif: String`
- `- IVA_PADRAO: double = 0.23`

### Associações (Composição):

- Composição de 1 para 1 com a classe `Menu`
- Composição de 1 para 0..\* com a classe `Funcionario`
- Composição de 1 para 0..\* com a classe `Mesa`

---

## Classe `Menu`

Gerencia os produtos oferecidos.

### Associações (Composição):

- Composição de 1 para 1..\* com a classe `Produto`

### Métodos:

- `+ exibirMenu(): void`

---

## Classe `Produto`

Representa um item do menu.

### Atributos:

- `- nome: String`
- `- precoVenda: double`
- `- taxaIva: double`

---

## Classe `Mesa`

Representa uma mesa no restaurante.

### Atributos:

- `- numero: int`
- `- status: String`

### Associações:

- Uma `Mesa` pode estar associada a 1 `Pedido` ativo (1 para 1)

---

## Classe `Pedido`

Representa o pedido de um cliente.

### Atributos:

- `- id: int`
- `- dataHora: LocalDateTime`
- `- itens: List<ItemPedido>`
- `- notaFiscal: NotaFiscal`
- `- total: double`

### Associações:

- Associação de N para 1 com a classe `Cliente`
- Associação de N para 1 com a classe `Funcionario`
- Associação de N para 1 com a classe `Mesa`
- Composição de 1 para 1..\* com a classe `ItemPedido`
- Associação de 1 para 1 com a classe `Pagamento`

### Métodos:

- `+ gerarNotaFiscalAposPagamento(): void`

---

## Classe `ItemPedido`

Classe de associação que detalha um produto dentro de um pedido.

### Atributos:

- `- quantidade: int`
- `- precoUnitario: double`

### Associações:

- Associação de N para 1 com a classe `Produto`

---

## Classe `Pagamento` (Abstrata)

Classe base para as formas de pagamento.

### Atributos:

- `- valor: double`
- `- dataHora: LocalDateTime`

### Métodos:

- `+ registrarPagamento(): void`

---

## Classes Filhas de `Pagamento`

### Classe `Dinheiro`

- `extends Pagamento`

### Classe `Cartao`

- `extends Pagamento`

### Classe `PixMbWay`

- `extends Pagamento`

---

## Interface `INFCGenerator`

Define o contrato para a geração de uma Nota Fiscal.

### Métodos:

- `+ setIdentificacao(UUID id): void`
- `+ setEmitente(String cnpj): void`
- `+ addProduto(List<Produto> produtos): void`
- `+ setTotal(float total): void`

---

## Classe `NotaFiscal`

Representa a nota fiscal gerada após o pagamento.

### Implementa:

- `INFCGenerator`

### Atributos:

- `- id: UUID`
- `- emitente: String`
- `- produtos: List<Produto>`
- `- total: float`
- `- dataEmissao: LocalDateTime`
- `- detalhesTaxas: Map<Double, Double>`

### Dependência:

- A `NotaFiscal` é criada a partir dos dados de um `Pedido`

---

## Resumo dos Relacionamentos

### Herança:

- `Cliente` herda de `Pessoa`
- `Funcionario` herda de `Pessoa`
- `Dinheiro`, `Cartao`, `PixMbWay` herdam de `Pagamento`

### Implementação:

- `NotaFiscal` implementa `INFCGenerator`

### Associação / Composição:

- `Restaurante` compõe:
  - 1 `Menu`
  - 0..\* `Funcionario`
  - 0..\* `Mesa`
- `Menu` compõe 1..\* `Produto`
- `Pedido` compõe 1..\* `ItemPedido`
- `Pedido` se associa a:
  - 1 `Cliente`
  - 1 `Funcionario`
  - 1 `Mesa`
  - 1 `Pagamento`
- `ItemPedido` se associa a 1 `Produto`
- `Pedido` tem associação com 1 `NotaFiscal` (após encerramento)

### Dependência:

- `NotaFiscal` depende dos dados do `Pedido` para ser criada
