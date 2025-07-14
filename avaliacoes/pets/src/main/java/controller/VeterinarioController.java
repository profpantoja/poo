package controller;

import java.util.List;

import dao.VeterinarioDao;
import model.Veterinario;

public class VeterinarioController {

    VeterinarioDao vetDao = new VeterinarioDao();

    public void criarVeterinario(String nome, String apelido, String crv) {
        Veterinario v = new Veterinario(nome, apelido, crv);
        vetDao.adicionarVeterinarios(v);
        System.out.println("Veterinário adicionado com sucesso.");
    }

    public void buscarNome(String nome) {
        Veterinario v = vetDao.buscarPorNome(nome);
        if (v != null) {
            System.out.println("Veterinário encontrado:");
            System.out.println("Nome: " + v.getNome());
            System.out.println("Apelido: " + v.getApelido());
            System.out.println("CRMV: " + v.getCrv());
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void buscarApelido(String apelido) {
        Veterinario v = vetDao.buscarPorApelido(apelido);
        if (v != null) {
            System.out.println("Veterinário encontrado:");
            System.out.println("Nome: " + v.getNome());
            System.out.println("Apelido: " + v.getApelido());
            System.out.println("CRMV: " + v.getCrv());
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void buscarCrv(String crv) {
        Veterinario v = vetDao.buscarPorCrv(crv);
        if (v != null) {
            System.out.println("Veterinário encontrado:");
            System.out.println("Nome: " + v.getNome());
            System.out.println("Apelido: " + v.getApelido());
            System.out.println("CRMV: " + v.getCrv());
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void removerNome(String nome) {
        if (vetDao.removerPorNome(nome)) {
            System.out.println("Veterinário removido com sucesso.");
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void removerApelido(String apelido) {
        if (vetDao.removerPorApelido(apelido)) {
            System.out.println("Veterinário removido com sucesso.");
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void removerCrv(String crv) {
        if (vetDao.removerPorCrv(crv)) {
            System.out.println("Veterinário removido com sucesso.");
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }
    public void listarVeterinario(){
        List<Veterinario> vets = vetDao.listarVeterinarios();
        for(Veterinario vet : vets){
            System.out.println("\nNome: " + vet.getNome() + "\nApelido: " + vet.getApelido() + "\nCrv: " + vet.getCrv());
        }
        
    }
}
