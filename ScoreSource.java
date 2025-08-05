import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String scoreLine) {
        ScoreEvent event = new ScoreEvent(scoreLine);
        notifyListeners(event);
    }

    private void notifyListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChanged(event);
        }
    }
}
