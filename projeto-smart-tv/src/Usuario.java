public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        /* Mudar o canal */

        System.out.println("Canal atual: " + smartTv.canal); // 1
        smartTv.mudarCanal(13); // 13
        System.out.println("Canal atual: " + smartTv.canal); // 13

        /* Aumentar/Diminuir o volume */

        smartTv.diminuirVolume(); //24
        smartTv.diminuirVolume(); //23
        smartTv.diminuirVolume(); //22
        smartTv.aumentarVolume(); //23
        System.out.println("Volume atual? " + smartTv.volume); // 23

        /* Ligar/Desligar a TV */

        smartTv.ligar();
        System.out.println("Novo estado -> Ligada? " + smartTv.ligada); // true

		smartTv.desligar();
        System.out.println("Novo estado -> Ligada? " + smartTv.ligada); // false
    }
}
