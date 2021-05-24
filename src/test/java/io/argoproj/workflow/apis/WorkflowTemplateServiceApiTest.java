/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.models.GrpcGatewayRuntimeError;
import io.argoproj.workflow.models.WorkflowTemplate;
import io.argoproj.workflow.models.WorkflowTemplateCreateRequest;
import io.argoproj.workflow.models.WorkflowTemplateLintRequest;
import io.argoproj.workflow.models.WorkflowTemplateList;
import io.argoproj.workflow.models.WorkflowTemplateUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowTemplateServiceApi
 */
@Ignore
public class WorkflowTemplateServiceApiTest {

    private final WorkflowTemplateServiceApi api = new WorkflowTemplateServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceCreateWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        WorkflowTemplateCreateRequest body = null;
        WorkflowTemplate response = api.workflowTemplateServiceCreateWorkflowTemplate(namespace, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceDeleteWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.workflowTemplateServiceDeleteWorkflowTemplate(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceGetWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        String getOptionsResourceVersion = null;
        WorkflowTemplate response = api.workflowTemplateServiceGetWorkflowTemplate(namespace, name, getOptionsResourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceLintWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        WorkflowTemplateLintRequest body = null;
        WorkflowTemplate response = api.workflowTemplateServiceLintWorkflowTemplate(namespace, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceListWorkflowTemplatesTest() throws ApiException {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        WorkflowTemplateList response = api.workflowTemplateServiceListWorkflowTemplates(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTemplateServiceUpdateWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowTemplateUpdateRequest body = null;
        WorkflowTemplate response = api.workflowTemplateServiceUpdateWorkflowTemplate(namespace, name, body);

        // TODO: test validations
    }
    
}
