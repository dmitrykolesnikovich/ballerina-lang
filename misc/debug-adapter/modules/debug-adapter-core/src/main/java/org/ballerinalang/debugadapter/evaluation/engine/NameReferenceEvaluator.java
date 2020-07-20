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

package org.ballerinalang.debugadapter.evaluation.engine;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.Value;
import io.ballerinalang.compiler.syntax.tree.SimpleNameReferenceNode;
import org.ballerinalang.debugadapter.SuspendedContext;
import org.ballerinalang.debugadapter.evaluation.EvaluationException;
import org.ballerinalang.debugadapter.evaluation.EvaluationExceptionKind;

public class NameReferenceEvaluator extends Evaluator {

    private final SimpleNameReferenceNode syntaxNode;

    public NameReferenceEvaluator(SuspendedContext context, SimpleNameReferenceNode node) {
        super(context);
        this.syntaxNode = node;
    }

    @Override
    public Value evaluate() throws EvaluationException {
        try {
            LocalVariable jvmVar = context.getFrame().visibleVariableByName(syntaxNode.toString());
            return context.getFrame().getValue(jvmVar);
        } catch (AbsentInformationException e) {
            throw new EvaluationException(String.format(EvaluationExceptionKind.VARIABLE_NOT_FOUND.getString(),
                    syntaxNode.toString()));
        } catch (Exception e) {
            throw new EvaluationException(String.format(EvaluationExceptionKind.VARIABLE_EXECUTION_ERROR.getString(),
                    syntaxNode.toString()));
        }
    }
}