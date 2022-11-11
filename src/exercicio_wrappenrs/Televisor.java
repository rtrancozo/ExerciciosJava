package exercicio_wrappenrs;

public class Televisor {



            Integer canal = 130;
            Integer volume = 20;

            void mudarCanal(Integer novoCanal) {
                if (canal.equals(novoCanal) ) {
                    System.out.println("Novo canal é também o canal atual.");
                } else {
                    canal = novoCanal;
                    System.out.println("Canal alterado para " + canal);
                }
            }

            void mudarVolume(Integer novoVolume) {
                if (novoVolume.equals(volume)) {
                    System.out.println("Novo volume é também o volume atual.");
                } else {
                    volume = novoVolume;
                    System.out.println("Volume alterado para " + volume);
                }
            }

            // Estamos aproveitando a classe Televisor para fazer nosso teste
            public static void main(String[] args) {
                Televisor tv = new Televisor();

                try {
                    if(tv.volume != 20 && tv.canal != 130) {// Não deveria mudar o volume e canal
                        tv.mudarVolume(20);
                        tv.mudarCanal(130);
                    }
                }finally {
                    tv.mudarVolume(300);
                    tv.mudarCanal(10);

                }



            }

        }





