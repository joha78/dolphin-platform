/*
 * Copyright 2015-2018 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.canoo.platform.remoting.client.javafx;

import com.canoo.platform.client.PlatformClient;
import com.canoo.platform.client.Toolkit;
import javafx.application.Platform;
import org.apiguardian.api.API;

import java.util.concurrent.Executor;

import static org.apiguardian.api.API.Status.MAINTAINED;

@API(since = "0.x", status = MAINTAINED)
public class FxToolkit implements Toolkit {

    private final static String NAME = "JavaFX toolkit";


    @Override
    public Executor getUiExecutor() {
        return new Executor() {
            @Override
            public void execute(Runnable command) {
                Platform.runLater(command);
            }
        };
    }

    @Override
    public String getName() {
        return NAME;
    }

    public static void init() {
        PlatformClient.init(new FxToolkit());
    }
}
