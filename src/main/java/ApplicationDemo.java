import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ApplicationDemo {
    public static void main(String[] args) {
        SessionFactory factory = null;
        factory = new Configuration().configure().buildSessionFactory();
        EngineDAO engineDAD = new EngineDAO(factory);
        Engine engine = new Engine();
        engine.setModel("engine_model_05");
        engine.setPower(1230);

        engineDAD.create(engine);

        final  Engine result = engineDAD.read("engine_model_05");
        System.out.println(String.format("Cчитан новый объект модели %s и мощности %d лошадиных сил", result.getModel(), result.getPower()));
    }

}
