package lab3;

public class PUPU {
    private static PUPU example;

    private PUPU(){
    }
    public static PUPU getExample() {
        if (example == null) {
            example = new PUPU();
        }
        return example;
    }
}
