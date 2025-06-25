public class Retangulo {

    private float base;
    private float altura;

    public Retangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float perimetro(float base, float altura){
        float p = 2 * (base + altura);
        return p;
    }

    public float area(float base, float altura){
        float a = base * altura;
        return a;
    }


    public void setRetangulo(float base){
        this.base = base;
    }

    public float getBase(){
        return base;
    }

    public void SetRetangulo(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }
}
