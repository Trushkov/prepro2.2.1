package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "series")
    private int series;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {
    }

    public Car(int series, String name) {
        this.series = series;
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public String getName() {
        return name;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series=" + series +
                ", name='" + name + '}';
    }
}
