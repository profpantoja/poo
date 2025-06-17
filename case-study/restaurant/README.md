
---

# Sistema de Gestão de Restaurante

Este projeto representa um sistema de gestão para restaurantes, modelado em UML. O sistema permite gerenciar clientes, funcionários, mesas, pedidos, pagamentos e emissão de notas fiscais.

## Imagem do UML;

![Image](https://github.com/user-attachments/assets/b56183ec-8e11-4109-a0a6-c2f9a135be70)


## Visão Geral das Classes

### Pessoa

Classe base para:

* Funcionário
* Cliente

Atributos:

* `nome : String`
* `nif_cpf : String`

---

### Funcionário (herda de Pessoa)

Atributos:

* `ctp : String`
* `cargo : String`

---

### Cliente (herda de Pessoa)

Atributos:

* `numFid : int` (Número de fidelidade)

---

## Restaurante

Atributos:

* `nome : String`
* `cnpj : String`
* `nomeFantasia : String`

Relacionamentos:

* Possui uma lista de mesas
* Está associado a um endereço
* Está vinculado a um menu (Menu)

---

## Endereco

Atributos:

* `tipo : String`
* `cep : String`
* `numero : int`

Relacionamentos:

* Um restaurante possui um endereço

---

## Mesa

Atributos:

* `num : String`
* `local : String`

Relacionamentos:

* Uma mesa pertence a um restaurante
* Uma mesa pode estar associada a múltiplos pedidos

---

## Menu

Métodos:

* `show() : void`

Relacionamentos:

* Está associado ao restaurante
* Contém os produtos disponíveis

---

## Produto

Atributos:

* `nome : String`
* `valProd : float` (Valor de custo)
* `valVend : float` (Valor de venda)
* `iva : float` (Imposto sobre valor agregado)

---

## Pedido

Atributos:

* `numPedido : int`
* `valorTotal : float`

Métodos:

* `encerrar() : void`
* `pagar() : void`

Relacionamentos:

* Está vinculado a um cliente
* Contém uma lista de itens (`List<Item>`)
* Está associado a uma mesa

---

## Item

Atributos:

* `produto : Produto`
* `qtd : int`
* `valVenda : float`

Relacionamentos:

* Está associado a um pedido

---

## Pagamento (Classe Abstrata)

Métodos:

* `pagar() : void` (Método abstrato)

Subclasses concretas:

* **PIX**
* **Especie**
* **Cartao**

Cada uma dessas subclasses implementa o método `pagar()` de acordo com sua modalidade.

---

## NotaFiscal

Métodos:

* `gerar() : String`

Relacionamentos:

* Interage com a interface de geração de nota fiscal (`INFCGenerator`)

---

## Interface INFCGenerator

Métodos:

* `setId(UUID id : int) : void`
* `setEm(String cnpj : int) : void`
* `addProd(List<Produto> : int) : void`
* `setTotal(float total : int) : void`

---

## Relacionamentos Gerais

* Restaurante tem mesas, endereço e menu.
* Cliente faz pedidos, que estão vinculados a mesas.
* Pedido possui itens, que estão associados a produtos.
* Pedido pode ser encerrado e pago, utilizando uma das formas de pagamento (PIX, Espécie ou Cartão).
* Nota Fiscal é gerada para cada pedido utilizando a interface `INFCGenerator`.

---
