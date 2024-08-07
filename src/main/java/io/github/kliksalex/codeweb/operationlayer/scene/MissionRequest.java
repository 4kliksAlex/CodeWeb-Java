package io.github.kliksalex.codeweb.operationlayer.scene;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MissionRequest {
    private Map<String, Strategy> additionalProperties;

    @Data
    public static class Strategy {
        private List<QueueItem> STRATEGY_QUEUE;
        private Boolean ITER;
        private List<String> GET_OUTPUT;

        @Data
        public static class QueueItem {
            private String ID;
            private String FUNC;
            private Map<String, String> ARGS;
        }
    }
}