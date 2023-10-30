package ua.edu.ucu.apps.lab71.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {
    public final FlowerService flowerService;
    
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("list")
    public List<Flower> getFlowers() {
        return List.of(new Flower(5, 10, FlowerColor.BLUE));
    }
}
