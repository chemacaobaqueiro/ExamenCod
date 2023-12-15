public class Record {

    private String alias;
    private int aciertos;

    public void RecordAlias(String alias) {
        this.alias = alias;
    }

    public void RecordAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public String getAlias() {
        return alias;
    }

    public int getAciertos() {
        return aciertos;
    }
}
