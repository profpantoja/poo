# Diagrama UML - Sistema de Gerenciamento de Pets
Este repositório contém a modelagem UML em MarkDown referente à avaliação Pets.

## Classe PESSOA
**Atributos:**
- nome: String
- apelido: String

---

## Classe TUTOR
**Herança:** extends PESSOA

**Métodos:**
+ adotar(pet: PET): void

**Associação:**
- pets: List<PET> (relação 0 para muitos)

---

## Classe VETERINARIO
**Herança:** extends PESSOA

**Atributos:**
- crv: String

**Associação:**
- veterinario: VETERINARIO (relação 1 para muitos com PRONTUARIO)

---

## Classe PET
**Atributos:**
- nome: String
- nascimento: Date

**Relações:**
- Associação com TUTOR (0..* pets)
- Associação com PRONTUARIO

---

## Classe PRONTUARIO
**Atributos:**
- data: Date
- comentario: String

**Métodos:**
+ realizarConsulta(): void

**Relações:**
- Associação com VETERINARIO (0..* prontuarios)
- Associação com PET

---

## Classes Filhas de PET

### Classe CACHORRO
**Herança:** extends PET

**Métodos:**
+ latir(): void

### Classe CALOPSITA
**Herança:** extends PET

**Métodos:**
+ piar(): void

### Classe GATO
**Herança:** extends PET

**Métodos:**
+ miar(): void

---

## Relacionamentos
1. **Herança:**
   - TUTOR herda de PESSOA
   - VETERINARIO herda de PESSOA
   - CACHORRO herda de PET
   - CALOPSITA herda de PET
   - GATO herda de PET

2. **Associação:**
   - TUTOR possui 0..* PET
   - VETERINARIO possui 0..* PRONTUARIO
   - PET possui 1 PRONTUARIO

3. **Composição:**
   - PET é especializada por CACHORRO, CALOPSITA e GATO

---