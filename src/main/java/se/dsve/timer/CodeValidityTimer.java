package se.dsve.timer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CodeValidityTimer {

    LocalDateTime codeGenerationTime;
    private static final long VALIDITY_PERIOD_SECONDS = 0;

    public void startTimer() {
        // TODO: Skriv din kod här
        codeGenerationTime = LocalDateTime.now();

    }

    public boolean isTimeValid() {
        // TODO: Skriv din kod här
        long secondsElapsed = ChronoUnit.SECONDS.between(codeGenerationTime, LocalDateTime.now());
    return secondsElapsed <= VALIDITY_PERIOD_SECONDS;
}
}
