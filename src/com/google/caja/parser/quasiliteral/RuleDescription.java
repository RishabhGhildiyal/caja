// Copyright (C) 2007 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.caja.parser.quasiliteral;

import com.google.caja.parser.ParseTreeNode;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes each transformation rule
 *
 * @author jasvir@google.com (Jasvir Nagra)
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RuleDescription {
  /**
   * @return Name of the transformation {@code Rule}
   */
  String name();

  /**
   * @return Summary of the effect of {@code Rule}
   */
  String synopsis();

  /**
   * @return Reason that necessitates {@code Rule}
   */
  String reason();

  /**
   * @return Quasiliteral pattern matched by {@code Rule}
   */
  String matches() default "<UNKNOWN>";

  /**
   * @return Code generated by {@code Rule}
   */
  String substitutes() default "<UNKNOWN>";

  /**
   * @return Type of node this rule applies to.  This could go away
   * if {@code matches} were more expressive.
   */
  Class<? extends ParseTreeNode> matchNode() default ParseTreeNode.class;
}