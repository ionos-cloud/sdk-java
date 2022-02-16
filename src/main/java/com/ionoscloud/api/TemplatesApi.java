/*
 * CLOUD API
 * IONOS Enterprise-grade Infrastructure as a Service (IaaS) solutions can be managed through the Cloud API, in addition or as an alternative to the \"Data Center Designer\" (DCD) browser-based tool.    Both methods employ consistent concepts and features, deliver similar power and flexibility, and can be used to perform a multitude of management tasks, including adding servers, volumes, configuring networks, and so on.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiCallback;
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.Pair;
import com.ionoscloud.ProgressRequestBody;
import com.ionoscloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionoscloud.model.Error;
import com.ionoscloud.model.Template;
import com.ionoscloud.model.Templates;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplatesApi {
    private ApiClient localVarApiClient;

    public TemplatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TemplatesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for templatesFindById
     * @param templateId The unique Template ID. (required)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call templatesFindByIdCall(String templateId, Integer depth, final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/templates/{templateId}"
            .replaceAll("\\{" + "templateId" + "\\}", localVarApiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic Authentication", "Token Authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call templatesFindByIdValidateBeforeCall(String templateId, Integer depth, final ApiCallback callback) throws ApiException {
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling templatesFindById(Async)");
        }
        

        okhttp3.Call localVarCall = templatesFindByIdCall(templateId, depth, callback);
        return localVarCall;

    }

    /**
     * Retrieve Cubes Templates
     * Retrieve the properties of the specified Cubes Template.  This operation is only supported for the Cubes.
     * @param templateId The unique Template ID. (required)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * 
     * @return Template
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Template templatesFindById(String templateId, Integer depth) throws ApiException {
        ApiResponse<Template> localVarResp = templatesFindByIdWithHttpInfo(templateId, depth);
        return localVarResp.getData();
    }

    /**
     * Retrieve Cubes Templates
     * Retrieve the properties of the specified Cubes Template.  This operation is only supported for the Cubes.
     * @param templateId The unique Template ID. (required)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * 
     * @return ApiResponse&lt;Template&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Template> templatesFindByIdWithHttpInfo(String templateId, Integer depth) throws ApiException {
        okhttp3.Call localVarCall = templatesFindByIdValidateBeforeCall(templateId, depth, null);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Cubes Templates (asynchronously)
     * Retrieve the properties of the specified Cubes Template.  This operation is only supported for the Cubes.
     * @param templateId The unique Template ID. (required)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call templatesFindByIdAsync(String templateId, Integer depth, final ApiCallback<Template> callback) throws ApiException {

        okhttp3.Call localVarCall = templatesFindByIdValidateBeforeCall(templateId, depth, callback);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }
    /**
     * Build call for templatesGet
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call templatesGetCall(Integer depth,  String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/templates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }
        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }
        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }
        if (filters != null) {
            filters.forEach((key, value) -> {
                localVarQueryParams.add(new Pair(String.format("filter.%s", key), value));
            });
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic Authentication", "Token Authentication" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call templatesGetValidateBeforeCall(Integer depth,  String orderBy, Integer maxResults , Map<String, String> filters,final ApiCallback callback) throws ApiException {
        

        okhttp3.Call localVarCall = templatesGetCall(depth,  orderBy, maxResults, filters,callback);
        return localVarCall;

    }

    /**
     * List Cubes Templates
     * List all of the available Cubes Templates.  This operation is only supported for the Cubes.
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return Templates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Templates templatesGet(Integer depth,  String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        ApiResponse<Templates> localVarResp = templatesGetWithHttpInfo(depth, orderBy, maxResults, filters);
        return localVarResp.getData();
    }

    /**
     * List Cubes Templates
     * List all of the available Cubes Templates.  This operation is only supported for the Cubes.
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return ApiResponse&lt;Templates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Templates> templatesGetWithHttpInfo(Integer depth, String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        okhttp3.Call localVarCall = templatesGetValidateBeforeCall(depth,  orderBy, maxResults, filters, null);
        Type localVarReturnType = new TypeToken<Templates>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Cubes Templates (asynchronously)
     * List all of the available Cubes Templates.  This operation is only supported for the Cubes.
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call templatesGetAsync(Integer depth, String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback<Templates> callback) throws ApiException {

        okhttp3.Call localVarCall = templatesGetValidateBeforeCall(depth,  orderBy, maxResults, filters, callback);
        Type localVarReturnType = new TypeToken<Templates>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }
}
