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

/**
 * Caja reserved names.
 *
 * @author benl@google.com (Ben Laurie)
 */
public class ReservedNames {
  public static final String DIS = "$dis";
  public static final String LOCAL_THIS = "t___";
  static final String TEMP = "x___";
  public static final String ARGUMENTS = "arguments";
  public static final String LOCAL_ARGUMENTS = "a___";
  /** The current node for an event handler function. */
  public static final String THIS_NODE = "thisNode___";
  /**
   * The name of a plugin's global object in the scope in the outermost scope
   * in which that plugin's code is defined, which holds "global" properties
   * not declared within the module.
   */
  public static final String IMPORTS = "IMPORTS___";
  /**
   * A property on {@link #IMPORTS} that resolves to an instance of HtmlEmitter
   * as defined in html-emitter.js.
   */
  public static final String HTML_EMITTER = "htmlEmitter___";
  /**
   * Applies {@link com.google.caja.plugin.UriPolicy#rewriteUri} at runtime.
   */
  public static final String REWRITE_URI = "rewriteUri___";
  /** Applies the id and name policy at runtime. */
  public static final String SUFFIX = "suffix___";
  /**
   * Applies the class policy at runtime, making sure the argument is a valid
   * value for a node's class attribute.
   * TODO(kpreid): Pretty sure this comment is false or obsolete.
   */
  public static final String IDENT = "ident___";
  /** Coerces the argument to a CSS URI by applying the PluginEnvironment. */
  public static final String CSS_URI = "cssUri___";
  /** An output buffer for a compiled template. */
  public static final String OUTPUT_BUFFER = "out___";

  private ReservedNames() { /* uninstantiable */ }
}