package moduledao.dao.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    private int id;
    private String username;
    @Column(unique = true)
    private String email;
    @NotNull
    private String password;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @OneToOne(
            fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private UserInformation userInformation;
}
