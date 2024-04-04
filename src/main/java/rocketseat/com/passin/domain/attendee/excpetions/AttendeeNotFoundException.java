package rocketseat.com.passin.domain.attendee.excpetions;

public class AttendeeNotFoundException extends RuntimeException {
    public AttendeeNotFoundException(String message){
        super(message);
    }
}
