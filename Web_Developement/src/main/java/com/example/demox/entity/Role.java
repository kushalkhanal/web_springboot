package com.example.demox.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;


@Entity
@Table(name="roles")
@Getter
@Setter
public class Role {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_setup_seq_gen")
    @SequenceGenerator(name = "roles_setup_seq_gen", sequenceName = "roles_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="roleName",nullable = false,length = 100)
    private String roleName;

    @Column(name = "roleType", nullable = false,length = 100)
    private String roleType;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "roles_users",
            foreignKey = @ForeignKey(name = "FK_roles_users_id"),
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_role_user_id"),
            inverseJoinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_roles_users_role_id_user",
                    columnNames = {"role_id", "user_id"})
    )
    private Collection<User> users;


}
