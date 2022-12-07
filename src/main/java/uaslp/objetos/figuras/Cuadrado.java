package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea() throws LadoNoProvistoException{
        if(this.lado == 0){
            throw new LadoNoProvistoException();
        }
        double area = this.lado * this.lado;
        return area;
    }

    public double getLado(){
        return this.lado;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
