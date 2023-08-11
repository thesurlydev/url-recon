package ai.reclaim.interview.job;

import java.util.List;
import java.util.Optional;

public interface Job {
    String getUserId();

    default Optional<List<Job>> execute() {
        return Optional.empty();
    }
}
