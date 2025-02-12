/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugins.checkstyle.exec;

import java.io.File;
import java.util.Collection;
import java.util.List;

import com.puppycrawl.tools.checkstyle.api.AuditListener;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Resource;
import org.apache.maven.project.MavenProject;

/**
 * @author Olivier Lamy
 * @since 2.5
 *
 */
public class CheckstyleExecutorRequest {

    /**
     * Specifies the names filter of the source files to be used for Checkstyle.
     */
    private String includes;

    /**
     * Specifies the names filter of the source files to be excluded for Checkstyle.
     */
    private String excludes;

    /**
     * Specifies names filter for resources.
     */
    private String resourceIncludes;

    /**
     * Specifies names filter for resources.
     */
    private String resourceExcludes;

    private MavenProject project;

    private String suppressionsLocation;

    private boolean includeTestSourceDirectory;

    private Collection<File> testSourceDirectories;

    private Collection<File> sourceDirectories;

    private boolean includeResources;

    private boolean includeTestResources;

    private List<Resource> resources;

    private List<Resource> testResources;

    private boolean failsOnError;

    private AuditListener listener;

    private boolean consoleOutput;

    private AuditListener auditListener;

    private String propertiesLocation;

    //

    private String configLocation;

    private String propertyExpansion;

    private String headerLocation;

    private String cacheFile;

    private String suppressionsFileExpression;

    private String encoding;

    /**
     * @since 2.8
     */
    private boolean aggregate = false;

    /**
     * @since 2.8
     */
    private List<MavenProject> reactorProjects;

    /**
     * @since 2.12.1
     */
    private List<Artifact> licenseArtifacts;

    /**
     * @since 2.12.1
     */
    private List<Artifact> configurationArtifacts;

    /**
     * @since 3.0.0
     */
    private boolean omitIgnoredModules;

    /**
     * Constructor.
     */
    public CheckstyleExecutorRequest() {
        // nothing
    }

    /**
     * Returns the includes parameter.
     *
     * @return The includes parameter.
     */
    public String getIncludes() {
        return includes;
    }

    public CheckstyleExecutorRequest setIncludes(String includes) {
        this.includes = includes;
        return this;
    }

    public String getExcludes() {
        return excludes;
    }

    public CheckstyleExecutorRequest setExcludes(String excludes) {
        this.excludes = excludes;
        return this;
    }

    public String getResourceIncludes() {
        return resourceIncludes;
    }

    public CheckstyleExecutorRequest setResourceIncludes(String resourceIncludes) {
        this.resourceIncludes = resourceIncludes;
        return this;
    }

    public String getResourceExcludes() {
        return resourceExcludes;
    }

    public CheckstyleExecutorRequest setResourceExcludes(String resourceExcludes) {
        this.resourceExcludes = resourceExcludes;
        return this;
    }

    public MavenProject getProject() {
        return project;
    }

    public CheckstyleExecutorRequest setProject(MavenProject project) {
        this.project = project;
        return this;
    }

    public String getSuppressionsLocation() {
        return suppressionsLocation;
    }

    public CheckstyleExecutorRequest setSuppressionsLocation(String suppressionsLocation) {
        this.suppressionsLocation = suppressionsLocation;
        return this;
    }

    public boolean isIncludeTestSourceDirectory() {
        return includeTestSourceDirectory;
    }

    public CheckstyleExecutorRequest setIncludeTestSourceDirectory(boolean includeTestSourceDirectory) {
        this.includeTestSourceDirectory = includeTestSourceDirectory;
        return this;
    }

    public Collection<File> getTestSourceDirectories() {
        return testSourceDirectories;
    }

    public CheckstyleExecutorRequest setTestSourceDirectories(Collection<File> testSourceDirectories) {
        this.testSourceDirectories = testSourceDirectories;
        return this;
    }

    public Collection<File> getSourceDirectories() {
        return sourceDirectories;
    }

    public CheckstyleExecutorRequest setSourceDirectories(Collection<File> sourceDirectories) {
        this.sourceDirectories = sourceDirectories;
        return this;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public CheckstyleExecutorRequest setResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public List<Resource> getTestResources() {
        return testResources;
    }

    public CheckstyleExecutorRequest setTestResources(List<Resource> testResources) {
        this.testResources = testResources;
        return this;
    }

    public boolean isFailsOnError() {
        return failsOnError;
    }

    public CheckstyleExecutorRequest setFailsOnError(boolean failsOnError) {
        this.failsOnError = failsOnError;
        return this;
    }

    public AuditListener getListener() {
        return listener;
    }

    public CheckstyleExecutorRequest setListener(AuditListener listener) {
        this.listener = listener;
        return this;
    }

    public boolean isConsoleOutput() {
        return consoleOutput;
    }

    public CheckstyleExecutorRequest setConsoleOutput(boolean consoleOutput) {
        this.consoleOutput = consoleOutput;
        return this;
    }

    public CheckstyleExecutorRequest setConsoleListener(AuditListener auditListener) {
        this.auditListener = auditListener;
        return this;
    }

    public AuditListener getConsoleListener() {
        return this.auditListener;
    }

    public String getConfigLocation() {
        return configLocation;
    }

    public CheckstyleExecutorRequest setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
        return this;
    }

    public String getPropertyExpansion() {
        return propertyExpansion;
    }

    public CheckstyleExecutorRequest setPropertyExpansion(String propertyExpansion) {
        this.propertyExpansion = propertyExpansion;
        return this;
    }

    public String getHeaderLocation() {
        return headerLocation;
    }

    public CheckstyleExecutorRequest setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
        return this;
    }

    public String getCacheFile() {
        return cacheFile;
    }

    public CheckstyleExecutorRequest setCacheFile(String cacheFile) {
        this.cacheFile = cacheFile;
        return this;
    }

    public String getSuppressionsFileExpression() {
        return suppressionsFileExpression;
    }

    public CheckstyleExecutorRequest setSuppressionsFileExpression(String suppressionsFileExpression) {
        this.suppressionsFileExpression = suppressionsFileExpression;
        return this;
    }

    public String getEncoding() {
        return encoding;
    }

    public CheckstyleExecutorRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public String getPropertiesLocation() {
        return propertiesLocation;
    }

    public CheckstyleExecutorRequest setPropertiesLocation(String propertiesLocation) {
        this.propertiesLocation = propertiesLocation;
        return this;
    }

    /**
     * Returns true if the report is aggregated.
     *
     * @return <code>true</code> if the report is aggregated.
     */
    public boolean isAggregate() {
        return aggregate;
    }

    /**
     * Sets the aggregate parameter.
     *
     * @param pAggregate <code>true</code> if an aggregated report is desired.
     * @return This object.
     */
    public CheckstyleExecutorRequest setAggregate(boolean pAggregate) {
        this.aggregate = pAggregate;
        return this;
    }

    /**
     * Returns the list of reactor projects.
     *
     * @return The reactor projects.
     */
    public List<MavenProject> getReactorProjects() {
        return reactorProjects;
    }

    /**
     * Sets the list of reactor projects.
     *
     * @param pReactorProjects The reactor projects.
     * @return This object.
     */
    public CheckstyleExecutorRequest setReactorProjects(List<MavenProject> pReactorProjects) {
        this.reactorProjects = pReactorProjects;
        return this;
    }

    /**
     * Returns a list of license artifacts, which may contain the license.
     *
     * @return the license artifacts
     */
    public List<Artifact> getLicenseArtifacts() {
        return licenseArtifacts;
    }

    /**
     * Sets a list of license artifacts, which may contain the license.
     *
     * @param licenseArtifacts List of license artifacts.
     * @return This object.
     */
    public CheckstyleExecutorRequest setLicenseArtifacts(List<Artifact> licenseArtifacts) {
        this.licenseArtifacts = licenseArtifacts;
        return this;
    }

    /**
     * Returns a list of artifacts, which may contain the checkstyle configuration.
     *
     * @return the license artifacts
     */
    public List<Artifact> getConfigurationArtifacts() {
        return configurationArtifacts;
    }

    /**
     * Sets a list of artifacts, which may contain the checkstyle configuration.
     *
     * @param configArtifacts List of artifacts.
     * @return This object.
     */
    public CheckstyleExecutorRequest setConfigurationArtifacts(List<Artifact> configArtifacts) {
        this.configurationArtifacts = configArtifacts;
        return this;
    }

    public boolean isIncludeResources() {
        return includeResources;
    }

    /**
     * @param includeResources whether to include the resource directories in the checks.
     * @return This object.
     */
    public CheckstyleExecutorRequest setIncludeResources(boolean includeResources) {
        this.includeResources = includeResources;
        return this;
    }

    public boolean isIncludeTestResources() {
        return includeTestResources;
    }

    /**
     * @param includeTestResources whether to set the test resource directories in the checks.
     * @return This object.
     */
    public CheckstyleExecutorRequest setIncludeTestResources(boolean includeTestResources) {
        this.includeTestResources = includeTestResources;
        return this;
    }

    /**
     * Returns true if ignored modules (modules with severity 'ignore') should be omitted.
     *
     * @return <code>true</code> if ignored modules should be omitted.
     */
    public boolean isOmitIgnoredModules() {
        return omitIgnoredModules;
    }

    /**
     * @param omitIgnoredModules Whether to omit ignored modules (modules with severity 'ignore').
     * @return This object.
     */
    public CheckstyleExecutorRequest setOmitIgnoredModules(boolean omitIgnoredModules) {
        this.omitIgnoredModules = omitIgnoredModules;
        return this;
    }
}
