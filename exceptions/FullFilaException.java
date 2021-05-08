package exceptions;

@SuppressWarnings("serial")

public class FullFilaException extends RuntimeException {
    public FullFilaException(String erro) {
        super(erro);
    }
}
