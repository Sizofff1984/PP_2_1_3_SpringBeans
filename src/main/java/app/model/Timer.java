package app.model;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Timer {
    private final Long time;

    public Timer() {
        this.time = new Date().getTime();
    }

    public Long getTime() {
        return time;
    }
}