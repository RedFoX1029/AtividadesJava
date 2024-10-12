public class Banco {

    public static final String NOME_BANCO = "Banco01";
    private static int contadorId;

    public static int geradorId(){
        contadorId++;
        return contadorId;
    }
}
