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
import com.ionoscloud.model.Location;
import com.ionoscloud.model.Locations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationsApi {
    private ApiClient localVarApiClient;

    public LocationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for locationsFindByRegionId
     * @param regionId The unique ID of the region. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsFindByRegionIdCall(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations/{regionId}"
            .replaceAll("\\{" + "regionId" + "\\}", localVarApiClient.escapeString(regionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }
        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
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
    private okhttp3.Call locationsFindByRegionIdValidateBeforeCall(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback callback) throws ApiException {
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling locationsFindByRegionId(Async)");
        }
        

        okhttp3.Call localVarCall = locationsFindByRegionIdCall(regionId, pretty, depth, xContractNumber, callback);
        return localVarCall;

    }

    /**
     * List locations within regions
     * List locations by the region ID.
     * @param regionId The unique ID of the region. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * 
     * @return Locations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Locations locationsFindByRegionId(String regionId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        ApiResponse<Locations> localVarResp = locationsFindByRegionIdWithHttpInfo(regionId, pretty, depth, xContractNumber);
        return localVarResp.getData();
    }

    /**
     * List locations within regions
     * List locations by the region ID.
     * @param regionId The unique ID of the region. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * 
     * @return ApiResponse&lt;Locations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Locations> locationsFindByRegionIdWithHttpInfo(String regionId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        okhttp3.Call localVarCall = locationsFindByRegionIdValidateBeforeCall(regionId, pretty, depth, xContractNumber, null);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List locations within regions (asynchronously)
     * List locations by the region ID.
     * @param regionId The unique ID of the region. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsFindByRegionIdAsync(String regionId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback<Locations> callback) throws ApiException {

        okhttp3.Call localVarCall = locationsFindByRegionIdValidateBeforeCall(regionId, pretty, depth, xContractNumber, callback);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }
    /**
     * Build call for locationsFindByRegionIdAndId
     * @param regionId The unique ID of the region. (required)
     * @param locationId The unique ID of the location. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsFindByRegionIdAndIdCall(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations/{regionId}/{locationId}"
            .replaceAll("\\{" + "regionId" + "\\}", localVarApiClient.escapeString(regionId.toString()))
            .replaceAll("\\{" + "locationId" + "\\}", localVarApiClient.escapeString(locationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }
        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
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
    private okhttp3.Call locationsFindByRegionIdAndIdValidateBeforeCall(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback callback) throws ApiException {
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling locationsFindByRegionIdAndId(Async)");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling locationsFindByRegionIdAndId(Async)");
        }
        

        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdCall(regionId, locationId, pretty, depth, xContractNumber, callback);
        return localVarCall;

    }

    /**
     * Retrieve specified locations
     * Retrieve the properties of the specified location
     * @param regionId The unique ID of the region. (required)
     * @param locationId The unique ID of the location. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * 
     * @return Location
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Location locationsFindByRegionIdAndId(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        ApiResponse<Location> localVarResp = locationsFindByRegionIdAndIdWithHttpInfo(regionId, locationId, pretty, depth, xContractNumber);
        return localVarResp.getData();
    }

    /**
     * Retrieve specified locations
     * Retrieve the properties of the specified location
     * @param regionId The unique ID of the region. (required)
     * @param locationId The unique ID of the location. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * 
     * @return ApiResponse&lt;Location&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Location> locationsFindByRegionIdAndIdWithHttpInfo(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber) throws ApiException {
        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdValidateBeforeCall(regionId, locationId, pretty, depth, xContractNumber, null);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve specified locations (asynchronously)
     * Retrieve the properties of the specified location
     * @param regionId The unique ID of the region. (required)
     * @param locationId The unique ID of the location. (required)
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsFindByRegionIdAndIdAsync(String regionId, String locationId, Boolean pretty, Integer depth, Integer xContractNumber, final ApiCallback<Location> callback) throws ApiException {

        okhttp3.Call localVarCall = locationsFindByRegionIdAndIdValidateBeforeCall(regionId, locationId, pretty, depth, xContractNumber, callback);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }
    /**
     * Build call for locationsGet
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsGetCall(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback callback ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }
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

        if (xContractNumber != null) {
            localVarHeaderParams.put("X-Contract-Number", localVarApiClient.parameterToString(xContractNumber));
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
    private okhttp3.Call locationsGetValidateBeforeCall(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults , Map<String, String> filters,final ApiCallback callback) throws ApiException {
        

        okhttp3.Call localVarCall = locationsGetCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters,callback);
        return localVarCall;

    }

    /**
     * List locations
     * List the available locations for provisioning your virtual data centers.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return Locations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public Locations locationsGet(Boolean pretty, Integer depth, Integer xContractNumber,  String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        ApiResponse<Locations> localVarResp = locationsGetWithHttpInfo(pretty, depth, xContractNumber, orderBy, maxResults, filters);
        return localVarResp.getData();
    }

    /**
     * List locations
     * List the available locations for provisioning your virtual data centers.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
     * @param orderBy - Sorts the results alphanumerically in ascending order based on the specified property.
     * @param maxResults - Limits the number of results returned.
     * @param filters - Filters query parameters limit results to those containing a matching value for a specific property.
     * @return ApiResponse&lt;Locations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  * X-RateLimit-Remaining - The number of requests that can still be made without triggering a failure response. <br>  * X-RateLimit-Limit - The average number of requests per minute allowed. <br>  * X-RateLimit-Burst - The maximum number of concurrent API requests allowed. <br>  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient privileges), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), or 503 (maintenance). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Locations> locationsGetWithHttpInfo(Boolean pretty, Integer depth, Integer xContractNumber, String orderBy, Integer maxResults, Map<String, String> filters) throws ApiException {
        okhttp3.Call localVarCall = locationsGetValidateBeforeCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters, null);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List locations (asynchronously)
     * List the available locations for provisioning your virtual data centers.
     * @param pretty Controls whether the response is pretty-printed (with indentations and new lines). (optional, default to true)
     * @param depth Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on (optional, default to 0)
     * @param xContractNumber Users with multiple contracts must provide the contract number, for which all API requests are to be executed. (optional)
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
    public okhttp3.Call locationsGetAsync(Boolean pretty, Integer depth, Integer xContractNumber, String orderBy, Integer maxResults, Map<String, String> filters,final ApiCallback<Locations> callback) throws ApiException {

        okhttp3.Call localVarCall = locationsGetValidateBeforeCall(pretty, depth, xContractNumber,  orderBy, maxResults, filters, callback);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }
}