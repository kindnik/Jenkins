package appleInsider;

public enum Counries {
    ЧЕЛЯБИНСКАЯ_ОБЛАСТЬ_МАГНИТОГОРМК("Челябинская область", "Магнитогорск"),
    ЧЕЛЯБИНСКАЯ_ОБЛАСТЬ_УФА("Челябинская область", "Уфа");

    private String область;
    private String город;

    Counries(String область, String город) {
        this.область = область;
        this.город = город;
    }

    public String getОбласть() {
        return область;
    }

    public String getГород() {
        return город;
    }
}
