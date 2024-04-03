package rocketseat.com.passin.dto.attendee;

import java.time.LocalDateTime;

public record AttendeeDetailsDTO(
        String id,
        String namel,
        String email,
        LocalDateTime created,
        LocalDateTime checkendInAt
) {
}
