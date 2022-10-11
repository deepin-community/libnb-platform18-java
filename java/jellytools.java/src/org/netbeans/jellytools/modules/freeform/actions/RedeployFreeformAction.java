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
package org.netbeans.jellytools.modules.freeform.actions;

import org.netbeans.jellytools.Bundle;
import org.netbeans.jellytools.actions.Action;

/** Used to call "Redeploy Project" popup menu item on project's root node.
 * @see Action
 * @see org.netbeans.jellytools.modules.freeform.nodes.FreeformProjectNode
 * @author Martin.Schovanek@sun.com
 */
public class RedeployFreeformAction extends Action {

    private static final String redeployProject = Bundle.getStringTrimmed(
            "org.netbeans.modules.ant.freeform.Bundle",
            "CMD_redeploy");

    /**
     * creates new RunFreeformAction instance
     */    
    public RedeployFreeformAction() {
        super(null, redeployProject);
    }
}
