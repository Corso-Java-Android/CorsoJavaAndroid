package contoCorrente;

public class GestoreCC {
    public static void main(String[] args) {
        ContoCorrente cc = new ContoCorrente();

        cc.setTitolareConto("Carlo Mazza");
        cc.setNumeroConto(1234);
        cc.setSaldo(2500.00);

        System.out.println(cc.getTitolareConto());
        System.out.println(cc.getNumeroConto());
        System.out.println(cc.getSaldo());

        System.out.println(cc.toString());

        ContoCorrente cc2 = new ContoCorrente("Carlo Mazza",2500.00, 1234);
        System.out.println(cc2.toString());
    }
}
