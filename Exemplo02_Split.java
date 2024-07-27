public class Exemplo02_Split {
    public static void main(String[] args) {
        
        String divide = "Daniel Castilho do Nascimento"; // primeiro a variavel

        String array[] = divide.split(" "); //cria um array/vetor recortando o texto pelo espaço " "

        String palavra1 = array[0];
        String palavra2 = array[1];
        String palavra3 = array[2];
        String palavra4 = array[3];

        System.out.println(palavra4);
        System.out.println(palavra3);
        System.out.println(palavra2);
        System.out.println(palavra1);

    }
}
