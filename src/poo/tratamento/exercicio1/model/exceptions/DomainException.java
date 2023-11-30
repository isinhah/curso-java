package src.poo.tratamento.exercicio1.model.exceptions;

public class DomainException extends Exception {

    //Permite instanciar o construtor passando uma mensagem para ela
    public DomainException(String msg) {
        super(msg);
    }
}
