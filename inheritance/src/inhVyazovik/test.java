package inhVyazovik;

public class test {
    public Object getTest(){
        return this;
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.getTest() == t);
    }
}
