public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();
        imp.exibir(2.78f);
        imp.exibir(2.78f, 5.78f);
        imp.exibir(5.45f, "yes");
        imp.exibir("no", 84.452f);
        imp.exibir("ha", "ha", "ha");
        imp.exibir(1, 2, "foi :)");
    }
}
