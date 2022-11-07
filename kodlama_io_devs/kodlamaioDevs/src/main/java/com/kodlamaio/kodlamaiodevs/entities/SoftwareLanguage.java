package com.kodlamaio.kodlamaiodevs.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Table(name = "software_language")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SoftwareLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
