import com.github.javafaker.App;
import org.checkerframework.checker.units.qual.A;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        Configuration con =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(ApplyingStatusCodes.class);
        StandardServiceRegistry reg =
                new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        System.out.println(session.find(ApplyingStatusCodes.class, "01"));

        tx.commit();
    }
}
