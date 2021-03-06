/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiException;
import com.ionoscloud.model.Error;
import com.ionoscloud.model.Location;
import com.ionoscloud.model.Locations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationApi
 */
@Ignore
public class LocationApiTest {

    private final LocationApi api = new LocationApi();

    
    /**
     * List Locations within a region
     *
     * Retrieve a list of Locations within a world&#39;s region
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locationsFindByRegionIdTest() throws ApiException {
        String regionId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Locations response = api.locationsFindByRegionId(regionId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Location
     *
     * Retrieves the attributes of a given location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locationsFindByRegionIdAndIdTest() throws ApiException {
        String regionId = null;
        String locationId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Location response = api.locationsFindByRegionIdAndId(regionId, locationId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Locations
     *
     * Retrieve a list of Locations. This list represents where you can provision your virtual data centers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locationsGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Locations response = api.locationsGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
}
