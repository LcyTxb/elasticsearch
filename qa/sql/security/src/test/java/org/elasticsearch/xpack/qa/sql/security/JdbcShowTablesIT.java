/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.qa.sql.security;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.xpack.qa.sql.jdbc.ShowTablesTestCase;

import java.util.Properties;

public class JdbcShowTablesIT extends ShowTablesTestCase {
    @Override
    protected Settings restClientSettings() {
        return RestSqlIT.securitySettings();
    }

    @Override
    protected Properties connectionProperties() {
        Properties sp = super.connectionProperties();
        sp.putAll(JdbcSecurityIT.adminProperties());
        return sp;
    }
}
