package rocketseat.com.passin.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rocketseat.com.passin.services.EventService;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getEvent(@PathVariable String id){
        this.eventService.getEventDetail(id);
        return  ResponseEntity.ok().body("sucesso");
    }
}
