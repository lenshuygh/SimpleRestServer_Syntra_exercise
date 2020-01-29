package be.lens.syntra.rest.restserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Book {
    private String isbn;
    private String title;
    private String author;
    private float price;
}
