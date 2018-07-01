package com.example.beanvalidationcontainerconstraints;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.validation.constraints.NotEmpty;

public final class SampleJavaPayload {

    private final @NotEmpty String name;

    private final @NotEmpty Map<String, @NotEmpty String> someMap;

    @JsonCreator
    SampleJavaPayload(@JsonProperty("name") String name, @JsonProperty("someMap") Map<String, String> someMap) {
        this.name = name;
        this.someMap = someMap;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getSomeMap() {
        return someMap;
    }
}
