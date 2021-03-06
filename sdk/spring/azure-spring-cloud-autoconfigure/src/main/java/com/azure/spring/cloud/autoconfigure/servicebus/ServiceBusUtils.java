// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.servicebus;

/**
 * Util class for Service Bus.
 */
public class ServiceBusUtils {

    public static String getNamespace(String connectionString) {
        String prefix = "Endpoint=sb://";
        int start = connectionString.indexOf(prefix) + prefix.length();
        return connectionString.substring(start, connectionString.indexOf('.', start));
    }

}
