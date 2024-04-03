package se.dsve.timer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CodeValidityTimer {
    private static LocalDateTime codeGenerationTime;
    private static final long VALIDITY_PERIOD_SECONDS = 60;

    public CodeValidityTimer() {
        startTimer();
    }

    public static boolean isCodeValid(String code) {
        return isTimeValid();
    }

    public void startTimer() {
        codeGenerationTime = LocalDateTime.now();
    }

    public static boolean isTimeValid() {
        long secondsElapsed = 0;
        if (codeGenerationTime != null) {
            secondsElapsed = ChronoUnit.SECONDS.between(codeGenerationTime, LocalDateTime.now());
        }
        return secondsElapsed <= VALIDITY_PERIOD_SECONDS;
    }

    public static LocalDateTime getCodeGenerationTime() {
        return codeGenerationTime;
    }
}