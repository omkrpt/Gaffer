/*
 * Copyright 2024 Crown Copyright
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

package uk.gov.gchq.gaffer.federated.simple.operation;

import com.fasterxml.jackson.core.type.TypeReference;

import org.apache.commons.lang3.exception.CloneFailedException;

import uk.gov.gchq.gaffer.operation.Operation;
import uk.gov.gchq.gaffer.operation.io.Output;
import uk.gov.gchq.gaffer.operation.serialisation.TypeReferenceImpl;
import uk.gov.gchq.koryphe.Since;
import uk.gov.gchq.koryphe.Summary;

import java.util.Map;
import java.util.Set;

@Since("2.4.0")
@Summary("Get all the graph IDs available to a federated store")
public class GetAllGraphIds implements Output<Set<String>> {

    private Map<String, String> options;

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public void setOptions(final Map<String, String> options) {
        this.options = options;
    }

    @Override
    public Operation shallowClone() throws CloneFailedException {
        return new GetAllGraphIds();
    }

    @Override
    public TypeReference<Set<String>> getOutputTypeReference() {
        return new TypeReferenceImpl.Set<>();
    }

    public static class Builder extends Operation.BaseBuilder<GetAllGraphIds, Builder> {
        public Builder() {
            super(new GetAllGraphIds());
        }
    }

}
