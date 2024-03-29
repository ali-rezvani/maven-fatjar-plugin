package org.apache.maven.plugin.eplugin.writers.workspace;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.eplugin.WorkspaceConfiguration;
import org.apache.maven.plugin.logging.Log;

/**
 * @author Dan T. Tran
 * @version $Id: WorkspaceWriter.java 728546 2008-12-21 22:56:51Z bentmann $
 */

public interface WorkspaceWriter
{
    /**
     * Init this writer.
     * 
     * @param log mojo logger.
     * @param config writer configuration.
     * @return the writer instance
     */
    WorkspaceWriter init( Log log, WorkspaceConfiguration config );

    /**
     * Main method that should be implemented by the writer to do the work.
     * 
     * @throws MojoExecutionException
     */
    void write()
        throws MojoExecutionException;
}
