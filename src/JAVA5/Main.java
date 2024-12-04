/*Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO
3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.:
8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz
fronteira. Escreva a classe em Java e forneça os seus membros a seguir:
a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e
dimensão do país;
c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade
semântica). Dois países são iguais se tiverem o mesmo código ISO;
d) Um método que retorne a densidade populacional do país;*/

package JAVA5;

    public class Main {
        public static void main(String[] args) {

            Pais Brasil = new Pais("BRA", "Brasil", 8515767.049);
            Brasil.setPopulacao(193946886);

            Pais Argentina = new Pais("ARG", "Argentina", 2780400);
            Brasil.AdicionarFronteira(Argentina);

            Pais Suriname = new Pais("SUR", "Suriname", 163820);
            Brasil.AdicionarFronteira(Suriname);

            Pais GuianaFrancesa = new Pais("GF", "Guiana Francesa", 83534);
            Brasil.AdicionarFronteira(GuianaFrancesa);

            Pais Venezuela = new Pais("VEN", "Venezuela", 916445);
            Brasil.AdicionarFronteira(Venezuela);

            Pais Colombia = new Pais("COL", "Colômbia", 1141748);
            Brasil.AdicionarFronteira(Colombia);

            Pais Peru = new Pais("PER", "Peru", 1285216);
            Brasil.AdicionarFronteira(Peru);

            Pais Bolivia = new Pais("BOL", "Bolívia", 1098581);
            Brasil.AdicionarFronteira(Bolivia);

            Pais Paraguai = new Pais("PAR", "Paraguai", 406752);
            Brasil.AdicionarFronteira(Paraguai);

            Pais Uruguai = new Pais("URU", "Uruguai", 176215);
            Brasil.AdicionarFronteira(Uruguai);

            System.out.println(Brasil);
            System.out.println("Densidade populacional: " + Brasil.DensidadePopulacional() + " hab/km²");
            System.out.println("Fronteiras do Brasil:");

            for (Pais fronteira : Brasil.getFronteiras()) {
                System.out.printf(fronteira.getNome());
            }
        }
    }