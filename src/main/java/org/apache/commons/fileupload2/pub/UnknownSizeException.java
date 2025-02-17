/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.fileupload2.pub;

import org.apache.commons.fileupload2.FileUploadException;

/**
 * Thrown to indicate that the request size is not specified. In other
 * words, it is thrown, if the content-length header is missing or
 * contains the value -1.
 *
 * @deprecated 1.2 As of commons-fileupload 1.2, the presence of a
 *   content-length header is no longer required.
 */
@Deprecated
public class UnknownSizeException
    extends FileUploadException {

    /**
     * The exceptions UID, for serializing an instance.
     */
    private static final long serialVersionUID = 7062279004812015273L;

    /**
     * Constructs a {@code UnknownSizeException} with no
     * detail message.
     */
    public UnknownSizeException() {
    }

    /**
     * Constructs an {@code UnknownSizeException} with
     * the specified detail message.
     *
     * @param message The detail message.
     */
    public UnknownSizeException(final String message) {
        super(message);
    }

}
