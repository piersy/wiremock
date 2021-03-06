/*
 * Copyright (C) 2011 Thomas Akehurst
 * Modified by Piers Powlesland adding ability to work with request body as bytes
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
package com.github.tomakehurst.wiremock.http;

import java.util.Set;

public interface Request {

	String getUrl();
	String getAbsoluteUrl();
	RequestMethod getMethod();
	String getHeader(String key);
    HttpHeader header(String key);
    ContentTypeHeader contentTypeHeader();
    HttpHeaders getHeaders();
	boolean containsHeader(String key);
	Set<String> getAllHeaderKeys();
    QueryParameter queryParameter(String key);
    String getBodyAsString();
    byte[] getBody();
	boolean isBrowserProxyRequest();
}
