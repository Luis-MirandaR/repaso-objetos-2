package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private double lado;
    private int numLados;

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.lado = lado;
        this.numLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados{
        if(numeroDeLados < 5){
            throw new NumeroInvalidoDeLados();
        }
        this.numLados = numeroDeLados;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        double apotema = (this.lado)/(2*(Math.tan(Math.toRadians(180/this.numLados))));
        double area = (this.lado*this.numLados*apotema)/2;
        return area;
    }

    public double getLado(){
        return this.lado;
    }

    @Override
    public String getDescription() {
        return "Es un poligono regular";
    }
    public String getName() {
        return "Poligono Regular";
    }
}
