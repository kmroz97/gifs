package pl.akademiacodu.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademiacodu.gifs.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", true, 2),
            new Gif("book-dominos", "mem", false, 0),
            new Gif("compiler-bot", "bot", false, 1)
    );

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    private static List<Gif> FAVORITE_GIFS = new ArrayList<>();

    public List<Gif> getFavoriteGifs() {

        return ALL_GIFS.stream()
                .filter(Gif::getFavorite)
                .collect(Collectors.toList());
    }
}
