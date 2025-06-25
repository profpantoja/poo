public class Cryptographye {

    private String frase;
    private char encrypt[] = new char[100];

    public Cryptographye (String frase){
        this.frase = frase;
    }

    public void encrypt(){
        for (int i = 0; i < frase.length(); i++){
            encrypt[i] = frase.charAt(i);
    
            if ((encrypt[i] >= 97) && (encrypt[i] <= 122))  {
                encrypt[i] -= 32;
            }
                
            
            if ((encrypt[i] >= 65) && (encrypt[i] <= 90)) {
                
                if ((encrypt[i] >= 88 ) && (encrypt[i] <= 90)) {
                    encrypt[i] -= 23;
                }
                else {
                    encrypt[i] += 3;
                }
            }
        }

        int tam = frase.length();
        frase = "";

        for (int i = 0; i < tam; i++){
        frase = frase + encrypt[i];
        }

        System.out.println("Frase criptografada: "+frase);

    }

    public void decrypt(){
        for (int i = 0; i < frase.length(); i++){
            encrypt[i] = frase.charAt(i);
    
            if ((encrypt[i] >= 97) && (encrypt[i] <= 122))  {
                encrypt[i] -= 32;
            }
            
            if ((encrypt[i] >= 65) && (encrypt[i] <= 90)) {
                
                if ((encrypt[i] >= 65 ) && (encrypt[i] <= 67)) {
                    encrypt[i] += 23;
                }
                else {
                    encrypt[i] -= 3;
                }
            }
        }

        int tam = frase.length();
        frase = "";

        for (int i = 0; i < tam; i++){
        frase = frase + encrypt[i];
        }

        System.out.println("Frase desencriptpgrafada: "+frase);
    }
    
    public void setFrase(String frase){
        this.frase = frase;
    }

    public String getFrase(){
        return frase;
    }
}
