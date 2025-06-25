import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static void main (String args[]){

    @SuppressWarnings({ "unused", "resource" })
    Scanner in = new Scanner(System.in);

    Kate kate = new Kate(1000,3);
    BadFish badfish1 = new BadFish(200,"BadFish 1");
    BadFish badfish2 = new BadFish(200,"BadFish 2");
    BadFish badfish3 = new BadFish(200,"BadFish 3");
    MadCat madcat1 = new MadCat(500,"MadCat 1");
    MadCat madcat2 = new MadCat(500,"MasCat 2");

    Poder superbank = new Poder("SuperBank", 200);
    Poder eyebeam = new Poder("EyeBeam", (superbank.getDano()+((superbank.getDano()*20)/100)));
    Poder rearrocket = new Poder("RearRocket", (eyebeam.getDano()+((eyebeam.getDano()*50)/100)));

    ArrayList<Poder> poder = new ArrayList<Poder>();

    poder.add(superbank);
    poder.add(eyebeam);
    poder.add(rearrocket);

    kate.setPoder(poder);

    System.out.println("\n+-----------------------------------+");
    System.out.println("|             SUPERKATE             |");
    System.out.println("+-----------------------------------+");
    System.out.println("  ___");
    System.out.println(" /(_)          SEJA BEM VINDO(A)");
    System.out.println(" <,--╦╤─ °         AO JOGO");
    System.out.println(" / /");
    System.out.println("+----------------------------------+");

    kate.andar();
    kate.pular();

    madcat1.setDano_recebido(kate.poder(poder));
    kate.alterarpoder(2);
    badfish2.setDano_recebido(kate.poder(poder));

    madcat1.setEnergia(madcat1.status(poder,madcat1.getNome(),madcat1.getDano_recebido(),madcat1.getEnergia()));

    badfish2.setEnergia(badfish2.status(poder,badfish2.getNome(),badfish2.getDano_recebido(),badfish2.getEnergia()));

    madcat2.setEnergia(madcat2.status(poder,madcat2.getNome(),madcat2.getDano_recebido(),madcat2.getEnergia()));
    badfish3.setEnergia(badfish3.status(poder,badfish3.getNome(),badfish3.getDano_recebido(),badfish3.getEnergia()));
    badfish1.setEnergia(badfish1.status(poder,badfish1.getNome(),badfish1.getDano_recebido(),badfish1.getEnergia()));


    }
    
}
