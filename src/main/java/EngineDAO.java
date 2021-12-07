import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.PersistenceException;

public class EngineDAO {
    private final SessionFactory factory;
    public EngineDAO(final SessionFactory factory){
        this.factory = factory;
    }
    public void create(final Engine engine){
        try(final Session session = factory.openSession()){

            session.beginTransaction();

            session.save(engine);

            session.getTransaction().commit();
        }
        catch (PersistenceException e) {
            System.out.println("Объект с таким именем уже существует");
        }

    }
    public Engine read(final String model) {
        try(final Session session = factory.openSession()){
            final Engine result = session.get(Engine.class, model);
            return result != null ? result : new Engine();
        }
    }

}
