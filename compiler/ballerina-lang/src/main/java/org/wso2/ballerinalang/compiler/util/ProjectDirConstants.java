/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.wso2.ballerinalang.compiler.util;

/**
 * Defines constants related to the project directory.
 *
 * @since 0.964.0
 */
public class ProjectDirConstants {

    private ProjectDirConstants() {
    }

    public static final String BLANG_SOURCE_EXT = ".bal";
    public static final String BLANG_COMPILED_PROG_EXT = ".balx";
    public static final String BLANG_COMPILED_PKG_BINARY_EXT = ".balo";
    public static final String BLANG_COMPILED_PKG_EXT = ".zip";

    public static final String MANIFEST_FILE_NAME = "Ballerina.toml";
    public static final String MODULE_MD_FILE_NAME = "Module.md";
    public static final String DOT_BALLERINA_DIR_NAME = ".ballerina";
    public static final String DOT_BALLERINA_REPO_DIR_NAME = "repo";
    public static final String TARGET_DIR_NAME = "target";
    public static final String RESOURCE_DIR_NAME = "resource";
    public static final String TEST_DIR_NAME = "tests";
    public static final String CACHES_DIR_NAME = "caches";
    public static final String BALLERINA_CENTRAL_DIR_NAME = "central.ballerina.io";
    public static final String USER_REPO_OBJ_DIRNAME = "obj";

    public static final String HOME_REPO_ENV_KEY = "BALLERINA_HOME_DIR";
    public static final String HOME_REPO_DEFAULT_DIRNAME = ".ballerina";
    public static final String SETTINGS_FILE_NAME = "Settings.toml";

    public static final String BALLERINA_HOME = "ballerina.home";
    public static final String BALLERINA_HOME_LIB = "lib";

    public static final String BALLERINA_VERSION = "ballerina.version";
    public static final String PROPERTIES_FILE = "/META-INF/launcher.properties";

    public static final String BALLERINA_SOURCE_ROOT = "ballerina.source.root";
}
