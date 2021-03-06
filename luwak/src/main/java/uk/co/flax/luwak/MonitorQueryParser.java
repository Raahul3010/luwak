package uk.co.flax.luwak;

/*
 *   Copyright (c) 2015 Lemur Consulting Ltd.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import java.util.Map;

import org.apache.lucene.search.Query;

/**
 * Defines how a query is parsed
 */
public interface MonitorQueryParser {

    /**
     * Given a string representation of a query, and associated metadata, return a lucene {@link Query}
     * @param queryString   the query string
     * @param metadata      query metadata
     * @return a lucene {@link Query}
     * @throws Exception if there is an error during parsing
     */
    Query parse(String queryString, Map<String, String> metadata) throws Exception;

}
