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

package org.netbeans.nbbuild;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Properties;
import java.util.jar.Attributes;
import org.netbeans.junit.NbTestCase;
import org.w3c.dom.Element;

public class MakeUpdateDescTest extends NbTestCase {

    public MakeUpdateDescTest(String n) {
        super(n);
    }

    public void testFakeOSGiInfoXml() throws Exception {
        Attributes attr = new Attributes();
        attr.putValue("Bundle-SymbolicName", "bundle;singleton:=true");
        attr.putValue("Bundle-Name", "%OpenIDE-Module-Name");
        attr.putValue("Bundle-Category", "%OpenIDE-Module-Display-Category");
        attr.putValue("Bundle-Description", "%OpenIDE-Module-Short-Description");
        // As generated by JarWithModuleAttributes:
        attr.putValue("Require-Bundle", "org.netbeans.api.progress;bundle-version=\"[101.19,200)\", " +
                "org.netbeans.modules.options.api;bundle-version=\"[1.17,200)\", " +
                "com.jcraft.jsch;bundle-version=\"[0.1.37,0.2.0)\", " +
                "com.jcraft.jzlib;resolution:=optional, " +
                "org.openide.actions;bundle-version=\"[6.15,100)\"," +
                "javax.xml.rpc;bundle-version=1.1.0, " +
                "javax.xml.rpc;bundle-version=1.1.0, " +
                "org.apache.xerces;bundle-version=\"[2.8.0,3.0.0)\";resolution:=optional, " + 
                "org.eclipse.osgi;bundle-version=\"[3.5.0,4.0.0)\";visibility:=reexport");
        Properties localization = new Properties();
        localization.setProperty("OpenIDE-Module-Name", "My Bundle");
        localization.setProperty("OpenIDE-Module-Display-Category", "hello");
        localization.setProperty("OpenIDE-Module-Short-Description", "Hello there!");
        Element e = MakeUpdateDesc.fakeOSGiInfoXml(attr, localization, new File(getWorkDir(), "something/some.jar"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        XMLUtil.write(e, baos);
        assertEquals("<module codenamebase='bundle' distribution='' downloadsize='0' targetcluster='something'> <manifest " +
                "AutoUpdate-Show-In-Client='false' " +
                "OpenIDE-Module='bundle' OpenIDE-Module-Display-Category='hello' " +
                "OpenIDE-Module-Module-Dependencies='org.netbeans.api.progress/1 &gt; 1.19, " +
                "org.netbeans.modules.options.api/0-1 &gt; 1.17, " +
                "com.jcraft.jsch &gt; 0.1.37, " +
                "org.openide.actions &gt; 6.15, " +
                "javax.xml.rpc &gt; 1.1.0' " +
                "OpenIDE-Module-Name='My Bundle' " +
                "OpenIDE-Module-Needs='org.netbeans.Netbinox' " +
                "OpenIDE-Module-Recommends='cnb.org.netbeans.api.progress, "
                + "cnb.org.netbeans.modules.options.api, cnb.com.jcraft.jsch, "
                + "cnb.com.jcraft.jzlib, cnb.org.openide.actions, "
                + "cnb.javax.xml.rpc, cnb.org.apache.xerces, cnb.org.eclipse.osgi' " +
                "OpenIDE-Module-Short-Description='Hello there!' " +
                "OpenIDE-Module-Specification-Version='0'/> " +
                "</module> ", baos.toString().replace('"', '\'').replaceAll("\\s+", " "));
    }

    public void testExportPackage() throws Exception {
        Attributes attr = new Attributes();
        attr.putValue("Bundle-SymbolicName", "javaewah.dummy;singleton:=true");
        attr.putValue("Bundle-Version", "0.5.6");
        //attr.putValue("Bundle-Name", "%OpenIDE-Module-Name");
        //attr.putValue("Bundle-Category", "%OpenIDE-Module-Display-Category");
        //attr.putValue("Bundle-Description", "%OpenIDE-Module-Short-Description");
        
        // As generated by JarWithModuleAttributes:
        attr.putValue("Export-Package", "javaewah;version=0.5.6");
        
        Properties localization = new Properties();
        localization.setProperty("OpenIDE-Module-Name", "My Bundle");
        localization.setProperty("OpenIDE-Module-Display-Category", "hello");
        localization.setProperty("OpenIDE-Module-Short-Description", "Hello there!");
        Element e = MakeUpdateDesc.fakeOSGiInfoXml(attr, localization, new File(getWorkDir(), "something/some.jar"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        XMLUtil.write(e, baos);
        assertEquals("<module codenamebase='javaewah.dummy' "
                + "distribution='' downloadsize='0' targetcluster='something'>"
                + " <manifest AutoUpdate-Show-In-Client='false' OpenIDE-Module='javaewah.dummy'"
                + " OpenIDE-Module-Name='javaewah.dummy'"
                + " OpenIDE-Module-Provides='javaewah'"
                + " OpenIDE-Module-Specification-Version='0.5.6'/>"
                + " </module> ", baos.toString().replace('"', '\'').replaceAll("\\s+", " "));
    }

}
