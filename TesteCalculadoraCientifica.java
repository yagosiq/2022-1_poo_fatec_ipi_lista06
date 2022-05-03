public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calcC = new CalculadoraCientifica();
        System.out.println(calcC.raiz(9));
        System.out.println(calcC.raiz(90.0f));
        System.out.println(calcC.raiz("525"));
        System.out.println(calcC.potencia(2, 3));
        System.out.println(calcC.potencia("3", "2"));
        System.out.println(calcC.potencia(5, 2.0f));
    }
}
