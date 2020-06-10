package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosterMovies {
    private int id;
    private String imageUrl;
    private String movieName;
    private String movieGenre;

}
