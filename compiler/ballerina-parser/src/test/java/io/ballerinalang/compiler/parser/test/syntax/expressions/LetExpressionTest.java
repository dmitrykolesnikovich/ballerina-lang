/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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
package io.ballerinalang.compiler.parser.test.syntax.expressions;

import org.testng.annotations.Test;

/**
 * Test parsing let expression.
 */
public class LetExpressionTest extends AbstractExpressionsTest {

    // Valid syntax

    @Test
    public void testSimpleLetExpr() {
        test("let T B = E1 in E2", "let-expr/let_expr_assert_01.json");
    }

    @Test
    public void testLetExprWithAnnots() {
        test("let @C{} int B = E1 in E2", "let-expr/let_expr_assert_02.json");
        test("let @C{} @D{} int B = E1 in E2", "let-expr/let_expr_assert_03.json");
    }

    @Test
    public void testLetExprWithMultipleVarDeclarations() {
        test("let int B = E1, int C = E2 in E3", "let-expr/let_expr_assert_04.json");
        test("let @C1{a:b} int B = E1, int C = E2, @C1{} @C2{a:b} int D = E3 in E4",
                "let-expr/let_expr_assert_05.json");
    }

    // Recovery tests
}
