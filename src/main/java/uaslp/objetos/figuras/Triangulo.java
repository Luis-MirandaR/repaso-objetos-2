package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {

    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getArea() throws AlturaNoProvistaException, BaseNoProvistaException{
        if (this.base == 0){
            throw new BaseNoProvistaException();
        }
        if (this.altura == 0){
            throw new AlturaNoProvistaException();
        }

        return (this.altura * this.base)/2;
    }

    @Override
    public String getDescription() {
        return "Cualquier triangulo";
    }

    public String getName() {
        return "Triangulo";
    }
}
