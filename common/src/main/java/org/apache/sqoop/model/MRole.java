/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.model;

/**
 * Model describing entire role object which used in role based authorization controller
 */
public class MRole {

  private final String id;
  private final String name;

  /**
   * Default constructor to build  new MRole model.
   *
   * @param id   Role id
   * @param name Role name
   */
  public MRole(String id,
               String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Constructor to build  new MRole model.
   *
   * @param name Role name
   */
  public MRole(String name) {
    this(null, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Role (");
    sb.append("Role id: ").append(this.id);
    sb.append(", Role name: ").append(this.name);
    sb.append(" )");

    return sb.toString();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
