package rocketseat.com.passin.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocketseat.com.passin.domain.attendee.Attendee;
import rocketseat.com.passin.domain.event.Event;
import rocketseat.com.passin.dto.event.EventResponseDTO;
import rocketseat.com.passin.repository.AttendeeRepository;
import rocketseat.com.passin.repository.EventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

    public EventResponseDTO getEventDetail(String eventId) {
        Event event = this.eventRepository.findById(eventId).orElseThrow(
                () -> new RuntimeException("Event not foud with ID:" + eventId));

        List<Attendee> attendeesList = this.attendeeRepository.findByEventId(eventId);
        return new EventResponseDTO(event, attendeesList.size());
    }
}
