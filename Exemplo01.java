public class Exemplo01 {
    public static void main(String[] args) {
        
        String original = "     Daniel Castilho do Nascimento    ";

        String minusculo = original.toLowerCase();
        System.out.println(minusculo);

        String maiusculo = original.toUpperCase();
        System.out.println(maiusculo);

        String removeVaziosLaterais = original.trim();
        System.out.println(removeVaziosLaterais);

        String stringRecortada = removeVaziosLaterais.substring(7); 
        //cria nova String da posição 7 em diante a partir da string recortada.
        System.out.println(stringRecortada);

        String stringRecortadaInicioFim = removeVaziosLaterais.substring(7, 16);
        System.out.println(stringRecortadaInicioFim);

        String substituindo = removeVaziosLaterais.replace('a','@');
        System.out.println(substituindo);

        String substituindoConjuntoCaracteres = removeVaziosLaterais.replace("Daniel", "Gabriel");
        System.out.println(substituindoConjuntoCaracteres);

        int retornarAprimeiraOcorrencia = removeVaziosLaterais.indexOf('a');
        System.out.println(retornarAprimeiraOcorrencia);

        int retornarAultimaOcorrencia = removeVaziosLaterais.lastIndexOf('a');
        System.out.println(retornarAultimaOcorrencia);

        int numeroDeCaracteres = removeVaziosLaterais.length();
        System.out.println(numeroDeCaracteres);


    }
}
