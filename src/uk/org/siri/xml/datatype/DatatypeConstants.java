/*
    2    * Licensed to the Apache Software Foundation (ASF) under one or more
    3    * contributor license agreements.  See the NOTICE file distributed with
    4    * this work for additional information regarding copyright ownership.
    5    * The ASF licenses this file to You under the Apache License, Version 2.0
    6    * (the "License"); you may not use this file except in compliance with
    7    * the License.  You may obtain a copy of the License at
    8    *
    9    *     http://www.apache.org/licenses/LICENSE-2.0
   10    *
   11    * Unless required by applicable law or agreed to in writing, software
   12    * distributed under the License is distributed on an "AS IS" BASIS,
   13    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   14    * See the License for the specific language governing permissions and
   15    * limitations under the License.
   16    */

package uk.org.siri.xml.datatype;

import javax.xml.XMLConstants;

/**
 * <p>Utility class to contain basic Datatype values as constants.</p>
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @since 1.5
 */

public final class DatatypeConstants {

    /**
     * <p>Private constructor to prevent instantiation.</p>
     */
        private DatatypeConstants() {
        }

        /**
         * Value for first month of year.
         */
        public static final int JANUARY  = 1;

        /**
         * Value for second month of year.
         */
        public static final int FEBRUARY = 2;

        /**
         * Value for third month of year.
         */
        public static final int MARCH    = 3;

        /**
         * Value for fourth month of year.
         */
        public static final int APRIL    = 4;

        /**
         * Value for fifth month of year.
         */
        public static final int MAY      = 5;

        /**
         * Value for sixth month of year.
         */
        public static final int JUNE     = 6;

        /**
         * Value for seventh month of year.
         */
        public static final int JULY     = 7;

        /**
         * Value for eighth month of year.
         */
        public static final int AUGUST   = 8;

        /**
         * Value for ninth month of year.
         */
        public static final int SEPTEMBER = 9;

        /**
         * Value for tenth month of year.
         */
        public static final int OCTOBER = 10;

        /**
         * Value for eleven month of year.
         */
        public static final int NOVEMBER = 11;

        /**
         * Value for twelve month of year.
         */
        public static final int DECEMBER = 12;

        /**
         * <p>Comparison result.</p>
         */
        public static final int LESSER = -1;

        /**
         * <p>Comparison result.</p>
         */
        public static final int EQUAL =  0;

        /**
         * <p>Comparison result.</p>
         */
        public static final int GREATER =  1;

        /**
         * <p>Comparison result.</p>
         */
        public static final int INDETERMINATE =  2;

        /**
         * Designation that an "int" field is not set.
         */
        public static final int FIELD_UNDEFINED = Integer.MIN_VALUE;

        /**
         * <p>A constant that represents the years field.</p>
         */
        public static final Field YEARS = new Field("YEARS", 0);

        /**
         * <p>A constant that represents the months field.</p>
         */
        public static final Field MONTHS = new Field("MONTHS", 1);

        /**
         * <p>A constant that represents the days field.</p>
         */
        public static final Field DAYS = new Field("DAYS", 2);

        /**
         * <p>A constant that represents the hours field.</p>
         */
        public static final Field HOURS = new Field("HOURS", 3);

        /**
         * <p>A constant that represents the minutes field.</p>
         */
        public static final Field MINUTES = new Field("MINUTES", 4);

        /**
         * <p>A constant that represents the seconds field.</p>
         */
        public static final Field SECONDS = new Field("SECONDS", 5);

        /**
         * Type-safe enum class that represents six fields
         * of the {@link Duration} class.
         * @since 1.5
         */
        public static final class Field {

                /**
                 * <p><code>String</code> representation of <code>Field</code>.</p>
                 */
                private final String str;
                /**
                 * <p>Unique id of the field.</p>
                 *
                 * <p>This value allows the {@link Duration} class to use switch
                 * statements to process fields.</p>
                 */
                private final int id;

                /**
                 * <p>Construct a <code>Field</code> with specified values.</p>
                 * @param str <code>String</code> representation of <code>Field</code>
                 * @param id  <code>int</code> representation of <code>Field</code>
                 */
                private Field(final String str, final int id) {
                        this.str = str;
                        this.id = id;
                }
                /**
                 * Returns a field name in English. This method
                 * is intended to be used for debugging/diagnosis
                 * and not for display to end-users.
                 *
                 * @return
                 *      a non-null valid String constant.
                 */
                public String toString() { return str; }

                /**
                 * <p>Get id of this Field.</p>
                 *
                 * @return Id of field.
                 */
                public int getId() {
                        return id;
                }
        }


        /**
         * W3C XML Schema max timezone offset is -14:00. Zone offset is in minutes.
         */
        public static final int MAX_TIMEZONE_OFFSET = -14 * 60;

        /**
         * W3C XML Schema min timezone offset is +14:00. Zone offset is in minutes.
         */
        public static final int MIN_TIMEZONE_OFFSET = 14 * 60;

}