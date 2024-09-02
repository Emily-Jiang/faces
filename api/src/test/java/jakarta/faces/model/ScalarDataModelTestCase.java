/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
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

package jakarta.faces.model;

import org.junit.jupiter.api.BeforeEach;

/**
 * <p>
 * Unit tests for {@link ScalarDataModel}.</p>
 */
class ScalarDataModelTestCase extends DataModelTestCaseBase {

    // ------------------------------------------------------ Instance Variables
    // ---------------------------------------------------- Overall Test Methods
    // Set up instance variables required by this test case.
    @BeforeEach
    void setUp() throws Exception {
        beans = new MockedJavaBean[1];
        beans[0] = new MockedJavaBean();
        configure();
        model = new ScalarDataModel<MockedJavaBean>(beans[0]);
    }

    // ------------------------------------------------- Individual Test Methods
    // ------------------------------------------------------- Protected Methods
}
