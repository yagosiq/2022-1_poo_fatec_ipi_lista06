//3 Escreva uma classe chamada CalculadoraCientifica. Ela deve fazer as operações de
//potenciação e radiciação com inteiros e reais.
//3.1 Escreva um método chamado raiz. Utilizando sobrecarga de métodos, ele terá três
//versões:
//3.1.1 Lista de parâmetros com um inteiro
//3.1.2 Lista de parâmetros com um double
//3.1.3 Lista de parâmetros com uma String (internamente, ele converte a String para
//Double com Double.parseDouble antes de fazer a operação).
// ------------------------------------------------------------------------------
//3.2 Escreva um método chamado potência. Utilizando a sobrecarga de métodos, ele
//terá três versões:
//3.2.1 Lista de parâmetros com dois bytes a e b. Ele calcula e devolve a elevado a b.
//3.2.2 Lista de parâmetros com duas Strings s1 e s2. Ele converte ambas para double,
//calcula e devolve s1 elevado a s2.
//3.2.3 Lista de parâmetros com um inteiro a e um double b. Ele calcula e devolve a
//elevado a b.

public class CalculadoraCientifica {
    
    public double raiz(int a){
        return Math.sqrt(a);
    }

    public double raiz(double a){
        return Math.sqrt(a);

    }

    public double raiz(String a){
        return Math.sqrt(Double.parseDouble(a));
    }

    public double potencia(int a, int b){
        return Math.pow(a, b);
    }

    public double potencia(String s1, String s2){
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }

    public double potencia (int a, double b){
        return Math.pow(a, b);
    }
}