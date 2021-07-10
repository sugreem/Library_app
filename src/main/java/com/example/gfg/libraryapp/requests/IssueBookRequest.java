package com.example.gfg.libraryapp.requests;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueBookRequest {

    private int studentId;
    private int bookId;
}
