/*
 * Copyright 2015-2016 Canoo Engineering AG.
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
package com.canoo.dolphin.server.context;

import com.canoo.dolphin.util.Assert;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by hendrikebbers on 15.09.15.
 */
public class DolphinContextCleaner implements HttpSessionListener {

    private DolphinContextHandler dolphinContextHandler;

    public DolphinContextCleaner(DolphinContextHandler dolphinContextHandler) {
        this.dolphinContextHandler = Assert.requireNonNull(dolphinContextHandler, "dolphinContextHandler");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //Nothing to do
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        Assert.requireNonNull(sessionEvent, "sessionEvent");
        dolphinContextHandler.removeAllContextsInSession(sessionEvent.getSession());
    }
}
