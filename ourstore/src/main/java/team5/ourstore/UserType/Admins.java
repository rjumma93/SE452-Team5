package team5.ourstore.UserType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Admins")
public class Admins {
    @Id
    @Column(name="admin_id")
    int id;

    @Column(name="email")
    String email;

    @Column(name="password")
    String pwd;

}
