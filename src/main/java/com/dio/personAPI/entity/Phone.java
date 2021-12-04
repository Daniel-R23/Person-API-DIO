package com.dio.personAPI.entity;

import com.dio.personAPI.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Getter and Setter
@Builder //Padrão de projetos para Constructor
@AllArgsConstructor //Insere os constructors com todos os argumentos
@NoArgsConstructor  //Insere os constructors com nenhum argumento
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
