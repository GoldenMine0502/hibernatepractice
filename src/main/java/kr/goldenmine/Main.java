package kr.goldenmine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

// 하이버네이트 짱
// https://onecellboy.tistory.com/350?category=781398
public class Main {
    public static void main(final String[] args) throws Exception {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure(new File("config/hibernate.cfg.xml")).build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Student student = new Student(
                "김태원",
                11,
                "응애",
                "ehe123@naver.com",
                "월",
                20,
                true,
                true,
                "이거 만든놈임"
        );

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student);

        Student received = session.get(Student.class, 1);

        System.out.println(student);
        System.out.println(received);

        tx.commit();
        session.close();
    }

    public static void JDBCConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String id = null;
            String pw = null;
            String db = "test";

            try (BufferedReader reader = new BufferedReader(new FileReader("config/account.txt"))) {
                id = reader.readLine();
                pw = reader.readLine();
            }

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, id, pw);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
