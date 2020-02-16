package pl.akademiacodu.gifs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiacodu.gifs.model.Category;
import pl.akademiacodu.gifs.repository.CategoryRepository;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String getAllCategories(ModelMap modelMap) {
        List<Category> categoryList = categoryRepository.getAllCategories();

        modelMap.put("categories", categoryList);

        return "categories";
    }

    @GetMapping("/categories/{number}")
    public String getGifsFromCategory(ModelMap modelMap) {
        List<Category> categoryList = categoryRepository.getAllCategories();

        modelMap.put("categories", categoryList);

        return "categories";
    }
}
