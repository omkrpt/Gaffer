/*
 * Copyright 2016 Crown Copyright
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

package uk.gov.gchq.gaffer.commonutil.exception;

/**
 * An {@code UnauthorisedException} is a {@link java.lang.RuntimeException} that
 * will be when an unauthorised action is attempted.
 */
public class UnauthorisedException extends RuntimeException {
    private static final long serialVersionUID = -7137572738792227437L;

    public UnauthorisedException(final String message) {
        super(message);
    }

    public UnauthorisedException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
