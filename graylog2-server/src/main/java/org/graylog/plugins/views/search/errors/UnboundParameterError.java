/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.views.search.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.graylog.plugins.views.search.Query;
import org.graylog.plugins.views.search.Query;

public class UnboundParameterError extends QueryError {
    private final String parameterName;

    public UnboundParameterError(Query query, String name) {
        super(query, "Unbound required parameter used: " + name);
        this.parameterName = name;
    }

    @JsonProperty("parameter")
    public String parameterName() {
        return parameterName;
    }
}
