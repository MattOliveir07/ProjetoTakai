package exceptions;

@SuppressWarnings("serial")
public class EmptyPilhaException 
    extends RuntimeException {
    public EmptyPilhaException(String erro) {
        super(erro);
    }
}

