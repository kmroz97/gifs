package pl.akademiacodu.gifs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiacodu.gifs.model.Gif;
import pl.akademiacodu.gifs.repository.GifRepository;

import java.util.List;

@Controller
public class GifsController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    @ResponseBody
    public List<Gif> hello() {
        return gifRepository.getAllGifs();
    }
}
