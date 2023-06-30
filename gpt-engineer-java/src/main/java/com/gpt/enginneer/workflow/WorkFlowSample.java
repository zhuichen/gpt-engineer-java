package com.gpt.enginneer.workflow;

import com.google.common.collect.Maps;
import com.gpt.enginneer.model.Message;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author chenzhiyu
 * @date 2023/6/29
 */
@RequiredArgsConstructor
public class WorkFlow {

    private final StepService stepService;

    private final static Map<WorkFlowType, List<Function>> ACTIONS = Maps.newHashMap();

    public void register() {
        // default 
        ACTIONS.put(WorkFlowType.DEFAULT, List.of(
                (Function<String, List<Message>>) stepService::genEntrypoint
        ));
    }

}
