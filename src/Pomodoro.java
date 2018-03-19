import java.util.Timer;

public class Pomodoro {

    private  Timer [] taskTimers;
    private Timer[] shortBreaks;
    private Timer longBreak;

    public Pomodoro() {

        taskTimers = new Timer[4];

        for(int i = 0; i < 4; i++) {
            taskTimers[i] = new Timer("Timer-" + i+1);
        }

        shortBreaks = new Timer[3];
        for(int i= 0; i < 3; i++) {
            shortBreaks[i] = new Timer("ShortBreak-" + i+1);
        }

        longBreak = new Timer("LongBreak");

    }

    public void StartTaskTimer(int pomodoroNumber) {

    }


    public void TakeShortBreak(int breakNumber) {

    }

    public void TakeLongBreak() {

    }
}
