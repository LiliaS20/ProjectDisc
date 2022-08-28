package ru.stqa.pft.sandbox;

public class Square { // объект

    public double l; // атрибут

    public Square(double l) { // ЭКЗЕМПЛЯР КЛАССА конструктор  *название конструкции (аргумент функции)*
        this.l = l; // присвоение переданного значения в атрибут объекта - this.l - ссылка на атрибут объекта
        //l = len;
    }

    public double area() {
        return this.l * this.l;
    }
}
