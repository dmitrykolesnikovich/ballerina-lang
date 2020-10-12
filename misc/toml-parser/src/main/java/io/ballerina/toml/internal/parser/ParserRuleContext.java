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
package io.ballerina.toml.internal.parser;

/**
 * Parser rule contexts that represent each point in the grammar.
 * These represents the current scope during the parsing.
 *
 * @since 1.2.0
 */
public enum ParserRuleContext {

    // Productions
    EOF("eof"),
    TOP_LEVEL_NODE("top-level-node"),
    ARG_LIST("arguments"),
    ARG_START("argument-start"),
    ARG_LIST_START("("),
    ARG_LIST_END(")"),
    ARG_START_OR_ARG_LIST_END("arg-start-or-args-list-end"),
    ARG_END("arg-end"),

    // Syntax tokens
    ASSIGN_OP("="),
    COLON(":"),
    COMMA(","),
    DOT("."),
    OPEN_BRACKET("["),
    CLOSE_BRACKET("]"),
    PLUS_TOKEN("+"),
    MINUS_TOKEN("-"),

    IDENTIFIER("identifier"),

    // Expressions
    BASIC_LITERAL("basic-literal"),
    DECIMAL_INTEGER_LITERAL("decimal-int-literal"),
    STRING_LITERAL("string-literal"),
    HEX_INTEGER_LITERAL("hex-integer-literal"),
    NIL_LITERAL("nil-literal"),
    DECIMAL_FLOATING_POINT_LITERAL("decimal-floating-point-literal"),
    HEX_FLOATING_POINT_LITERAL("hex-floating-point-literal"),

    //TOML
    KEY("key-toml"),
    VALUE("value-toml"),
    START_SQUARE_BRACES("start-square-braces"),
    END_SQUARE_BRACES("end-square-braces"),
    KEY_VALUE_PAIR ("key-value-pair"),
    TOML_TABLE("toml-table"),
    TOML_TABLE_ARRAY("toml-table-array"),
    DOUBLE_OPEN_BRACKET("[["),
    DOUBLE_CLOSE_BRACKET("]]"),
    TOML_ARRAY("toml-array-value")
    ;

    private String value;

    ParserRuleContext(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
