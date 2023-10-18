public class resultadoEscolar {
    public static void main(String[] args) {
       /*int nota= 6;

        if(nota >= 7)

        System.out.println("Aprovado");

        else if (nota >=5 && nota < 7)
        System.out.println("Prova de recuperaçao");
        else
        System.out.println("Reprovado");
        */
        int nota = 6;
        String resulatado = nota >= 7 ?"Aprovado" : nota >= 5 && nota <= 7 ? "Recuperacao": "Reprovado";
        System.out.println(resulatado);
    }
}
