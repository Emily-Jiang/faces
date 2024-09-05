/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2021 Contributors to Eclipse Foundation.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.faces.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.enterprise.util.TypeLiteral;
import jakarta.inject.Qualifier;

/**
 * <p class="changed_added_2_3">
 * The presence of this annotation (along with {@code @Inject}) on a field of type <code>Map&lt;String,
 * Object&gt;</code> causes the map returned from {@link jakarta.faces.component.UIViewRoot#getViewMap} to be injected
 * as the value of that field.
 * </p>
 */

@Target({ TYPE, METHOD, PARAMETER, FIELD })
@Qualifier
@Retention(value = RUNTIME)
public @interface ViewMap {

    /**
     * <p class="changed_added_5_0">
     * Instance of the generic {@link ViewMap} type.
     * </p>
     */
    public static final TypeLiteral<Map<String, Object>> TYPE = new TypeLiteral<>() {
        private static final long serialVersionUID = 1L;
    };

    /**
     * <p class="changed_added_4_0">
     * Supports inline instantiation of the {@link ViewMap} qualifier.
     * </p>
     *
     * @since 4.0
     */
    public static final class Literal extends AnnotationLiteral<ViewMap> implements ViewMap {
        private static final long serialVersionUID = 1L;

        /**
         * Instance of the {@link ViewMap} qualifier.
         */
        public static final Literal INSTANCE = new Literal();
    }
}
