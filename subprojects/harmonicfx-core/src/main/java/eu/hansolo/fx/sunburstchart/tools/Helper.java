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
package eu.hansolo.fx.sunburstchart.tools;

import javafx.scene.paint.Color;


public class Helper {
    public static int clamp(final int MIN, final int MAX, final int VALUE) {
        if (VALUE < MIN) return MIN;
        if (VALUE > MAX) return MAX;
        return VALUE;
    }
    public static double clamp(final double MIN, final double MAX, final double VALUE) {
        if (VALUE < MIN) return MIN;
        if (VALUE > MAX) return MAX;
        return VALUE;
    }

    public static double[] colorToYUV(final Color COLOR) {
        final double WEIGHT_FACTOR_RED   = 0.299;
        final double WEIGHT_FACTOR_GREEN = 0.587;
        final double WEIGHT_FACTOR_BLUE  = 0.144;
        final double U_MAX               = 0.436;
        final double V_MAX               = 0.615;
        double y = clamp(0, 1, WEIGHT_FACTOR_RED * COLOR.getRed() + WEIGHT_FACTOR_GREEN * COLOR.getGreen() + WEIGHT_FACTOR_BLUE * COLOR.getBlue());
        double u = clamp(-U_MAX, U_MAX, U_MAX * ((COLOR.getBlue() - y) / (1 - WEIGHT_FACTOR_BLUE)));
        double v = clamp(-V_MAX, V_MAX, V_MAX * ((COLOR.getRed() - y) / (1 - WEIGHT_FACTOR_RED)));
        return new double[] { y, u, v };
    }

    public static final boolean isBright(final Color COLOR) { return Double.compare(colorToYUV(COLOR)[0], 0.5) >= 0.0; }
    public static final boolean isDark(final Color COLOR) { return colorToYUV(COLOR)[0] < 0.5; }
}
