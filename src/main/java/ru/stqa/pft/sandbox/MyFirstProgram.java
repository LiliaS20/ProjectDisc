package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Lilia");

        Square s = new Square(4);
        //не оч удобный вариант System.out.println("Площадь квадрата со строной " + s.l + " = " + area(s));
        System.out.println("Площадь квадрата со строной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 5);
        System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point(4.0, 7.0, 9.0, 9.0);
        System.out.println("Растояние между точками = " + p.distance());
    }

    public static void hello(String nameUser) {
        System.out.println("Hello, " + nameUser);
    }

    /* не очень удобный вариант

    public static double area(Square s) {
        return s.l * s.l;
    }*/
}
