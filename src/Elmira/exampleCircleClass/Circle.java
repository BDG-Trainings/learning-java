package src.Elmira.exampleCircleClass;

public class Circle {

    double radious=1.0;

    public Circle(){

    }
    public Circle(double radious){
        this.radious = radious;
    }
    public double getRadious() {
        return radious;
    }
    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getArea(){
        //A=π*r*r
        double A = Math.PI * Math.pow(this.radious,2);
        return A;
    }
    public double getCircumference(){
        //C=2πr
        double C = 2*this.radious*Math.PI;
        return C;
    }

    @Override
    public String toString() {
        String str = "Circle[radious="+this.radious+"]";
        return str;
    }
}
