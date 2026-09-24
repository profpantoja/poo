```mermaid
classDiagram

%% Pacote: Model

class Pessoa {
    - nome : String
    - apelido : String
    - numeroFiscal : String 
    + getNome() String
    + setNome(nome : String) void
    + getApelido() String
    + setApelido(apelido : String) String
    + getNumeroFiscal() String 
    + setNumeroFiscal(numeroFiscal : String) void
    + _imprimirPessoa() void_
}

class Professor {
    - id : int
    - salario : double
    - contrato : int
    - politecnico : Politecnico
    + getId() int
    + setId(id : int) void
    + getSalario() double 
    + setSalario() void 
    + getContrato() int 
    + setContrato(contrato : int) void 
    + getPolitecnico() Politecnico 
    + setPolitecnico(politecnico : Politecnico) void 
    + imprimirPessoa() void
}

class Aluno {
    - matricula : int
    - historico : ArrayList<Apontamento>
    - grade : Grade
    + getMatricula() int
    + setMatricula(matricula : int) void
    + getHistorico() ArrayList<Apontamento>
    + setHistorico(historico : ArrayList<Apontamento>) void 
    + getGrade() Grade 
    + setGrade(grade : Grade) void 
    + addHistorico(apontamento : Apontamento) void
    + imprimirHistorico() void
    + estaIntegralizado() boolean
    + getDisciplinas() ArrayList<Disciplina>
    + imprimirPessoa() void
}

class Grade {
    - ano : int
    - chTotal : int
    - disciplinas : ArrayList<Disciplina>
    - curso : Curso
    + getAno() int
    + setAno(ano : int) void
    + getChTotal() int
    + setChTotal(chTotal : int) void
    + getDisciplinas() ArrayList<Disciplina>
    + setDisciplinas(disciplinas : ArrayList<Disciplina>) void
    + addDisciplina(disciplina : Disciplina) void
    + getCurso() Curso
    + setCurso(curso : Curso) void
    + imprimirGrade(grade : Grade) void 
}

class Politecnico {
    - nome : String
    - url : String
    - cursos : ArrayList<Curso>
    + getNome() String
    + setNome(nome : String) void
    + getUrl() String
    + setUrl(url : String) void
    + getCursos() ArrayList<Curso>
    + setCursos(cursos : ArrayList<Curso>) void
    + imprimirCursos() void
}

class Curso {
    - nome : String
    - portaria : String
    + getNome() String
    + setNome(nome : String) void
    + getPortaria() String
    + setPortaria(portaria : String) void
    + imprimirInfo() void
}

class Apontamento {
    - nota : Double
    - status : String
    - data : String
    - disciplina : Disciplina
    + getNota() Double
    + setNota(nota : Double) void
    + getStatus() String
    + setStatus(status : String) void
    + getData() String
    + setData(data : String) void
    + getDisciplina() Disciplina
    + setDisciplina(disciplina : Disciplina) void
    + imprimirRegistro() void
}
class Disciplina {
    - nome : String
    - ch : int
    - periodo : int
    - preRequisitos : ArrayList<Disciplina>
    + getNome() String
    + setNome(nome : String) void
    + getCh() int
    + setCh(ch : int) void
    + getPeriodo() int
    + setPeriodo(periodo : int) void
    + getPreRequisitos() ArrayList<Disciplina>
    + setPreRequisitos(preReqs : ArrayList<Disciplina>) void
    + addPreReq(disciplina : Disciplina) void
    + imprimirRequisitos() void
}

%% Interfaces
class Conclusao {
    <<interface>>
    + boolean estaIntegralizado()
    + ArrayList<Disciplina> getDisciplinasFaltantes()
}


%% Relações
Aluno --> Pessoa : extends
Aluno ..|> Conclusao : implements
Aluno --> Grade : grade
Aluno --> "0..*" Apontamento : historico
Apontamento --> Disciplina : disciplina
Grade --> "0..*" Disciplina : disciplinas
Professor --> Politecnico
Professor --> Pessoa : extends
Politecnico --> "0..*" Curso 