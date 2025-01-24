/*-
 * #%L
 * afterburner.fx
 * %%
 * Copyright (C) 2013 - 2024 Adam Bien
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
module com.airhacks.afterburner {
    requires jakarta.inject;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.annotation;
    requires javafx.swing;

    exports com.airhacks.afterburner.configuration;
    exports com.airhacks.afterburner.injection;
    exports com.airhacks.afterburner.views;
}
