package rocketseat.com.passin.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rocketseat.com.passin.domain.attendee.Attendee;
import rocketseat.com.passin.domain.checkin.Checkin;
import rocketseat.com.passin.domain.checkin.exceptions.CheckinAlreadyExistsException;
import rocketseat.com.passin.repository.CheckinRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CheckinService {
    private final CheckinRepository checkInRepository;

    public void registerCheckIn(Attendee attendee){
        this.verifyCheckInExists(attendee.getId());

        Checkin newCheckin = new Checkin();
        newCheckin.setAttendee(attendee);
        newCheckin.setCreatedAt(LocalDateTime.now());

        this.checkInRepository.save(newCheckin);
    }

    public Optional<Checkin> getCheckIn(String attendeeId){
        return this.checkInRepository.findByAttendeeId(attendeeId);
    }

    private void verifyCheckInExists(String attendeeId){
        Optional<Checkin> isCheckedIn = this.checkInRepository.findByAttendeeId(attendeeId);

        if(isCheckedIn.isPresent()){
            throw new CheckinAlreadyExistsException("Attendee already checked in");
        }
    }
}
