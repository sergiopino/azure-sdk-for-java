/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ManagedPipelineMode.
 */
public enum ManagedPipelineMode {
    /** Enum value Integrated. */
    INTEGRATED("Integrated"),

    /** Enum value Classic. */
    CLASSIC("Classic");

    /** The actual serialized value for a ManagedPipelineMode instance. */
    private String value;

    ManagedPipelineMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ManagedPipelineMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ManagedPipelineMode object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagedPipelineMode fromString(String value) {
        ManagedPipelineMode[] items = ManagedPipelineMode.values();
        for (ManagedPipelineMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
