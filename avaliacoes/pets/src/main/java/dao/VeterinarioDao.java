package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Veterinario;
import java.util.ArrayList;
import java.util.List;


public class VeterinarioDao{

    private static final String arq = "java-exercicios/avaliacoes/pets/src/main/java/dao/db/veterinario.txt";

    public void adicionarVeterinarios(Veterinario vet){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true));
            String texto =  vet.getNome() + "|" + vet.getApelido() + "|" + vet.getCrv(); 
            bw.write(texto);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Erro ao adicionar veterinário: " + e.getMessage());
        }

    }
    public List<Veterinario> listarVeterinarios(){
        List<Veterinario> veterinarios = new ArrayList<>();
        try{
            File file = new File(arq);
            if (!file.exists()){
                return veterinarios;    
            }
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null){
                String[] dados = linha.split("\\|");
                if(dados.length == 3){
                    Veterinario v = new Veterinario(dados[0],dados[1],dados[2]);
                    veterinarios.add(v);
                }
            }
            br.close();
        }catch(IOException e){
            System.out.println("Erro ao listar veterinários : " + e.getMessage());
        }
        return veterinarios;
    }

    public Veterinario buscarPorNome(String nome){
        List<Veterinario> vets = listarVeterinarios();
        for(Veterinario vet : vets){
            if(vet.getNome().equals(nome)){
                return vet;
            }
        }
        return null;
    }

    public Veterinario buscarPorApelido(String apelido){
        List<Veterinario> vets = listarVeterinarios();
        for(Veterinario vet : vets){
            if(vet.getApelido().equalsIgnoreCase(apelido)){
                return vet;
            }
        }
        return null;
    }

    public Veterinario buscarPorCrv(String Crv){
        List<Veterinario> vets = listarVeterinarios();
        for(Veterinario vet : vets){
            if(vet.getCrv().equalsIgnoreCase(Crv)){
                return vet;
            }
        }
        return null;
    }

    public Boolean removerPorNome(String nome){
        List<Veterinario> vets = listarVeterinarios();

        Veterinario encontrou = null;

        for(Veterinario vet : vets){
            if(vet.getNome().equalsIgnoreCase(nome)){
                encontrou = vet;
                break;
            }
        }
        if(encontrou!=null){
            vets.remove(encontrou);
            salvarListaNoArquivo(vets);
            return true;
        }
        return false;
    }

    public Boolean removerPorApelido(String apelido){
        List<Veterinario> vets = listarVeterinarios();

        Veterinario encontrou = null;

        for(Veterinario vet : vets){
            if(vet.getApelido().equalsIgnoreCase(apelido)){
                encontrou = vet;
                break;
            }
        }
        if(encontrou!=null){
            vets.remove(encontrou);
            salvarListaNoArquivo(vets);
            return true;
        }
        return false;
    }

    public Boolean removerPorCrv(String crv){
        List<Veterinario> vets = listarVeterinarios();
        Veterinario encontrou = null;

        for(Veterinario vet : vets){
            if(vet.getCrv().equalsIgnoreCase(crv)){
                encontrou = vet;
                break;
            }
        }
        if(encontrou!=null){
            vets.remove(encontrou);
            salvarListaNoArquivo(vets);
            return true;
        }
        return false;
    }

    private void salvarListaNoArquivo(List<Veterinario> veterinarios){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
            for(Veterinario v : veterinarios){
                bw.write(v.getNome() + "|" + v.getApelido() + "|" + v.getCrv());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            System.out.println("Erro ao salvar Lista: " + e.getMessage());
        }
    }

}