/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2013-2020 The original authors
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
package eu.hansolo.fx.sankeyplot;

public class PlotItemEvent {
    private final PlotItem          ITEM;
    private final PlotItemEventType TYPE;


    // ******************** Constructors **************************************
    public PlotItemEvent(final PlotItem ITEM, final PlotItemEventType TYPE) {
        this.ITEM = ITEM;
        this.TYPE = TYPE;
    }


    // ******************** Methods *******************************************
    public PlotItem getItem() { return ITEM; }

    public PlotItemEventType getType() { return TYPE; }
}
