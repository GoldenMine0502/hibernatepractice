package kr.goldenmine;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition="int")
    private int id;

    @Column(name = "name", columnDefinition="varchar(10)")
    private String name;

    @Column(name = "birth_year", columnDefinition="int")
    private int birthYear;

    @Column(name = "parent_name", columnDefinition="varchar(10)")
    private String parentName;

    @Column(name = "email", columnDefinition="varchar(50)")
    private String email;

    @Column(name = "time_week", columnDefinition="varchar(5)")
    private String timeWeek;

    @Column(name = "time_hour", columnDefinition="tinyint(1)")
    private int timeHour;

    @Column(name = "tested", columnDefinition="boolean")
    private boolean tested;

    @Column(name = "proceed", columnDefinition="boolean")
    private boolean proceed;

    @Column(name = "others", columnDefinition="varchar(200)")
    private String others;

    public Student() {

    }

    public Student(String name,
                   int birthYear,
                   String parentName,
                   String email,
                   String timeWeek,
                   int timeHour,
                   boolean tested,
                   boolean proceed,
                   String others) {
        this.name = name;
        this.birthYear = birthYear;
        this.parentName = parentName;
        this.email = email;
        this.timeWeek = timeWeek;
        this.timeHour = timeHour;
        this.tested = tested;
        this.proceed = proceed;
        this.others = others;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getParentName() {
        return parentName;
    }

    public String getEmail() {
        return email;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public String getTimeWeek() {
        return timeWeek;
    }

    public String getOthers() {
        return others;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", parentName='" + parentName + '\'' +
                ", email='" + email + '\'' +
                ", timeWeek='" + timeWeek + '\'' +
                ", timeHour=" + timeHour +
                ", tested=" + tested +
                ", proceed=" + proceed +
                ", others='" + others + '\'' +
                '}';
    }
}
