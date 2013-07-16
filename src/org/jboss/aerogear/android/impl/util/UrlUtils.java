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
package org.jboss.aerogear.android.impl.util;

import java.net.MalformedURLException;
import java.net.URL;

import android.util.Log;

public final class UrlUtils {

    private static final String TAG = UrlUtils.class.getSimpleName();

    private UrlUtils() {
    }

    /**
     * @param baseURL 
     * @param endpoint
     * @return a new url baseUrl + endpoint
     * @throws IllegalArgumentException if baseUrl+endpoint is not a real url.
     */
    public static URL appendToBaseURL(final URL baseURL, String endpoint) {
        try {
            String baseString = baseURL.toString();
            if (!baseString.endsWith("/")) {
                baseString += "/";
            }
            return new URL(baseURL.toString() + endpoint);
        } catch (MalformedURLException ex) {
            String message = "Could not append " + endpoint + " to "
                    + baseURL.toString();
            Log.e(TAG, message, ex);
            throw new IllegalArgumentException(message, ex);
        }
    }

}