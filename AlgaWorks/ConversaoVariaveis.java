public class ConversaoVariaveis {

  public static void main(String[] args) {
    long x = 10;

    int y = (int) x; //Converte long para int

    System.out.println(y);

    //Evite converter tipo maior para tipo menor a todo custo
    long a = 9300000035L;
    int b = (int) a;
    System.out.println(a);
    System.out.println(b);

    //Conversão correta de tipo menor para tipo maior
    int w = 102344;
    int e = (int) w;
    System.out.println(w);
    System.out.println(e);
 }
}