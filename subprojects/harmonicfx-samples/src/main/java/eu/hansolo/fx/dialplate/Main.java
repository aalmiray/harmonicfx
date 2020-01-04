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
package eu.hansolo.fx.dialplate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * User: hansolo
 * Date: 28.06.16
 * Time: 09:06
 */
public class Main extends Application {
    private DialPlate dialPlate;

    @Override public void init() {
        dialPlate = new DialPlate();
        dialPlate.addEventHandler(DialEvent.NUMBER_DIALED, e-> System.out.println("Number dialed: " + e.NUMBER));
    }

    @Override public void start(Stage stage) {
        StackPane pane = new StackPane(dialPlate);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane);

        stage.setTitle("DialPlate");
        stage.setScene(scene);
        stage.show();
    }

    @Override public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
