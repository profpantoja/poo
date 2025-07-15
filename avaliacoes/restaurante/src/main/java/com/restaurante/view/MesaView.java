package com.restaurante.view;

import java.util.Scanner;

import com.restaurante.model.Mesa;

import java.util.List;

public class MesaView {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNumeroMesa() {
        System.out.print("Número da mesa: ");
        return scanner.nextLine();
    }

    public String pedirLocalMesa() {
        System.out.print("Local da mesa: ");
        return scanner.nextLine();
    }

    public void exibirMesas(List<Mesa> mesas) {
    if (mesas.isEmpty()) {
        System.out.println("Nenhuma mesa cadastrada.");
    } else {
        for (Mesa m : mesas) {
            System.out.println("Mesa " + m.getNumero() + " - Local: " + m.getLocal());
        }
    }
}

}

