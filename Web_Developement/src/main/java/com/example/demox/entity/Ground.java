package com.example.demox.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="grounds")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Ground {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grounds_setup_seq_gen")
    @SequenceGenerator(name = "grounds_setup_seq_gen", sequenceName = "grounds_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "groundName", nullable = false,length = 100)
    private String groundName;

}
