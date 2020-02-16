package pl.akademiacodu.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademiacodu.gifs.model.Gif;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explposion", "mols", true, 1),
            new Gif("ben-and-mike", "nika", true, 2),
            new Gif("book-dominos", "mem", true, 0)
    );

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }


}
