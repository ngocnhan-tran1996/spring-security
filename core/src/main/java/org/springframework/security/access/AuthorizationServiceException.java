/*
 * Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.access;

import java.io.Serial;

/**
 * Thrown if an authorization request could not be processed due to a system problem.
 * <p>
 * This might be thrown if an <code>AccessDecisionManager</code> implementation could not
 * locate a required method argument, for example.
 *
 * @author Ben Alex
 */
public class AuthorizationServiceException extends AccessDeniedException {

	@Serial
	private static final long serialVersionUID = 4817857292041606900L;

	/**
	 * Constructs an <code>AuthorizationServiceException</code> with the specified
	 * message.
	 * @param msg the detail message
	 */
	public AuthorizationServiceException(String msg) {
		super(msg);
	}

	/**
	 * Constructs an <code>AuthorizationServiceException</code> with the specified message
	 * and root cause.
	 * @param msg the detail message
	 * @param cause root cause
	 */
	public AuthorizationServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
