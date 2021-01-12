package dz_MyClass;

public class MyClass {
    //вводим а и b
    int a;
    int b;

    //даем значения отдельно a и b
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    //приводим a и b к одному и тому же значению
    MyClass(int i) {
        this(i, i);
    }

    //приводим a и b к значению нуля и вызываем перегруженный конструктор из этого же класса
    MyClass() {
        this(0);
    }
}




