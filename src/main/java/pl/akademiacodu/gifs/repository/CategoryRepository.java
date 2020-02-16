package pl.akademiacodu.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademiacodu.gifs.model.Category;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {


    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
        new Category(0, "funny"),
        new Category(1, "sport"),
        new Category(2, "it")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
