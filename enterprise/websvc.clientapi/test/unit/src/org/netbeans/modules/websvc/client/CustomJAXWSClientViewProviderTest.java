/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.websvc.api;

import org.netbeans.junit.NbTestCase;
import org.netbeans.modules.websvc.api.jaxws.client.JAXWSClientView;
import org.netbeans.modules.websvc.spi.jaxws.client.JAXWSClientViewProvider;
import org.openide.util.Lookup;

/**
 *
 * @author Lukas Jungmann
 */
public class CustomJAXWSClientViewProviderTest extends NbTestCase {
    
    static {
        CustomJAXWSClientViewProviderTest.class.getClassLoader().setDefaultAssertionStatus(true);
    }
    
    /** Creates a new instance of CustomJAXWSClientViewProviderTest */
    public CustomJAXWSClientViewProviderTest(String name) {
        super(name);
    }
    
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testProviders() throws Exception {
        Lookup.Result res = Lookup.getDefault().lookup(new Lookup.Template(JAXWSClientViewProvider.class));
        assertEquals("there should be 1 instance - from websvc/clientapi", 1, res.allInstances().size());
    }
    
    public void testGetWebServicesClientView() {
        JAXWSClientView view = JAXWSClientView.getJAXWSClientView();
        assertNotNull("found view support", view);
    }
    
}
