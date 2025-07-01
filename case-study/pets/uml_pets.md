```mermaid
classDiagram
    class PESSOA {
        - nome String
        - apelido String
    }
    
    class TUTOR {
        + adotar(pet PET) void
    }
    
    class VETERINARIO {
        - crv String
    }
    
    class PET {
        - nome String
        - nascimento Date
    }
    
    class PRONTUARIO {
        - data Date
        - comentario String
        + realizarConsulta() void
    }
    
    class CACHORRO {
        + latir() void
    }
    
    class CALOPSITA {
        + piar() void
    }
    
    class GATO {
        + miar() void
    }
    
    PESSOA <|-- TUTOR
    PESSOA <|-- VETERINARIO

    TUTOR -- VETERINARIO
    
    
    PET <|-- CACHORRO
    PET <|-- CALOPSITA
    PET <|-- GATO
    
    TUTOR "1" o-- "0..*" PET : pets
    VETERINARIO "1" -- "0..*" PRONTUARIO : veterinario
    PET "1" -- "1" PRONTUARIO

