package com.example.gfg.libraryapp.requests;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentUpdateRequest {

    private String email;
    private int age;
    private String name;
}
