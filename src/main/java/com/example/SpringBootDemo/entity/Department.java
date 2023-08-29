package com.example.SpringBootDemo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Department")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="departmentId")
    private Long departmentId;

    @Column(name = "departmentName")
    @NotBlank(message = "PLease add department name")
    private String departmentName;

    @Column(name = "departmentAddress")
    private String departmentAddress;

    @Column(name = "departmentCode")
    private String departmentCode;

}
