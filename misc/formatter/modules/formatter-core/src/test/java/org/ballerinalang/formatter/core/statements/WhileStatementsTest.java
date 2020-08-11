/*
 * Copyright (c) 2020, WSO2 Inc. (http://wso2.com) All Rights Reserved.
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
package org.ballerinalang.formatter.core.statements;

import org.ballerinalang.formatter.core.FormatterTest;
import org.testng.annotations.DataProvider;

import java.nio.file.Paths;

/**
 * Test the formatting of while statements.
 *
 * @since 2.0.0
 */
public class WhileStatementsTest extends FormatterTest {

    @DataProvider(name = "test-file-provider")
    @Override
    public Object[][] dataProvider() {
        return this.getConfigsList();
    }

    @Override
    public Object[][] testSubset() {
        return new Object[][] {
                {"while_statement_1.bal", this.getTestResourceDir()}
        };
    }

    @Override
    public String getTestResourceDir() {
        return Paths.get("statements", "while").toString();
    }
}
