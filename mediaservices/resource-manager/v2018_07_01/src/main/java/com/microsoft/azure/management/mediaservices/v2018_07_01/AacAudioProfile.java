/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AacAudioProfile.
 */
public final class AacAudioProfile extends ExpandableStringEnum<AacAudioProfile> {
    /** Static value AacLc for AacAudioProfile. */
    public static final AacAudioProfile AAC_LC = fromString("AacLc");

    /** Static value HeAacV1 for AacAudioProfile. */
    public static final AacAudioProfile HE_AAC_V1 = fromString("HeAacV1");

    /** Static value HeAacV2 for AacAudioProfile. */
    public static final AacAudioProfile HE_AAC_V2 = fromString("HeAacV2");

    /**
     * Creates or finds a AacAudioProfile from its string representation.
     * @param name a name to look for
     * @return the corresponding AacAudioProfile
     */
    @JsonCreator
    public static AacAudioProfile fromString(String name) {
        return fromString(name, AacAudioProfile.class);
    }

    /**
     * @return known AacAudioProfile values
     */
    public static Collection<AacAudioProfile> values() {
        return values(AacAudioProfile.class);
    }
}