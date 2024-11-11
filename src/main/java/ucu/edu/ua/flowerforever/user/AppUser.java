package ucu.edu.ua.flowerforever.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class AppUser {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;
    private LocalDate dob;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public String getEmail() {
        return email;

    }
}
