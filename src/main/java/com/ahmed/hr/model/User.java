package com.ahmed.hr.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sec_user_roles"
            , joinColumns = @JoinColumn(name= "user_id")
            , inverseJoinColumns = @JoinColumn (name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    //	@OneToOne(mappedBy = "user" , fetch = FetchType.LAZY)
//	private Employee employee;

    public void addRole (Role role) {
        roles.add(role);
    }

}





