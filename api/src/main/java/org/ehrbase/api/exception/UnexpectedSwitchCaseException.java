/*
 * Copyright (c) 2019 vitasystems GmbH and Hannover Medical School.
 *
 * This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.api.exception;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * This exception is thrown when a case has occurred in a switch block that cannot be handled correctly.
 * </p>
 * <p>
 * Typical uses in a switch statement:
 * <ol>
 * <li>unexpected default case</li>
 * <li>explicitly not sensibly treatable case</li>
 * <li>unexpected default case with fall-through of not sensibly treatable case (combination of 1. and 2.)</li>
 * </ol>
 *
 * @author Jan Falkenstern, Stefan Kock
 */
@AllArgsConstructor
@Getter
public class UnexpectedSwitchCaseException extends RuntimeException {

    private static final long serialVersionUID = 5695009820197756438L;

    private final Class<?> entity;
    private final String entityId;

    public static String formatMessage(Enum<?> enumValue) {

        return formatMessage(enumValue.getClass().getSimpleName(), enumValue.name(), null);
    }

    /**
     * Creates the message of a {@link UnexpectedSwitchCaseException} based on the given parameters.
     *
     * @param type              e.g. <code>enumValue.getClass().getSimpleName()</code>
     * @param value             unsupported value in switch
     * @param additionalMessage additional text for generated message (optional)
     * @return formatted string
     */
    public static String formatMessage(String type, Object value, String additionalMessage) {

        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value");

        if (StringUtils.isNotBlank(type)) {
            sb.append(" of ");
            sb.append(type);
        }

        sb.append(": '");
        sb.append(value);
        sb.append("'");

        if (StringUtils.isNotBlank(additionalMessage)) {
            sb.append("; ");
            sb.append(additionalMessage);
        }

        return sb.toString();
    }
}
