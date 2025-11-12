package kelaniya.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private String shelfLocation;
}
