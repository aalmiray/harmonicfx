/*
 * Copyright 2013-2018 Gerrit Grunwald.
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
package eu.hansolo.fx.ios.events;


public class IosEvent {
    public final Object       SRC;
    public final IosEventType TYPE;


    // ******************** Constructors **************************************
    public IosEvent(final Object SRC, final IosEventType TYPE) {
        this.SRC  = SRC;
        this.TYPE = TYPE;
    }


    // ******************** Methods *******************************************
    public Object getSource() { return SRC; }

    public IosEventType getType() { return TYPE; }
}
