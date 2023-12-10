package com.example.angular_spring_crud.Serveur;
import com.example.angular_spring_crud.Serveur.enumeration.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serveur {
    @Id 
    @GeneratedValue
   private Long id;
   @Column(unique = true)
   @NotEmpty(message = "IP adress connot be impty or null")
    private String ipAddress;
    private String name;
    private String type;
    private String memory;
    private String imageUrl;
    private Status Status;

    
}
