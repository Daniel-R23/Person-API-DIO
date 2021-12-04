package com.dio.personAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME("nome"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
