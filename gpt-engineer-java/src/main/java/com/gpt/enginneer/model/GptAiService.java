package com.gpt.enginneer.model;

import com.gpt.enginneer.StepConfig;

import java.util.List;

/**
 * @author chenzhiyu
 * @date 2023/6/27
 */
public class OpenAiService implements AiService {

    private final StepConfig stepConfig;

    private OpenAiService openAiService;

    public OpenAiService(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
        openAiService = new OpenAiService(stepConfig.getOpenKey());
    }

    @Override
    public Message fSystem(String msg) {
        return new Message("system", msg);
    }

    @Override
    public Message fUser(String msg) {
        return new Message("user", msg);
    }

    @Override
    public Message fAssistant(String msg) {
        return new Message("assistant", msg);
    }

    @Override
    public List<Message> next(List<Message> messageList, String prompt) {
        if (prompt != null && !prompt.isEmpty()) {
            messageList.add(new Message("user", prompt));
        }

        return messageList;
    }
}
