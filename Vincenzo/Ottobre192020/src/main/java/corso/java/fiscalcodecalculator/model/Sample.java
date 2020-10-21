package corso.java.fiscalcodecalculator.model;

public class Sample {

    public class Inner{}
    public static class InnerStatic{}

    public void test(){
        Inner i = new Sample().new Inner();
        InnerStatic s = new Sample.InnerStatic();
    }
}
