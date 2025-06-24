# Sistema de Academia - Diagrama UML

Este repositório contém a modelagem UML de um sistema para gerenciamento de academia. O diagrama foi criado utilizando o software Astah.

## Diagrama UML

O diagrama representa as seguintes classes e relacionamentos:

### Pessoa
Classe base que contém:
- nome : String
- endereco : String
- dtNascimento : String
- matricula : String

Heranças:
- Funcionario
- Aluno

### Funcionario
Herdeiro de Pessoa. Contém:
- turno : String
- cargo : String
- salario : float
- seguridade : int

### Treinador
Herdeiro de Funcionario. Contém:
- cref : String

Método:
- realizarAvaliacao(Aluno aluno) : void

### Aluno
Herdeiro de Pessoa. Contém:
- plano : Plano

Método:
- cancelarPlano() : void

### Plano
Contém:
- valor : float
- nome : String
- descricao : String

Método:
- aplicarDesconto() : void

### Assinatura
Contém:
- plano : Plano
- aluno : Aluno
- dataContrato : Date
- dataFinal : Date

Método:
- renovar(Date novaDataFinal) : void

### Avaliacao
Contém:
- data : Date
- aluno : Aluno
- avaliador : Treinador

Método:
- imprimirResultado() : void

### Endereco
Contém:
- num : int
- rua : String
- bairro : String
- cidade : String

### Contato
Contém:
- tipo : String

### Documento
Contém:
- numero : String
- tipo : String

### Academia
Contém:
- alunos : ArrayList<Aluno>
- funcionarios : ArrayList<Funcionario>
- treinadores : ArrayList<Treinador>
- documentos : ArrayList<Documento>
- contatos : ArrayList<Contato>

Métodos:
- cadastroFuncionario() : void
- cadastroAluno() : void
- listarAlunos() : void
- listarFuncionarios() : void
- gerarRelatorioMensal() : void

## Relacionamentos

- Pessoa é superclasse de Aluno e Funcionario.
- Funcionario é superclasse de Treinador.
- Aluno está associado a Plano.
- Assinatura associa um Aluno a um Plano, com datas de início e término.
- Avaliacao associa um Aluno a um Treinador em uma data.
- Pessoa está associada a Endereco, Contato e Documento.
- Academia está associada a Aluno, Funcionario, Treinador, Contato e Documento.

As multiplicidades estão representadas no diagrama com `1` e `*`, indicando a quantidade de instâncias envolvidas nas relações.


## Ferramenta utilizada

- Astah UML


