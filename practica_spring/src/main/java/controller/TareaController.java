package controller;

import model.Tarea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    private List<Tarea> tareas = new ArrayList<>();
    public TareaController(List<Tarea> tareas) {
        tareas.add(new Tarea(1, "tarea 1", false));
        tareas.add(new Tarea(2, "tarea 2", true));
    }
    @GetMapping
    public List<Tarea> getTareas() {
        return tareas;
    }

}







