/*
 * Copyright 2015-2017 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.platform.spring.test;

/**
 * Exception that is used when testing controllers.
 *
 * @author Hendrik Ebbers
 */
public class ControllerTestException extends RuntimeException {

    private static final long serialVersionUID = 3143922465764428023L;

    /**
     * Constructor
     */
    public ControllerTestException() {
    }

    /**
     * Constructor
     * @param message detailed message
     */
    public ControllerTestException(String message) {
        super(message);
    }

    /**
     * Constructor
     * @param message detailed message
     * @param cause the cause
     */
    public ControllerTestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     * @param cause the cause
     */
    public ControllerTestException(Throwable cause) {
        super(cause);
    }
}