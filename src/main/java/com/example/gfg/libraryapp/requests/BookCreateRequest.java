package com.example.gfg.libraryapp.requests;

import com.example.gfg.libraryapp.models.Author;
import com.example.gfg.libraryapp.models.BookCategory;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookCreateRequest {

    private String name;
    private int cost;
    private BookCategory bookCategory;
    private Author author;

}
