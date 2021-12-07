import net.bytebuddy.build.ToStringPlugin;

public class Engine {
    private String model;
    private int power;

    public Engine() {}

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString(){
        return "model " + model + " power " + power;
    }
}
