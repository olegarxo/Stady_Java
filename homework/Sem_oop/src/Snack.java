public class Snack extends Product  {
    private String tast;
    public Snack(String name, double cost, String tast) {
        super(name, cost);
        this.tast = tast;
    }

    public String getTast() {
        return tast;
    }

    public void setTast(String tast) {
        this.tast = tast;
    }
}
