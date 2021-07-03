package com.pinnika.builder.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Student
{
    private final String firstName;
    private final String lastName;
    private final int studentId;
    private final String email;
    private final String country;
}