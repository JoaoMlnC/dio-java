package metodos;

public class Mensagem {

    public void mensagem(int hora) {
        if (hora >= 5 && hora <= 12) {
            mensagemBomDia();
        } else if (hora >= 13 && hora <= 17) {
            mensagemBoaTarde();
        } else {
            mensagemBoaNoite();
        }
    }

    public void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }

    public void mensagemBoaNoite() {
        System.out.println("Boa Noite!");
    }

}
