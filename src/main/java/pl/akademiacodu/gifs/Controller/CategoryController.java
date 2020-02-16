package pl.akademiacodu.gifs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiacodu.gifs.model.Category;
import pl.akademiacodu.gifs.model.Gif;
import pl.akademiacodu.gifs.repository.CategoryRepository;
import pl.akademiacodu.gifs.repository.GifRepository;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/categories")
    public String getAllCategories(ModelMap modelMap) {
        List<Category> categoryList = categoryRepository.getAllCategories();

        modelMap.put("categories", categoryList);

        return "categories";
    }

    @GetMapping("/category/{id}")
    public String GifsCategory(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.getCategoryById(id);

        List<Gif> gifs = gifRepository.getGifsByCategory(id);

        modelMap.put("category", category);
        modelMap.put("gifs", gifs);

        return "category";
    }
}
