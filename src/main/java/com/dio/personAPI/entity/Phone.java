package com.dio.personAPI.entity;

import com.dio.personAPI.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // Reconhecida como entidade
@Data //Getter and Setter
@Builder //Padrão de projetos para Constructor
@AllArgsConstructor //Insere os constructors com todos os argumentos
@NoArgsConstructor  //Insere os constructors com nenhum argumento
public class Phone {
    @Id // Indica que é uma PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Estratégia de geração dos ID(incremento)
    private Long id;

    @Enumerated(EnumType.STRING) //Insere os dados da PhoneType como string
    @Column(nullable = false) // Indica que essa coluna não pode ser null
    private PhoneType type;

    @Column(nullable = false) // Indica que essa coluna não pode ser null
    private String number;
}
