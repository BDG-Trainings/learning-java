package Classner;

public class Glan {
        private double heigth;
        private Circle1 circle;

        public Glan(double radius, double heigth){
            this.heigth = heigth;
            circle = new Circle1(radius);
        }
        public double getRadius(){
            return circle.getRadius();
        }
        public void setRadius(double radius){
            circle.SetRadius(radius);
        }
        public double getVolume(){
            return circle.getArea()*heigth;
        }
        public String toString(){
            return "Glan[radius =" + circle.getRadius();
        }
        public static void main(String []args){
            Glan a = new Classner.Glan(6.0,9.0);
            System.out.println(a.toString());
            System.out.println("Caval@ ="+ a.getVolume());

        }

    }

