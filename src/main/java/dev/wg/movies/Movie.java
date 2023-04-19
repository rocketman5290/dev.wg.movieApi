package dev.wg.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
//from LOMBOK dependency
//https://auth0.com/blog/a-complete-guide-to-lombok/
@Data //handles all getters setters and equals hashing. Thanks LOMBOK.
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrop;

    //Causes only the id's of the review to be stored,
    // manual reference relationship in mongoDB
    @DocumentReference
    //Embedded relationship, one to many(if remove the above annotation)
    private List<Review> reviewIds;
}
