package com.gpt.enginneer;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author chenzhiyu
 * @date 2023/6/26
 */
@Data
@Accessors(chain = true)
public class StepConfig {

    private String openKey;

    private String projectPath;

    private Boolean deleteExisting;

    private String model;

    private Double temperature;

    private StepType type;

    private Boolean println;



}
