/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.android.unifiedpush;

import android.content.Context;
import org.jboss.aerogear.android.Callback;


public interface PushRegistrar {

    /**
     *
     * Registers a device to a push network and any 3rd party application servers.
     *
     * @param context Android application context
     * @param config The push configuration which describes the connection
     * @param callback a callback.
     */
    void register(final Context context, final PushConfig config, final Callback<Void> callback);

    /**
     *
     * Unregisters a device a push network and any party application servers.
     *
     * @param context Android application context
     * @param config The push configuration which describes the connection
     * @param callback a callback.
     */
    void unregister(final Context context, final PushConfig config, final Callback<Void> callback);
    
}