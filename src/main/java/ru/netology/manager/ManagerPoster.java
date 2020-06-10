package ru.netology.manager;

import ru.netology.domain.PosterMovies;

public class ManagerPoster {
    private PosterMovies[] movies = new PosterMovies[0];

    public void add(PosterMovies movie) {
        int length = movies.length + 1;
        PosterMovies[] tmp = new PosterMovies[length];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;

        movies = tmp;
    }

    public PosterMovies[] getAll() {
        PosterMovies[] result = new PosterMovies[movies.length];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];

        }
        return result;
    }
}