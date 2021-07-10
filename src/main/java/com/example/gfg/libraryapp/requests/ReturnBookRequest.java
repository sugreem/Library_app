package com.example.gfg.libraryapp.requests;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReturnBookRequest {

    private int studentId;
    private int bookId;
    private String remarks;
}
