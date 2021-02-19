package moduledao.dao.models;

import lombok.Data;
import moduledao.dao.models.User;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_information")
public class UserInformation {
    @GenericGenerator(
            name = "generator",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "user"
            ))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;
}
