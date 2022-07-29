// 6. Ecrivez votre propre classe d'exception MagasinPleinException
public class MagasinPleinException extends ArrayIndexOutOfBoundsException {
    public MagasinPleinException(String s) {
        super(s);
    }
}
