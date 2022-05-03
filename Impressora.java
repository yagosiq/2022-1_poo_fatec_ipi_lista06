/* 1 Escreva uma classe chamada Impressora. Essa classe tem como finalidade imprimir
conteúdos diversos na tela. Ela deve possuir diversos métodos chamados exibir. Eles
poderão coexistir graças ao mecanismo conhecido como sobrecarga de métodos.
Escreva versões do método exibir que tenham as seguintes listas de parâmetros.
1.1 um único float. 
1.2 dois floats.
1.3 um float e uma String, nessa ordem.
1.4 uma String e um float, nessa ordem.
1.5 três Strings.
1.6 dois ints e uma String, nessa ordem.
Em   todo   caso,   cada   método   exibir   deve   exibir   todos   os   valores   usando
System.out.println, separando cada um por vírgula. */

public class Impressora {

    public void exibir(float a){
        System.out.println( "****TESTANDO IMPRESSORA****");
        System.out.println(a);
    }

    public void exibir(float a, float  b){
       System.out.println( a + " , " + b);
    }

    public void exibir(float a, String b){
        System.out.println(a + " , " + b);
    }

    public void exibir (String a, float b){
        System.out.println(a + " , " + b);
    }

    public void exibir (String a, String b, String c){
        System.out.println(a + " , " + b + " , "  + c);
    }

    public void exibir(int a, int b, String c){
        System.out.println(a + " , " + b + " , " + c);
    }
}
