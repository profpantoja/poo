package br.cefet.controller;
    import br.cefet.view.*;
    import br.cefet.dao.*;
    import br.cefet.model.*;

public class AtendenteController {
     private AtendenteDAO adao = new AtendenteDAO();
     private AtendenteView aview = new AtendenteView();

     public void startAtendente() {
         int option;
         do {
             option = aview.getMenuOption();

             switch(option) {
                 case 1:
                     registerAtendente();
                     break;
                 case 2:
                     deleteAtendente();
                     break;
                 case 3:
                     showAtendentes();
                     break;
                case 4:
                     updateAtendente();
                     break;
                 case 0:
                     aview.exibirMensagem("Saindo...");
                     break;
                 default:
                     aview.exibirMensagem("Opção inválida.");
             }
         } while(option != 0);
     }

    public void registerAtendente() {
        Atendente novoAtendente = aview.getInformation();
        novoAtendente.setIdAtendente(adao.getNextId());
        adao.saveOnCSVFile(novoAtendente);
        aview.exibirMensagem("Atendente cadastrado com sucesso!");
    }

    public void deleteAtendente() {
        int id = aview.getIdRemover();
        boolean success = adao.delete(id);
        if(success) {
            aview.exibirMensagem("Atendente removido com sucesso");
        } else {
            aview.exibirMensagem("Atendente não encontrado.");
        }
    }
    
    public void showAtendentes() {
        aview.showAtendentes(adao.getAtendentes());
    }
    
    public void updateAtendente() {
        int id = aview.getIdUpdate();
        Atendente atendente = adao.getAtendenteById(id);
        if(atendente != null) {
            Atendente updatedAtendente = aview.getInformation();
            updatedAtendente.setIdAtendente(id);
            adao.update(updatedAtendente);
            aview.exibirMensagem("Atendente atualizado com sucesso!");
        } else {
            aview.exibirMensagem("Atendente não encontrado.");
        }
    }
}
