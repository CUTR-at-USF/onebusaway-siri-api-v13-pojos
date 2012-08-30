package uk.org.siri.xml.datatype;

/*
 * Copyright 2003, 2004  The Apache Software Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/** <p>This class contains a set of constants, as specified
 * by various W3C and other standards.</p>
 *
 * @author JSR-31
 * @since JAXB 1.0
 */
public class XMLConstants {
  /** <p>This constant is used to represent the default
   * namespace. Elements or attributes in the default
   * namespace are sometimes also referred as "having no
   * namespace". The constant value is "" (the empty
   * string).</p>
   * <p><em>Note</em>: The default namespace is used like this
   * in SAX handlers. Note, that DOM uses <code>null</code>
   * to represent the default namespace, hence a different
   * value.</p> 
   */
  public static final String DEFAULT_NS_PREFIX = "";

  /** <p>Constant holding the reserved "xml" prefix. This
   * prefix is reserved by the XML namespace standard. Unlike
   * other prefixes, this one is fixed and will always be
   * associated with the same namespace, {@link #XML_NS_URI}.
   * Namespace and prefix are reserved by the XML namespace
   * standard for use by the XML specifications.</p>
   * <p><em>Note</em>: Not only the prefix "xml" itself is
   * reserved, but also any other prefix beginning with
   * "xml". For example, a "new_prefix" may be declared in an
   * XML instance by using the attribute "xmlns:new_prefix".</p>
   */
   public static final String XML_NS_PREFIX = "xml";

  /** <p>Constant holding the reserved namespace URI associated
   * with the "xml" prefix. Namespace and prefix are reserved
   * by the XML namespace standard for use by the XML specifications.</p>
   */
  public static final java.lang.String XML_NS_URI =
      "http://www.w3.org/XML/1998/namespace";

  /** <p>Constant holding the attribute name for declaration
   * of new prefixes. The constant value is "xmlns".</p>
   * <p><em>Note</em>: This is both an attribute name
   * and a namespace prefix: For example, to assign the empty
   * prefix to a namespace, one would use
   * <pre>
   *   xmlns="http://my.namespace/..."
   * </pre>
   * But for assigning the prefix "pre" to the same namespace,
   * one would use
   * <pre>
   *   xmlns:pre="http://my.namespace/..."
   * </pre></p>
   */
  public static final java.lang.String XMLNS_ATTRIBUTE = "xmlns";

  /** <p>Constant holding the namespace of the "xmlns" attribute:
   * "http://www.w3.org/2000/xmlns/".</p>
   * <p><em>Note</em>: This namespace will always be used for the
   * attribute, regardless whether you used it as an attribute name
   * (as in <code>xmlns="..."</code> or as an attribute prefix
   * (as in <code>xmlns:pre="..."</code>).</p>
   */
  public static final java.lang.String XMLNS_ATTRIBUTE_NS_URI =
      "http://www.w3.org/2000/xmlns/";
}
