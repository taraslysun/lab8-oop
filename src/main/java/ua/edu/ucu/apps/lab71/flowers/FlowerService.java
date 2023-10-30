package ua.edu.ucu.apps.lab71.flowers;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(new Flower(5, 10, FlowerColor.BLUE));
    }
}
