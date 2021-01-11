package Modifiles.pack1.package1;

import Modifiles.pack1.package2.Parent;
import Modifiles.pack1.package2.TestInPack2;

public class Main extends Parent {
    public static void main(String[] args) {

        TestInPack1 t1 = new TestInPack1();
        TestInPack2 t2 = new TestInPack2();
        Parent p = new Parent();
        Main m = new Main();
///в одном пакете без родственных связей
        //System.out.println(t1.x1);
        System.out.println(t1.x2);
        System.out.println(t1.x3);
        System.out.println(t1.x4);

        //в разных пакетах без родственных связей
        //System.out.println(t2.x1);
        //System.out.println(t2.x2);
        //System.out.println(t2.x3);
        System.out.println(t2.x4);


//в разных пакетах с родственными связями
        //System.out.println(p.x1);
        //System.out.println(p.x2);
        //System.out.println(p.x3);//супер клас не видит полей наследника
        System.out.println(m.x3);
        System.out.println(p.x4);

    }
}