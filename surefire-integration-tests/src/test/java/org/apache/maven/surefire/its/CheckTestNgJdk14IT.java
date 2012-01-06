package org.apache.maven.surefire.its;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.surefire.its.fixture.SurefireVerifierTestClass2;

/**
 * Test TestNG running in the JDK 1.4 JavaDoc style
 *
 * @author <a href="mailto:dfabulich@apache.org">Dan Fabulich</a>
 */
public class CheckTestNgJdk14IT
    extends SurefireVerifierTestClass2
{

    public CheckTestNgJdk14IT()
    {
        unpack( "/testng-jdk14" );
    }

    public void testTestNgJdk14()
        throws Exception
    {
        unpack( "/testng-jdk14" ).executeTest().verifyErrorFree( 1 );

    }
}
