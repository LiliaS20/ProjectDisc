package ru.stqa.pft.sandbox;

public class Rectangle { // объект

    public double a; // атрибут
    public double b;

    public Rectangle (double a, double b) { // ЭКЗЕМПЛЯР КЛАССА название конструкции (аргумент/параметр функции)
        this.a = a; // значение атрибута создаваемого объекта равно значению параметра переданного в конструктор
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}
