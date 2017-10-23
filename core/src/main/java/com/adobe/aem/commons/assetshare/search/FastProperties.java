/*
 * Asset Share Commons
 *
 * Copyright (C) 2017 Adobe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.adobe.aem.commons.assetshare.search;

import org.osgi.annotation.versioning.ProviderType;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@ProviderType
public interface FastProperties {
    String SLOW = "\uD83D\uDC22";
    String FAST = "\u26A1";

    List<String> getFastProperties(String propertyName);

    List<String> getDeltaProperties(Collection<String> fastProperties, Collection<String> otherProperties);

    String getFastLabel(String label);

    String getSlowLabel(String label);

}