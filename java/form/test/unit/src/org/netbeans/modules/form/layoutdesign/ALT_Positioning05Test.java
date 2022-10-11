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

package org.netbeans.modules.form.layoutdesign;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.openide.filesystems.FileUtil;

public class ALT_Positioning05Test extends LayoutTestCase {

    public ALT_Positioning05Test(String name) {
        super(name);
        try {
	    className = this.getClass().getName();
	    className = className.substring(className.lastIndexOf('.') + 1, className.length());
            startingFormFile = FileUtil.toFileObject(new File(url.getFile() + goldenFilesPath + className + "-StartingForm.form").getCanonicalFile());
        } catch (IOException ioe) {
            fail(ioe.toString());
        }
    }

    /**
     * Add a new button on the line with jLabel1, below jButton1 slightly left
     * of its left edge (i.e. within parallel group of jButton1 and jLabel1).
     */
    public void doChanges0() {
        ld.externalSizeChangeHappened();
        // > UPDATE CURRENT STATE
        contInterior.put("Form", new Rectangle(0, 0, 505, 300));
        compBounds.put("jScrollPane1", new Rectangle(54, 57, 35, 130));
        baselinePosition.put("jScrollPane1-35-130", new Integer(0));
        compBounds.put("jLabel2", new Rectangle(99, 77, 34, 14));
        baselinePosition.put("jLabel2-34-14", new Integer(11));
        compBounds.put("jLabel1", new Rectangle(413, 136, 34, 14));
        baselinePosition.put("jLabel1-34-14", new Integer(11));
        compBounds.put("jButton1", new Rectangle(163, 73, 73, 23));
        baselinePosition.put("jButton1-73-23", new Integer(15));
        prefPaddingInParent.put("Form-jButton1-0-1", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jScrollPane1-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jLabel1-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        contInterior.put("Form", new Rectangle(0, 0, 505, 300));
        compBounds.put("jScrollPane1", new Rectangle(54, 57, 35, 130));
        baselinePosition.put("jScrollPane1-35-130", new Integer(0));
        compBounds.put("jLabel2", new Rectangle(99, 77, 34, 14));
        baselinePosition.put("jLabel2-34-14", new Integer(11));
        compBounds.put("jLabel1", new Rectangle(413, 136, 34, 14));
        baselinePosition.put("jLabel1-34-14", new Integer(11));
        compBounds.put("jButton1", new Rectangle(163, 73, 73, 23));
        baselinePosition.put("jButton1-73-23", new Integer(15));
        ld.updateCurrentState();
        // < UPDATE CURRENT STATE
        lc = new LayoutComponent("jButton2", false);
        // > START ADDING
        baselinePosition.put("jButton2-73-23", new Integer(15));
        {
            LayoutComponent[] comps = new LayoutComponent[]{lc};
            Rectangle[] bounds = new Rectangle[]{new Rectangle(0, 0, 73, 23)};
            String defaultContId = null;
            Point hotspot = new Point(32, 11);
            ld.startAdding(comps, bounds, hotspot, defaultContId);
        }
        // < START ADDING
        prefPaddingInParent.put("Form-jButton2-1-0", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jButton2-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPadding.put("jButton1-jButton2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPaddingInParent.put("Form-jButton2-0-0", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jButton2-0-1", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPadding.put("jScrollPane1-jButton2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-0", new Integer(4)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-0", new Integer(4)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        // > MOVE
        // > MOVE
        // > MOVE
        {
            Point p = new Point(211, 142);
            String containerId = "Form";
            boolean autoPositioning = true;
            boolean lockDimension = false;
            Rectangle[] bounds = new Rectangle[]{new Rectangle(179, 132, 73, 23)};
            ld.move(p, containerId, autoPositioning, lockDimension, bounds);
        }
        // < MOVE
        prefPaddingInParent.put("Form-jButton2-1-0", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jButton2-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPadding.put("jButton1-jButton2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton1-jButton2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel2-jButton2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jButton1-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-1", new Integer(11)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-2", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel2-1-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPaddingInParent.put("Form-jButton2-0-0", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jButton2-0-1", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPadding.put("jScrollPane1-jButton2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-0", new Integer(6)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jScrollPane1-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-0", new Integer(4)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jLabel1-jButton2-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-0", new Integer(4)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        // > MOVE
        // > MOVE
        // > MOVE
        {
            Point p = new Point(210, 142);
            String containerId = "Form";
            boolean autoPositioning = true;
            boolean lockDimension = false;
            Rectangle[] bounds = new Rectangle[]{new Rectangle(178, 132, 73, 23)};
            ld.move(p, containerId, autoPositioning, lockDimension, bounds);
        }
        // < MOVE
        // > END MOVING
        compPrefSize.put("jButton2", new Dimension(73, 23));
        prefPadding.put("jButton2-jLabel1-0-0-0", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        ld.endMoving(true);
        // < END MOVING
        ld.externalSizeChangeHappened();
        // > UPDATE CURRENT STATE
        contInterior.put("Form", new Rectangle(0, 0, 505, 300));
        compBounds.put("jScrollPane1", new Rectangle(54, 57, 35, 130));
        baselinePosition.put("jScrollPane1-35-130", new Integer(0));
        compBounds.put("jLabel2", new Rectangle(99, 77, 34, 14));
        baselinePosition.put("jLabel2-34-14", new Integer(11));
        compBounds.put("jLabel1", new Rectangle(413, 136, 34, 14));
        baselinePosition.put("jLabel1-34-14", new Integer(11));
        compBounds.put("jButton1", new Rectangle(163, 73, 73, 23));
        baselinePosition.put("jButton1-73-23", new Integer(15));
        compBounds.put("jButton2", new Rectangle(178, 132, 73, 23));
        baselinePosition.put("jButton2-73-23", new Integer(15));
        prefPadding.put("jScrollPane1-jLabel2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPaddingInParent.put("Form-jButton1-0-1", new Integer(10)); // parentId-compId-dimension-compAlignment
        prefPadding.put("jButton2-jLabel1-0-0-0", new Integer(4)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-2", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPadding.put("jButton2-jLabel1-0-0-3", new Integer(18)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        prefPaddingInParent.put("Form-jScrollPane1-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jLabel1-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        prefPaddingInParent.put("Form-jButton2-1-1", new Integer(11)); // parentId-compId-dimension-compAlignment
        contInterior.put("Form", new Rectangle(0, 0, 505, 300));
        compBounds.put("jScrollPane1", new Rectangle(54, 57, 35, 130));
        baselinePosition.put("jScrollPane1-35-130", new Integer(0));
        compBounds.put("jLabel2", new Rectangle(99, 77, 34, 14));
        baselinePosition.put("jLabel2-34-14", new Integer(11));
        compBounds.put("jLabel1", new Rectangle(413, 136, 34, 14));
        baselinePosition.put("jLabel1-34-14", new Integer(11));
        compBounds.put("jButton1", new Rectangle(163, 73, 73, 23));
        baselinePosition.put("jButton1-73-23", new Integer(15));
        compBounds.put("jButton2", new Rectangle(178, 132, 73, 23));
        baselinePosition.put("jButton2-73-23", new Integer(15));
        prefPadding.put("jScrollPane1-jLabel2-0-0-1", new Integer(10)); // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        // comp1Id-comp2Id-dimension-comp2Alignment-paddingType
        ld.updateCurrentState();
        // < UPDATE CURRENT STATE
    }

}
