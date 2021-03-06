/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jdbc.mapping.event;

import java.util.Optional;

import org.springframework.data.jdbc.core.conversion.AggregateChange;
import org.springframework.data.jdbc.mapping.event.Identifier.Specified;

/**
 * A {@link SimpleJdbcEvent} guaranteed to have an identifier.
 *
 * @author Jens Schauder
 * @since 2.0
 */
public class JdbcEventWithId extends SimpleJdbcEvent implements WithId {

	private static final long serialVersionUID = -8071323168471611098L;

	private final Specified id;

	public JdbcEventWithId(Specified id, Optional<Object> entity, AggregateChange change) {

		super(id, entity, change);

		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.data.jdbc.mapping.event.JdbcEvent#getId()
	 */
	@Override
	public Specified getId() {
		return id;
	}
}
