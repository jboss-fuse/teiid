/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.dqp.internal.datamgr;


import org.teiid.language.Literal;
import org.teiid.query.sql.symbol.Constant;


import junit.framework.TestCase;

public class TestLiteralImpl extends TestCase {

    /**
     * Constructor for TestLiteralImpl.
     * @param name
     */
    public TestLiteralImpl(String name) {
        super(name);
    }

    public static Constant helpExample(int val) {
        return new Constant(new Integer(val));
    }
    
    public static Constant helpExample(Object val) {
        return new Constant(val);
    }
    
    public static Literal example(int val) {
        Constant c = helpExample(val);
        return new Literal(c.getValue(), c.getType());
    }

    public static Literal example(Object val) {
        Constant c = helpExample(val);
        return new Literal(c.getValue(), c.getType());
    }

    public void testGetValue() {
        assertEquals(new Integer(100), example(100).getValue());
    }

}
